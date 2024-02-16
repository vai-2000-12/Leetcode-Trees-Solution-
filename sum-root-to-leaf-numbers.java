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
    public int sumNumbers(TreeNode root) {
           Helper(root , 0);
            return res;
    } 
     public void Helper(TreeNode root , int num){
         if ( root == null ) return;
          num = (10 * num) + root.val;

          if(root.left == null && root.right == null) {
                 res+=num;
          }
          Helper(root.left , num); 
          Helper(root.right, num);
     }
}