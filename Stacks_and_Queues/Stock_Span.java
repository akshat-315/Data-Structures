package Stacks_and_Queues;

import java.util.Stack;

public class Stock_Span {
    public static int[] findStockSpans(int[] prices) {
        int n = prices.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        ans[0] = 1;
        st.push(0);
        for (int i = 1; i < n; i++) {
            while (!st.isEmpty() && prices[st.peek()] < prices[i])
                st.pop();
            if (st.isEmpty()) {
                ans[i] = i + 1;
            } else {
                ans[i] = i - st.peek();
            }
            st.push(i);
        }

        return ans;
    }
}
