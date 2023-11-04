import java.util.*;

public class Solution {
    public static List<Integer> nextGreaterPermutation(List<Integer> A) {
        int n = A.size();

        int index = -1;

        for (int i = n - 2; i >= 0; i--) {
            if (A.get(i) < A.get(i + 1)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            Collections.reverse(A);
            return A;
        }

        for (int i = n - 1; i > index; i--) {
            if (A.get(i) > A.get(index)) {
                int temp = A.get(i);
                A.set(i, A.get(index));
                A.set(index, temp);
                break;
            }
        }

        List<Integer> sublist = A.subList(index + 1, n);
        Collections.reverse(sublist);

        return A;
    }
}