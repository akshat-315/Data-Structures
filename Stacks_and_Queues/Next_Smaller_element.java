package Stacks_and_Queues;

import java.util.Stack;

public class Next_Smaller_element {
    public static void immediateSmaller(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            if (!st.isEmpty()) {
                if (arr[i] > st.peek()) {
                    int x = st.peek();
                    st.pop();
                    st.push(arr[i]);
                    arr[i] = x;
                } else {
                    st.pop();
                    st.push(arr[i]);
                    arr[i] = -1;
                }
            } else {
                st.push(arr[i]);
                arr[i] = -1;
            }
        }
    }
}
