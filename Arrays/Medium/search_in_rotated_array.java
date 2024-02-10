package Arrays.Medium;


import java.util.HashSet;

public class search_in_rotated_array {
    public static int search(int[] nums, int target) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
            if (set.contains(target)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int nums[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        int ans = search(nums, target);
        System.out.print(ans);
    }
}
