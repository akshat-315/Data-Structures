import java.util.ArrayList;
import java.util.List;

public class Combination_Sum3 {
    public void findComb(int start, int k, int n, List<List<Integer>> ans, ArrayList<Integer> ds) {
        if (k == 0 && n == 0) {
            ans.add(new ArrayList(ds));
            return;
        }

        for (int i = start; i <= 9; i++) {
            if (k <= 0 || n - i < 0)
                continue;
            ds.add(i);
            findComb(i + 1, k - 1, n - i, ans, ds);
            ds.remove(ds.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        findComb(1, k, n, ans, new ArrayList<>());
        return ans;
    }
}
