
/*********************************************************

 Following is the TreeNode structure:

 class TreeNode {
     int data;
     TreeNode left;
     TreeNode right;
     TreeNode() {
         this.data = 0;
         this.left = null;
         this.right = null;
     }
     TreeNode(int data) {
         this.data = data;
         this.left = null;
         this.right = null;
     }
     TreeNode(int data, TreeNode left, TreeNode right) {
         this.data = data;
         this.left = left;
         this.right = right;
     }
 };
 ********************************************************/

import java.util.*;

public class Solution {
    public static List<Integer> inord = new ArrayList<>();

    public static List<Integer> inOrder(TreeNode root) {

        if (root == null)
            return inord;

        inOrder(root.left);
        inord.add(root.data);
        inOrder(root.right);

        return inord;
    }

    public static List<Integer> post = new ArrayList<>();

    public static List<Integer> postOrder(TreeNode root) {
        if (root == null)
            return post;

        postOrder(root.left);
        postOrder(root.right);
        post.add(root.data);

        return post;
    }

    public static List<Integer> pre = new ArrayList<>();

    public static List<Integer> preOrder(TreeNode root) {

        if (root == null)
            return pre;

        pre.add(root.data);
        preOrder(root.left);
        preOrder(root.right);

        return pre;
    }

    public static List<List<Integer>> getTreeTraversal(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> pre = new ArrayList<>();
        List<Integer> inor = new ArrayList<>();
        List<Integer> pos = new ArrayList<>();

        pre = preOrder(root);
        inor = inOrder(root);
        pos = postOrder(root);

        ans.add(inor);
        ans.add(pre);
        ans.add(pos);

        return ans;

    }
}