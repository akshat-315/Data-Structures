package Stacks_and_Queues;

public class Trapping_Rainwater {
    public static long getTrappedWater(long[] height, int n) {
        // Soln 1. O(3N)
        // int[] leftBoundary = new int[n];
        // int[] rightBoundary = new int[n];

        // leftBoundary[0] = (int)arr[0];
        // rightBoundary[n-1] = (int)arr[n-1];

        // for(int i = 1; i<n; i++){
        // leftBoundary[i] = (int)Math.max(arr[i], leftBoundary[i-1]);
        // }

        // for(int i = n-2; i>=0; i--){
        // rightBoundary[i] = (int)Math.max(arr[i], rightBoundary[i+1]);
        // }

        // long trappedWater = 0;
        // for(int i = 0; i<n; i++){
        // long waterLevel = (int)Math.min(leftBoundary[i], rightBoundary[i]);
        // trappedWater += waterLevel - arr[i];
        // }
        // return trappedWater;

        // Soln 2. O(N)
        int n = height.length;
        int left = 0, right = n - 1;
        int res = 0;
        int maxLeft = 0, maxRight = 0;
        while (left <= right) {
            if (height[left] <= height[right]) {
                if (height[left] >= maxLeft) {
                    maxLeft = height[left];
                } else {
                    res += maxLeft - height[left];
                }
                left++;
            } else {
                if (height[right] >= maxRight) {
                    maxRight = height[right];
                } else {
                    res += maxRight - height[right];
                }
                right--;
            }
        }
        return res;
    }

}
