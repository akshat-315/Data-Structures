import java.util.ArrayList;

public class Solution {
    public static int canBeAllocated(ArrayList<Integer> arr, int pages) {
        int students = 1;
        int cntPages = 0;
        int n = arr.size();

        for (int i = 0; i < n; i++) {
            if (cntPages + arr.get(i) <= pages) {
                cntPages += arr.get(i);
            } else {
                students++;
                cntPages = arr.get(i);
            }
        }
        return students;
    }

    public static int findPages(ArrayList<Integer> arr, int n, int m) {
        if (m > n)
            return -1;

        int maxi = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < arr.size(); i++) {
            maxi = Math.max(maxi, arr.get(i));
            sum += arr.get(i);
        }

        int low = maxi, high = sum;

        while (low <= high) {
            int mid = (low + high) / 2;

            int students = canBeAllocated(arr, mid);
            if (students > m)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return low;
    }
}