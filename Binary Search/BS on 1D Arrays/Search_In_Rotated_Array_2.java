public class Solution {
    public static boolean searchInARotatedSortedArrayII(int[] A, int key) {
        int n = A.length;
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (A[mid] == key) {
                return true;
            }

            if (A[low] <= A[mid]) {
                if (A[low] <= key && key <= A[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (A[mid] <= key && key <= A[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return false;
    }
}