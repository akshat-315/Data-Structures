
/*********************************************

 Following is the TreeNode class structure

 class TreeNode {
     int data;
     TreeNode left;
     TreeNode right;

     TreeNode(int data) {
         this.data = data;
         this.left = null;
         this.right = null;
     }
 }

 *********************************************/

import java.util.*;

class Pair {
    int hd;
    TreeNode node;

    public Pair(int _hd, TreeNode _node) {
        hd = _hd;
        node = _node;
    }
}

public class Solution {
    public static List<Integer> getTopView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if (root == null)
            return ans;

        Map<Integer, Integer> map = new TreeMap<>();
        Queue<Pair> queue = new LinkedList<>();

        queue.offer(new Pair(0, root));
        while (!queue.isEmpty()) {
            Pair pair = queue.poll();
            int level = pair.hd;
            TreeNode temp = pair.node;

            if (map.get(level) == null)
                map.put(level, temp.data);

            if (temp.left != null)
                queue.offer(new Pair(level - 1, temp.left));
            if (temp.right != null)
                queue.offer(new Pair(level + 1, temp.right));
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            ans.add(entry.getValue());
        }

        return ans;
    }
}
