public class Max_Consecutive_OneIII {
    public int longestOnes(int[] nums, int k) {
        int count = 0, i = 0, j = 0;
        int maxLen = Integer.MIN_VALUE;

        while (j < nums.length) {
            if (nums[j] == 0)
                count++;

            while (count > k) {
                if (nums[i] == 0)
                    count--;
                i++;
            }
            maxLen = Math.max(maxLen, j - i + 1);
            j++;
        }
        return maxLen;
    }
}
