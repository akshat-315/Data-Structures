package Arrays.Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class union {
    public static List<Integer> Union_Array(int[] a, int[] b) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        List<Integer> Union = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            freq.put(a[i], freq.getOrDefault(a[i], 0) + 1);
        }

        for (int i = 0; i < b.length; i++) {
            freq.put(b[i], freq.getOrDefault(b[i], 0) + 1);
        }

        for (int it : freq.keySet()) {
            Union.add(it);
        }

        return Union;
    }

    public static void main(String args[]) {
        int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int arr2[] = { 2, 3, 4, 4, 5, 11, 12 };

        List<Integer> Union = Union_Array(arr1, arr2);
        System.out.println("Union of arr1 and arr2 is " + Union_Array(arr1, arr2));
    }
}
