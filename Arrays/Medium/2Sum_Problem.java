class Solution {
    public int[] twoSum(int[] nums, int target) {
        Arrays.sort(nums);

        int[] ans = new int[2];
        int n = nums.length;

        int i = 0;
        int j = n - 1;

        while (i < n && i < j) {
            int sum = nums[i] + nums[j];
            if (sum == target) {
                ans[0] = nums[i];
                ans[1] = nums[j];
            } else if (sum < target)
                i++;

            else
                j--;
        }

        return ans;
    }
}