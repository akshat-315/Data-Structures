package Stacks_and_Queues;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class sliding_maximum {

    public static int[] maxSlidingWindow(int[] arr, int n, int k) {
        int[] ans = new int[n - k + 1];
        Deque<Integer> dq = new ArrayDeque<>();
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!dq.isEmpty() && dq.peek() == i - k) {
                dq.poll();
            }

            while (!dq.isEmpty() && arr[i] > arr[dq.peekLast()]) {
                dq.pollLast();
            }

            dq.offer(i);
            if (i >= k - 1) {
                ans[j++] = arr[dq.peek()];
            }
        }
        return ans;

    }

    public static void main(String args[]) {
        int i, j, n, k = 3, x;

        int arr[] = { 4, 0, -1, 3, 5, 3, 6, 8 };
        n = arr.length;
        int[] ans = new int[n - k + 1];
        ans = maxSlidingWindow(arr, n, k);
        System.out.println("Maximum element in every " + k + " window ");
        for (i = 0; i < ans.length; i++)
            System.out.print(ans[i] + "  ");

    }
}
