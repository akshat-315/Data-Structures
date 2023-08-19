package Stacks_and_Queues;

import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class Next_greater_Element_if_array_is_Circular {
    public static int[] nextGreaterElementII(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] nge = new int[n];

        int j = n - 1;
        while (j >= 0) {
            st.push(arr[j]);
            j--;
        }

        for (int i = n - 1; i >= 0; i--) {
            while (st.isEmpty() == false && arr[i] >= st.peek()) {
                st.pop();
            }
            if (st.isEmpty() == false) {
                nge[i] = st.peek();
            } else
                nge[i] = -1;
            st.push(arr[i]);
        }

        Collections.reverse(Arrays.asList(nge));

        return nge;
    }
}
