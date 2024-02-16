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
    public int widthOfBinaryTree(TreeNode root) {
          if (root == null) {
            return 0;
        }

        int maxWidth = 1;

        Deque<Pair<TreeNode, Integer>> nodes = new ArrayDeque<>();
        nodes.push(new Pair(root, 0));

        while(!nodes.isEmpty()) {
            int size = nodes.size();

            if (size > 1) {
                maxWidth = Math.max(maxWidth, nodes.peekFirst().getValue() - nodes.peekLast().getValue() + 1);
            }

            for(int i = 0; i < size; i++) {
                Pair<TreeNode, Integer> node = nodes.pollLast();

                TreeNode treeNode = node.getKey();
                int pos = node.getValue();

                if (treeNode.left != null) {
                    nodes.push(new Pair(treeNode.left, 2 * pos + 1));
                }

                if (treeNode.right != null) {
                    nodes.push(new Pair(treeNode.right, 2 * pos + 2));
                }
            }
        }

        return maxWidth;
    }
}