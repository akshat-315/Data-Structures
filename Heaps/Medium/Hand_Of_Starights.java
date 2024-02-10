package Heaps.Medium;

import java.util.PriorityQueue;

public class Hand_Of_Starights {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < hand.length; i++) {
            pq.add(hand[i]);
        }

        while (!pq.isEmpty()) {
            int top = pq.poll();
            for (int i = 1; i < groupSize; i++) {
                if (!pq.remove(top + i))
                    return false;
            }
        }
        return true;
    }
}
