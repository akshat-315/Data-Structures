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
    int maxLength = 0;

    public int HeightOfTree(TreeNode root) {
        if (root == null)
            return 0;

        int lh = HeightOfTree(root.left);
        int rh = HeightOfTree(root.right);
        return Math.max(lh, rh) + 1;
    }

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null)
            return 0;

        diameterOfBinaryTree(root.left);
        int lh = HeightOfTree(root.left);

        diameterOfBinaryTree(root.right);
        int rh = HeightOfTree(root.right);

        int diameter = lh + rh;
        return maxLength = Math.max(diameter, maxLength);
    }
}