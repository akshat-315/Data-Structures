/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        if (root == null)
            return maxSum;
        findSum(root);
        return maxSum;
    }

    private int findSum(TreeNode root) {
        if (root == null)
            return 0;

        int leftSum = Math.max(0, findSum(root.left));
        int rightSum = Math.max(0, findSum(root.right));

        maxSum = Math.max(maxSum, root.val + leftSum + rightSum);

        return root.val + Math.max(leftSum, rightSum);
    }
}