package Bit Manipulation.Easy;

public class Bit_Manipulation {
    public static int[] bitManipulation(int num, int i){
        int[] arr = new int[3];
        arr[0] = ((num & (1<<i-1)) >= 1) ? 1 : 0;
        arr[1] = num | (1<<i-1);
        arr[2] = num &~ (1<<i-1);


        return arr;
    }
}
