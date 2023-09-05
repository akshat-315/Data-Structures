public class Longest_Repeating_Character_Replacement {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int mostFreqLetter = 0;
        int start = 0;
        int max = 0;

        for (int e = 0; e < s.length(); e++) {
            freq[s.charAt(e) - 'A']++;
            mostFreqLetter = Math.max(mostFreqLetter, freq[s.charAt(e) - 'A']);
            int letterToBeChanged = (e - start + 1) - mostFreqLetter;

            if (letterToBeChanged > k) {
                freq[s.charAt(start) - 'A']--;
                start++;
            }

            max = Math.max(max, e - start + 1);
        }

        return max;
    }
}
