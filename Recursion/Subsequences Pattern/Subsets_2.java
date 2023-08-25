import java.util.ArrayList;
import java.util.List;

public class Subsets_2 {
    public void findSub(int ind, int[] arr, ArrayList<Integer> ds, List<List<Integer>> ans) {
        ans.add(new ArrayList<>(ds));

        for (int i = ind; i < arr.length; i++) {
            if (i > ind && arr[i] == arr[i - 1])
                continue;
            ds.add(arr[i]);
            findSub(i + 1, arr, ds, ans);
            ds.remove(ds.size() - 1);
        }
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        findSub(0, nums, new ArrayList<>(), ans);
        return ans;
    }
}
