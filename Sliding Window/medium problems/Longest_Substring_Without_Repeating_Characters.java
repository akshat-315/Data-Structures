import java.util.*;
import java.io.*;

public class Solution {
    public static int uniqueSubstrings(String s) {
        int i = 0, j = 0;
        int maxLen = 0;
        Set<Character> set = new HashSet<>();

        while (j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
                maxLen = Math.max(maxLen, set.size());
                j++;
            } else if (set.contains(s.charAt(j))) {
                set.remove(s.charAt(i));
                i++;
            }
        }
        return maxLen;
    }
}
