package Bit Manipulation.Easy;

public class ith_Bit_Set_Or_Not {
    static boolean isKthBitSet(int n, int k) {
        int x = n|(1<<k-1);
        if(x == n) return true;
        else return false;
    }
}
