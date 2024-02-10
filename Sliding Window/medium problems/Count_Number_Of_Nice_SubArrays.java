package Sliding Window.medium problems;

public class Count_Number_Of_Nice_SubArrays {
    int count = 0, oddCount = 0, temp = 0;
    int i = 0, j = 0;
    int n = nums.length;while(j<n)
    {
        if (nums[j] % 2 != 0) {
            oddCount++;
            temp = 0;
        }

        while (oddCount == k) {
            temp++;
            if (nums[i] % 2 != 0) {
                oddCount--;
            }
            i++;
        }
        count += temp;
        j++;
    }return count;
}
