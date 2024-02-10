package Arrays.Easy;

public class longest_subarray_with_maxsum_k {

    public static int longestSubarrayWithSumK(int[] a, long k) {
        int n = a.length;
        int i = 0, j = 0;
        long sum = a[0];
        int maxLen = Integer.MIN_VALUE;

        while (j < n) {

            while (i <= j && sum > k) {
                sum -= a[i];
                i++;
            }

            if (sum == k) {
                maxLen = Math.max(maxLen, j - i + 1);
            }

            j++;
            if (j < n)
                sum += a[j];
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] a = { 2, 3, 5, 1, 9 };
        long k = 10;
        int len = longestSubarrayWithSumK(a, k);
        System.out.println("The length of the longest subarray is: " + len);
    }
}
