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
     public int Height(TreeNode root){
       if(root == null) return 0;

       return Math.max(Height(root.left), Height(root.right)) +1;
     }
    public boolean isBalanced(TreeNode root) {

        // last Case i.e case 3   
        if(root == null) return true;
      
      int lh = Height(root.left);
      int Rh = Height(root.right);

      return (Math.abs(lh-Rh)<=1 && isBalanced(root.left)&& isBalanced(root.right));

    }
}