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
    public TreeNode bstFromPreorder(int[] preorder) {
     TreeNode root = new TreeNode(preorder[0]);

      if(preorder == null || preorder.length == 0){
         return null;
      }
    
      for( int i = 1 ; i < preorder.length; i++){
         addToTree(root , preorder[i]);     
      } 
      
      return root;
    }

   
   public void addToTree(TreeNode n, int val) {
        if (val < n.val) {
            if (n.left == null) {
                n.left = new TreeNode(val);                
            } else {
                addToTree(n.left, val);
            }
        } else {
            if (n.right == null) {
                n.right = new TreeNode(val);
            } else {
                addToTree(n.right, val);
            }
        }
    }
}