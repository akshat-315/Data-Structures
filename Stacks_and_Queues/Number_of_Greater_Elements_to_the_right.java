package Stacks_and_Queues;

import java.util.Stack;

public class Number_of_Greater_Elements_to_the_right {
    public static int[] countGreater(int[] arr, int[] query) {
        int n = arr.length;
        int m = query.length;
        int ans[] = new int[m];

        for (int i = 0; i < m; i++) {
            int curr = arr[query[i]];
            Stack<Integer> st = new Stack<>();
            int last = n - 1;

            while (last != query[i]) {
                if (curr < arr[last]) {
                    st.push(arr[last]);
                }
                last--;
            }
            ans[i] = st.size();
        }
        return ans;
    }
}
