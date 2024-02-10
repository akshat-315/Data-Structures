import java.util.*;

public class Solution {
    public static ArrayList<Integer> printLeadersBruteForce(int[] arr, int n) {

        ArrayList<Integer> ans = new ArrayList<>();

        // Last element of an array is always a leader,
        // push into ans array.
        int max = arr[n - 1];

        ans.add(arr[n - 1]);

        // Start checking from the end whether a number is greater
        // than max no. from right, hence leader.
        for (int i = n - 2; i >= 0; i--)
            if (arr[i] > max) {
                ans.add(arr[i]);
                max = arr[i];
            }
        Collections.sort(ans);
        return ans;

    }
}