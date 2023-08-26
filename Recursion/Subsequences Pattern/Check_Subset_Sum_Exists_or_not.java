public class Check_Subset_Sum_Exists_or_not {
    static boolean ans = false;

    public static void findAns(int ind, int sum, int target, int[] a) {
        if (ans == true || sum > target)
            return;

        if (ind == a.length) {
            if (sum == target)
                ans = true;
            return;
        }

        findAns(ind + 1, sum + a[ind], target, a);
        findAns(ind + 1, sum, target, a);
    }

    public static boolean isSubsetPresent(int n, int k, int[] a) {
        findAns(0, 0, k, a);
        return ans;
    }
}
