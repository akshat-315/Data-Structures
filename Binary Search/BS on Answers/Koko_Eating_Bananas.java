public class Solution {
    public static int maximum(int[] v) {
        int n = v.length;
        int maxi = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            maxi = Math.max(v[i], maxi);
        }

        return maxi;
    }

    public static int totalHours(int[] v, int hourly) {
        int n = v.length;
        int total = 0;

        for (int i = 0; i < n; i++) {
            total += Math.ceil((double) v[i] / (double) hourly);
        }

        return total;
    }

    public static int minimumRateToEatBananas(int[] v, int h) {
        int low = 1, high = maximum(v);

        while (low <= high) {
            int mid = (low + high) / 2;
            int totalHours = totalHours(v, mid);
            if (totalHours <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
