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
    public TreeNode reverseOddLevels(TreeNode root) {
      Queue <TreeNode> q = new LinkedList<TreeNode>();
      q.add(root);
       int count =0;
      while(!q.isEmpty()){
        int size = q.size();
         TreeNode[]arr = new TreeNode[size];
         count++;
         for( int i =0 ; i< size ; i++){
            arr[i]= q.poll(); 

          if(arr[i].right != null) q.add(arr[i].right);
          if(arr[i].left != null) q.add(arr[i].left);
         }
         if(count %2 == 0){
           for(int i =0 ; i < size/2 ;i++){
                   int temp = arr[i].val;
                  arr[i].val = arr[size-i-1].val;
                  arr[size-i-1].val = temp;
           }
         } 
      }
 return root;
    }
}