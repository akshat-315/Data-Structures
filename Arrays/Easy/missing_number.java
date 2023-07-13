package Arrays;

public class missing_number {
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int totalSum = n * (n + 1) / 2;

        for (int i = 0; i < n; i++) {
            totalSum -= nums[i];
        }
        return totalSum;
    }

    public static void main(String args[]) {
        int nums[] = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
        int ans = missingNumber(nums);
        System.out.print("The missing number is : " + ans);
    }
}
