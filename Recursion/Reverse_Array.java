package Recursion;

public class Reverse_Array {
    public static void Reverse(int[] arr, int i, int n) {
        if (i >= n / 2) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[n];
        arr[n] = temp;
        Reverse(arr, i + 1, n);
        return;
    }
}
