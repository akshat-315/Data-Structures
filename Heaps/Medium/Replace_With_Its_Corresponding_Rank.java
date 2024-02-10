package Heaps.Medium;
import java.util.*;

public class Replace_With_Its_Corresponding_Rank {
    public static List<Integer> replaceWithRank(List<Integer> arr, int n) {
        List<Integer> ans = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Map<Integer, Integer> map = new HashMap<>();
        int rank = 1;

        for (int i = 0; i < arr.size(); i++) {
            pq.add(arr.get(i));
        }

        while (!pq.isEmpty()) {
            int top = pq.peek();
            if (!map.containsKey(top)) {
                map.put(pq.poll(), rank);
                rank++;
            } else {
                pq.poll();
            }
        }

        for (int i = 0; i < arr.size(); i++) {
            ans.add(map.get(arr.get(i)));
        }

        return ans;
    }
}
