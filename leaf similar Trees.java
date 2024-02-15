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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leaf1 = leafSequence(root1);
        List<Integer> leaf2 = leafSequence(root2);

        return leaf1.equals(leaf2); 
    }
     public List<Integer> leafSequence(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();

        if (root == null) return res;
        Queue<TreeNode> q = new LinkedList<>();
         s.add(root);

        while (!s.isEmpty()) {
            TreeNode curr = s.pop();

            // Condition to check if it's a Leaf Node:
            if (curr.left == null && curr.right == null) {
                res.add(curr.val);
            }
            if (curr.left != null) s.push(curr.left);
            if (curr.right != null) s.push(curr.right);
        }
        return res;
     }
}