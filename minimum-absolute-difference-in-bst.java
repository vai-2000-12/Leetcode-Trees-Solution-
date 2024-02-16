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
   int min = Integer.MAX_VALUE;
   ArrayList<Integer> arr = new ArrayList<Integer>();

    public int getMinimumDifference(TreeNode root) {
      Inorder(root);
      
      for( int i = 1 ; i < arr.size() ; i++){
        min  = Math.min(min, arr.get(i)-arr.get(i-1));
      }
      return min;
    }

    public void Inorder(TreeNode root){
        if(root == null) return ;

        Inorder(root.left);
        arr.add(root.val);
        Inorder(root.right);

    }
}