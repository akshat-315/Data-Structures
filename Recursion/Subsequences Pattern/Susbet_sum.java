import java.util.ArrayList;
import java.util.List;

public class Susbet_sum {
    public static void findSum(int ind, int sum, int[] arr, ArrayList<Integer> ans) {
        if (ind == arr.length) {
            ans.add(sum);
            return;
        }

        // pick the element
        findSum(ind + 1, sum + arr[ind], arr, ans);

        // Do-not pick the element
        findSum(ind + 1, sum, arr, ans);
    }

    public static ArrayList<Integer> subsetSum(int num[]) {
        ArrayList<Integer> ans = new ArrayList<>();
        findSum(0, 0, num, ans);
        Collections.sort(ans);
        return ans;
    }
}
