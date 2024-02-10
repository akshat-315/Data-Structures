import java.util.*;
import java.io.*;

public class Solution {

    public static int daysRequired(int[] arr, int capacity) {
        int days = 1, load = 0;

        for (int i = 0; i < arr.length; i++) {
            if (load + arr[i] > capacity) {
                load = arr[i];
                days += 1;
            } else {
                load += arr[i];
            }
        }
        return days;
    }

    public static int leastWeightCapacity(int[] weights, int d) {
        int maxi = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < weights.length; i++) {
            maxi = Math.max(maxi, weights[i]);
            sum += weights[i];
        }

        int low = maxi, high = sum;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (daysRequired(weights, mid) <= d)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return low;
    }
}