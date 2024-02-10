package Heaps.Medium;

import java.util.Arrays;

public class Task_Scheduler {
    public static int taskScheduler(String s, int n, int k) {

        int freq[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int temp = s.charAt(i) - 'A';
            freq[temp]++;
        }

        int countMaxOcc = 1;
        Arrays.sort(freq);
        int maxFreq = freq[freq.length - 1];

        for (int i = 0; i < freq.length - 1; i++) {
            if (freq[i] == maxFreq) {
                countMaxOcc++;
            }
        }

        int ans = (maxFreq - 1) * (k + 1) + countMaxOcc;
        return Math.max(ans, s.length());
    }
}
