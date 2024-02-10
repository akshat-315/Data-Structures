package Arrays.Medium;


public class max_subarray_kadanes_algo {
    public int maxSubArray(int[] nums) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0)
                count++;
        }

        if (count == nums.length) {
            for (int i = 0; i < nums.length; i++) {
                if (maxsum < nums[i]) {
                    maxsum = nums[i];
                }
            }
            return maxsum;
        }

        for (int i = 0; i < nums.length; i++) {
            currsum += nums[i];
            if (currsum < 0) {
                currsum = 0;
            }
            maxsum = Math.max(currsum, maxsum);
        }
        return maxsum;
    }
}
