import java.util.*;
import java.io.*;

public class Solution {
    public static int findAllSubarraysWithGivenSum(int arr[], int s) {
        int sum = arr[0];
        int ans = 0;

        int i = 0, j = 0;
        while (j < arr.length) {
            if (sum == s) {
                ans++;
            }

            if (sum > s) {
                sum -= arr[i];
                i++;
            }

            else {
                j++;
                if (j < arr.length)
                    sum += arr[j];
            }
        }
        return ans;
    }
}