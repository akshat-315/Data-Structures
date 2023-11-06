public class Solution {

    public static boolean possibility(int[] arr, int days, int k, int m) {
        int count = 0;
        int noOfB = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= days) {
                count++;
            } else {
                noOfB += (count / k);
                count = 0;
            }
        }
        noOfB += (count / k);
        return noOfB >= m;
    }

    public static int roseGarden(int[] arr, int k, int m) {
        long val = (long) (m * k);
        int maxi = Integer.MIN_VALUE, mini = Integer.MAX_VALUE;
        int n = arr.length;

        if (val > n)
            return -1;

        for (int i = 0; i < n; i++) {
            mini = Math.min(mini, arr[i]);
            maxi = Math.max(maxi, arr[i]);
        }

        int low = mini, high = maxi;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (possibility(arr, mid, k, m)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}