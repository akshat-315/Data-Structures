public class Number_Of_Substrings_Containing_All_Three_Characters {
    public int numberOfSubstrings(String s) {
        int left = 0;
        int res = 0;
        int[] arr = new int[3];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            arr[ch - 'a']++;
            while (arr[0] > 0 && arr[1] > 0 && arr[2] > 0) {
                res += s.length() - i;
                arr[s.charAt(left++) - 'a']--;
            }
        }
        return res;
    }
}
