public class Solution {
    public static int findMin(int[] arr) {
        int n = arr.length;
        int low = 0, high = n - 1;
        int mini = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = (low + high) / 2;

            mini = Math.min(mini, arr[mid]);

            if (arr[low] <= arr[mid]) {
                if (arr[mid] <= mini && mini <= arr[high]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (arr[low] <= mini && mini <= arr[mid]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return mini;
    }
}