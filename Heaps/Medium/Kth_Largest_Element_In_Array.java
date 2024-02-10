package Heaps.Medium;

import java.util.PriorityQueue;

public class Kth_Largest_Element_In_Array {
    public int findKthLargest(int[] input, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < input.length; i++) {
            pq.add(input[i]);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        return pq.poll();
    }
}
