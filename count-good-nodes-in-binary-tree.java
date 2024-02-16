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
  int max = Integer.MIN_VALUE;
  int count = 0;
    public int goodNodes(TreeNode root) {
     call(root, max);
     return count;   

    }
    void call(TreeNode root, int max){
       if(root == null ) return ; 
       if(root.val >= max) count++;
       max = Math.max(max, root.val);
       call(root.left, max);
       call(root.right, max);
      
    }
}