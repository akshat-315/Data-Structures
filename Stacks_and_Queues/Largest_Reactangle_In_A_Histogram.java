package Stacks_and_Queues;

import java.util.ArrayList;
import java.util.Stack;

// Time Complexity -> O(N) && Space Complexity -> O(3N)

public class Largest_Reactangle_In_A_Histogram {
    public static int largestRectangle(ArrayList<Integer> heights) {
        int n = heights.size();
        int[] left = new int[n];
        int[] right = new int[n];

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && heights.get(st.peek()) >= heights.get(i))
                st.pop();

            if (st.isEmpty())
                left[i] = 0;
            else
                left[i] = st.peek() + 1;

            st.push(i);
        }

        while (!st.isEmpty())
            st.pop();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && heights.get(st.peek()) >= heights.get(i))
                st.pop();

            if (st.isEmpty())
                right[i] = n - 1;
            else
                right[i] = st.peek() - 1;

            st.push(i);
        }

        int maxi = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, heights.get(i) * (right[i] - left[i] + 1));
        }
        return maxi;
    }
}
