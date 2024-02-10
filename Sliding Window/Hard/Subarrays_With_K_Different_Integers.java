package Sliding

Window.Hard;

public class Subarrays_With_K_Different_Integers {
    private int find(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int count = 0;
        int l = 0;
        int r = 0;
        int n = nums.length;
        while (r < n) {
            map.put(nums[r], map.getOrDefault(nums[r], 0) + 1);
            while (map.size() > k) {
                map.put(nums[l], map.get(nums[l]) - 1);
                if (map.get(nums[l]) == 0) {
                    map.remove(nums[l]);
                }
                l++;
            }
            count += r - l + 1;
            ;
            r++;
        }
        return count;
    }

    public int subarraysWithKDistinct(int[] nums, int k) {
        return find(nums, k) - fin
}
