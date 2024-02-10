/*********************************************
 * 
 * Following is the TreeNode class structure
 * 
 * class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * 
 * TreeNode(int val) {
 * this.val = val;
 * this.left = null;
 * this.right = null;
 * }
 * }
 * 
 *********************************************/

public class Solution {
    public static boolean solve(TreeNode leftSide, TreeNode rightSide) {
        if (leftSide == null && rightSide == null) {
            return true;
        }
        if (leftSide == null || rightSide == null) {
            return false;
        }
        return solve(leftSide.left, rightSide.right) && solve(leftSide.right, rightSide.left);

    }

    public static boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return solve(root.left, root.right);
    }
}
