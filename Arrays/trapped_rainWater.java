package Arrays;

public class trapped_rainWater {
    public static int trapped(int[] height) {
        int n = height.length;

        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }

    public static void main(String args[]) {
        int height[] = { 4, 2, 0, 3, 2, 5 };
        int answer = trapped(height);
        System.out.print("The total volume of trapped rainwater is : " + answer);

    }
}
