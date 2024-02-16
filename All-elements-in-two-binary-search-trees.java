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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {

     List<Integer> l1 = new ArrayList<>();
     List<Integer> l2 = new ArrayList<>();
     
     List<Integer> result = new ArrayList<>();
       Inorder(root1, l1);
       Inorder(root2, l2);
        
        int i=0, j = 0;
        
        while (i<l1.size() && j<l2.size()){
            if (l1.get(i) <= l2.get(j)) {
                result.add(l1.get(i));
                i++;
            } else {
                result.add(l2.get(j));
                j++;
            }
        }
        
        while (i<l1.size()) {
            result.add(l1.get(i));
            i++;
        }
        
        while (j<l2.size()) {
            result.add(l2.get(j));
            j++;
        }
      return result;
     
    }
    void Inorder(TreeNode root , List<Integer>l){
       if(root == null) return;

       Inorder(root.left, l);
       l.add(root.val);
       Inorder(root.right, l);
    }
}