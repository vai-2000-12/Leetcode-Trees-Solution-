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
    int res = 0;
    public int findTilt(TreeNode root) {
    
       PostOrder(root);
       return  res;
    }

    private int PostOrder(TreeNode root){
     if(root == null){
        return 0;
     }
      
     int l1 = PostOrder(root.left);
     int l2 = PostOrder(root.right);
     res += Math.abs(l1 - l2);
  
      return l1 + l2 + root.val;
    }
}