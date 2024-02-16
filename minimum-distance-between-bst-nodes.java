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
    List<Integer> arr = new ArrayList<>();
    int min = Integer.MAX_VALUE;

    public int minDiffInBST(TreeNode root) { 
    Inorder(root);

    for( int i = 0 ; i < arr.size()-1 ; i++){
      min = Math.min(min, arr.get(i+1) - arr.get(i));
    }
      return min;
  }

    public void Inorder(TreeNode root){
      if(root == null) return;
       
       Inorder(root.left);
       arr.add(root.val);
       Inorder(root.right);

    }
}  