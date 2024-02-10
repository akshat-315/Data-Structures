package Arrays.Easy;

public class second_largest_element_in_array {

    public static int[] getSecondOrderElements(int[] a) {
        int ans[] = new int[2];
        int n = a.length;
        int small = Integer.MAX_VALUE;
        int secSmall = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        int secLarge = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (a[i] > large) {
                secLarge = large;
                large = a[i];
            }
            if (a[i] < large && a[i] > secLarge) {
                secLarge = a[i];
            }

            if (a[i] < small) {
                secSmall = small;
                small = a[i];
            }
            if (a[i] > small && a[i] < secSmall) {
                secSmall = a[i];
            }
        }
        ans[0] = secLarge;
        ans[1] = secSmall;
        return ans;
    }

    public static void main(String args[]) {

        int arr1[] = { 2, 5, 1, 3, 0 };
        System.out.println("The Largest and Smallest element in the array is: " + getSecondOrderElements(arr1));

        // int arr2[] = { 8, 10, 5, 7, 9 };
        // System.out.println("The Largest element in the array is: " +
        // findLargestElement(arr2));
    }
}
