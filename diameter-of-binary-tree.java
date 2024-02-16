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
    public int diameterOfBinaryTree(TreeNode root) {

    if(root == null){
       return 0;
    }

    int op1 = diameterOfBinaryTree(root.left);
    int op2 = diameterOfBinaryTree(root.right);
    int op3 =  Height(root.left) + Height(root.right);
          
    int max = Math.max(op1, Math.max(op2, op3));
      
      return max;    
    } 

    public int Height(TreeNode root){
     if(root == null){
        return 0;
     }
     return 1 + Math.max(Height(root.left) , Height(root.right));
  }  
}