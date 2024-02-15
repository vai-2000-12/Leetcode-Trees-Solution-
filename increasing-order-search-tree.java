import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Solution {
    public TreeNode increasingBST(TreeNode root) {
        List<Integer> inOrderList = inOrderTraversal(root);
        return createSkewedTree(inOrderList, 0);
    }

    public TreeNode createSkewedTree(List<Integer> inOrderList, int index) {
        if (index >= inOrderList.size()) {
            return null;
        }

        TreeNode newNode = new TreeNode(inOrderList.get(index));
        newNode.right = createSkewedTree(inOrderList, index + 1);
        
        return newNode;
    }

    public List<Integer> inOrderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inOrder(root, result);
        return result;
    }

    public void inOrder(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }

        inOrder(root.left, result);
        result.add(root.val);
        inOrder(root.right, result);
    }
}