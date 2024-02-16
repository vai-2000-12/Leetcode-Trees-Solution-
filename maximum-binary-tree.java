/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return constructBTree(nums, 0, nums.length);
    }

    public TreeNode constructBTree(int[] nums, int left, int right) {
        if (left == right) return null;

        int max = getMax(nums, left, right);

        TreeNode root = new TreeNode(nums[max]);

        root.left = constructBTree(nums, left, max);
        root.right = constructBTree(nums, max + 1, right);

        return root;
    }

    public int getMax(int[] nums, int left, int right) {
        int max_indx = left;

        for (int i = left; i < right; i++) {
            if (nums[max_indx] < nums[i])
                max_indx = i;
        }
        return max_indx;
    }
}