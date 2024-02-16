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
    public int maxLevelSum(TreeNode root) {
        int max = Integer.MIN_VALUE;
        int level =0;
        int maxLevel = 0;

        Queue<TreeNode> q = new LinkedList<TreeNode>();
        List list  = new  ArrayList<>();
   
        q.add(root);
        while(!q.isEmpty()){
          int size = q.size();
          int sum = 0; 

         for(int i =0; i < size ; i++){
          TreeNode curr = q.poll();
          
          sum+=curr.val;

          if(curr.left != null) q.add(curr.left);
          if(curr.right != null ) q.add(curr.right);
         }
         level++;

         if(sum > max){
           max = sum;
           maxLevel = level;
         }
        }
       return maxLevel;
    }
}