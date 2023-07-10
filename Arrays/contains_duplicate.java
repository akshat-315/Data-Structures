package Arrays;

import java.util.HashSet;

public class contains_duplicate {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            } else
                set.add(nums[i]);
        }
        return false;
    }

    public static void main(String args[]) {
        int nums[] = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
        boolean ans = containsDuplicate(nums);
        System.out.print(ans);
    }
}
