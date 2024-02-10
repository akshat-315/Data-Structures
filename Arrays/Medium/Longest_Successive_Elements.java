
import java.util.*;

public class Solution {
    public static int longestSuccessiveElements(int[] a) {
        Set<Integer> set = new HashSet<>();

        for (int it : a) {
            set.add(it);
        }

        int streak = 0;

        for (int it : a) {
            if (!set.contains(it - 1)) {
                int currNum = it;
                int currStreak = 1;

                while (set.contains(currNum + 1)) {
                    currNum += 1;
                    currStreak += 1;
                }
                streak = Math.max(streak, currStreak);
            }

        }
        return streak;
    }
}