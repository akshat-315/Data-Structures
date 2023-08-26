import java.util.ArrayList;
import java.util.List;

public class Permutations_of_Array {
    // public void findPermute(int[] nums, List<List<Integer>> ans, List<Integer>
    // ds, boolean[] freq){
    // if(ds.size() == nums.length){
    // ans.add(new ArrayList(ds));
    // return;
    // }

    // for(int i = 0; i<nums.length; i++){
    // if(!freq[i]){
    // freq[i] = true;
    // ds.add(nums[i]);
    // findPermute(nums, ans, ds, freq);
    // ds.remove(ds.size()-1);
    // freq[i] = false;
    // }
    // }
    // }

    public void findPermute2(int ind, int[] nums, List<List<Integer>> ans) {
        if (ind == nums.length) {
            List<Integer> ds = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                ds.add(nums[i]);
            }
            ans.add(new ArrayList<>(ds));
            return;
        }

        for (int i = ind; i < nums.length; i++) {
            swap(i, ind, nums);
            findPermute2(ind + 1, nums, ans);
            swap(i, ind, nums);
        }
    }

    public void swap(int i, int j, int[] nums) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        // List<Integer> ds = new ArrayList<>();
        // boolean[] freq = new boolean[nums.length];
        // findPermute(nums, ans, ds, freq);
        findPermute2(0, nums, ans);
        return ans;
    }
}
