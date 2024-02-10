import java.util.*;

public class aaa {
    public static int func(int[] arr, int k) {
        int n = arr.length;
        int sum = 0;
        int i = j = 0;
        int[] ans = new int[k];
        int mini = Integer.MIN_VALUE;

        while (j < n) {
            if (i - j + 1 < k) {
                sum += arr[i];
            }

            mini = Math.min(mini, sum);
            sum -= arr[i];
            i++;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 2, 1, -4, 6, 3 };
        int k = 3;
        // int[] ans = new int[k];
        int ans = func(arr, k);
        System.out.println(ans);

    }
}
