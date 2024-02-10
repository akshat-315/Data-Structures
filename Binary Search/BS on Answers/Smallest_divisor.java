public class Solution {

    public static int sumByD(int[] arr, int div) {
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Math.ceil((double) (arr[i]) / (double) (div));
        }
        return sum;
    }

    public static int smallestDivisor(int arr[], int limit) {
        int n = arr.length;
        if (n > limit)
            return -1;

        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, arr[i]);
        }

        int low = 1, high = maxi;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (sumByD(arr, mid) <= limit) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}