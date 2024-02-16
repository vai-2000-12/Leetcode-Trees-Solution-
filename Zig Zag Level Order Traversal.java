import java.util.*;

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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        Stack<Integer> st = new Stack<>(); 
        boolean flag = false;

          if (root == null) {
            return res;
          }
        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> currentLevel = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode curr = q.poll();

                if (flag) {
                    st.add(curr.val);
                } else {
                    currentLevel.add(curr.val);
                }

                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }

            if (flag) {
                while (!st.isEmpty()) {
                    currentLevel.add(st.pop());
                }
            }

            res.add(currentLevel);
            flag = !flag;
        }

        return res;
    }
}