import java.util.*;

public class Solution {
    private static final List<String> str = new ArrayList<>();

    private static void f(String s, int n) {
        if (n == 0) {
            return;
        }

        for (int i = 0; i < n; i++) {
            if (i != 0 && s.charAt(i) == s.charAt(i - 1)) {
                continue;
            }

            str.add(s.substring(i, n));
        }

        s = s.substring(0, s.length() - 1);
        f(s, n - 1);
    }

    public static String moreSubsequence(int n, int m, String a, String b) {
        f(a, n);
        int n1 = str.size();
        str.clear();
        f(b, m);
        int n2 = str.size();

        return n1 >= n2 ? a : b;
    }

}
