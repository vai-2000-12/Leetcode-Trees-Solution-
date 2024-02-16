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
    public int minDepth(TreeNode root) {

      if(root == null)return 0;
       

      int lm = minDepth(root.left);
      int rm = minDepth(root.right);

      return (lm == 0 || rm == 0) ? lm + rm + 1: Math.min(lm, rm) + 1;
           
    }
}