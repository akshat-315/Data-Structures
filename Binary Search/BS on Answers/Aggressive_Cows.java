import java.util.*;

public class Solution {

    public static boolean canBePlaced(int[] arr, int dist, int k) {
        int cntCows = 1;
        int last = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - last >= dist) {
                cntCows++;
                last = arr[i];
            }
            if (cntCows >= k)
                return true;
        }
        return false;
    }

    public static int aggressiveCows(int[] stalls, int k) {
        int n = stalls.length;

        Arrays.sort(stalls);

        int range = stalls[n - 1] - stalls[0];

        int low = 1, high = range;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (canBePlaced(stalls, mid, k) == false)
                high = mid - 1;

            else
                low = mid + 1;
        }
        return high;
    }
}