class Solution {
    long ans = 0l;
    long TotalAns = 0l;
    int MOD = 1000000007;

    public int maxProduct(TreeNode root) {
        TotalAns = DFS(root);
        DFS(root);
        return (int)(ans % MOD);
    }

    // Total Sum of Complete Binary Tree
    public int DFS(TreeNode root) {
        if (root == null) return 0;

        int currSum = root.val + DFS(root.left) + DFS(root.right);

        ans = Math.max(ans, (TotalAns -currSum) * currSum);

        return currSum;
    }
}