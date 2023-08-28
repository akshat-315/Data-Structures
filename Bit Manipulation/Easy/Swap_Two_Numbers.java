package Bit

Manipulation.Easy;

public enum Swap_Two_Numbers {
    public static void swapNumber(int []a, int []b) {
        a[0] = a[0] ^ b[0];
        b[0] = b[0] ^ a[0];
        a[0] = a[0] ^ b[0];
    }
}
