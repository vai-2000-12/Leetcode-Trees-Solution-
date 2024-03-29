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
    public List<Integer> preorderTraversal(TreeNode root) {
      List<Integer> res = new ArrayList<Integer>();

       Stack <TreeNode> stack = new Stack();
        
      stack.add(root);
        
        while(!stack.isEmpty()){                     
            TreeNode currNode = stack.peek();
            stack.pop();   
      
        if( currNode != null){
            res.add( currNode.val);
            stack.add( currNode.right);
            stack.add( currNode.left);
        }
       }
      return res; 
    }
}