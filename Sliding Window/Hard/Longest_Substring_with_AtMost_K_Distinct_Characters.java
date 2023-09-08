package SlidingWindow.Hard;

public class Longest_Substring_with_AtMost_K_Distinct_Characters {
    Longest_Substring_with_AtMost_K_Distinct_Characters
    {

    public static int kDistinctChars(int k, String str) {
        if (str.length() == 0 || str.equals("")) {
            return 0;
        }
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int max = 0;
        int l = 0;
        int r = 0;
        int n = str.length();
        while (r < n) {
            char c = str.charAt(r);
            map.put(c, map.getOrDefault(c, 0) + 1);
            while (map.size() > k) {
                char leftChar = str.charAt(l);
                map.put(leftChar, map.get(leftChar) - 1);
                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }
                l++;
            }
            max = Math.max(r - l + 1, max);
            r++;
        }
        return max;
    }
}
