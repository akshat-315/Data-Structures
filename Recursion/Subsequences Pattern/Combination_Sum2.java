import java.util.*;

public class Combination_Sum2 {
    public void findComb(int index, int target, int[] candidates, List<List<Integer>> ans, List<Integer> ds) {

        if (target == 0) {
            ans.add(new ArrayList(ds));
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            if (i > index && candidates[i] == candidates[i - 1])
                continue;
            if (candidates[i] > target)
                break;

            ds.add(candidates[i]);
            findComb(i + 1, target - candidates[i], candidates, ans, ds);
            ds.remove(ds.size() - 1);
        }

    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        findComb(0, target, candidates, ans, new ArrayList<>());
        return ans;
    }
}
