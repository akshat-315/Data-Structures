package Sliding Window.medium problems;

public class Max_Of_All_SubArrays_Of_Size_K {
    public static ArrayList<Integer> maxOfSubarray(ArrayList<Integer> nums, int n, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        int maxEl = Integer.MIN_VALUE;
        int i = 0, j = 0;
        while (j < n) {
            maxEl = Math.max(maxEl, nums.get(j));

            if (j - i + 1 < k)
                j++;
            else if (j - i + 1 == k) {
                ans.add(maxEl);

                if (nums.get(i) != maxEl) {
                    i++;
                    j++;
                }

                else if (nums.get(i) == maxEl) {
                    i++;
                    j = i;
                    maxEl = 0;
                }
            }
        }
        return ans;
    }
}
