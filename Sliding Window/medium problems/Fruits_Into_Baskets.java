import java.util.HashMap;
import java.util.Map;

public class Fruits_Into_Baskets {
    public class Solution {
        public static int findMaxFruits(int[] tree, int n) {
            Map<Integer, Integer> count = new HashMap<>();
            int i = 0, j;
            for (j = 0; j < tree.length; ++j) {
                count.put(tree[j], count.getOrDefault(tree[j], 0) + 1);
                if (count.size() > 2) {
                    count.put(tree[i], count.get(tree[i]) - 1);
                    count.remove(tree[i++], 0);
                }
            }
            return j - i;
        }
    }
}
