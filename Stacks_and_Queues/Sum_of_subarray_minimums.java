package Stacks_and_Queues;

import java.util.*;
import java.io.*;

class Pair {
    int element;
    int numMin;

    Pair(int ele, int nm) {
        element = ele;
        numMin = nm;
    }
}

public class Sum_of_subarray_minimums {
    public static int sumSubarrayMins(int[] arr) {
        int[] left = new int[arr.length];
        int[] right = new int[arr.length];

        ArrayDeque<Pair> st1 = new ArrayDeque<>();
        ArrayDeque<Pair> st2 = new ArrayDeque<>();

        // filling our left array
        for (int i = 0; i < arr.length; i++) {
            int curr_ele = arr[i];
            int count = 1;
            while (st1.size() != 0 && st1.peek().element > curr_ele) {
                count += st1.peek().numMin;
                st1.pop();
            }
            st1.push(new Pair(curr_ele, count));
            left[i] = count;
        }

        // filling right array
        for (int i = arr.length - 1; i >= 0; i--) {
            int curr_ele = arr[i];
            int count = 1;
            while (st2.size() != 0 && st2.peek().element >= curr_ele) {
                count += st2.peek().numMin;
                st2.pop();
            }
            st2.push(new Pair(curr_ele, count));
            right[i] = count;
        }

        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans = (ans + left[i] * right[i] * arr[i]);
        }
        return ans;
    }
}
