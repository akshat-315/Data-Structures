class Solution {
    public int majorityElement(int[] v) {
        int n = v.length;
        int count = 0;
        int el = 0;

        for (int i = 0; i < n; i++) {
            if (count == 0) {
                count = 1;
                el = v[i];
            } else if (el == v[i])
                count++;
            else
                count--;
        }

        int count1 = 0;
        for (int i = 0; i < n; i++) {
            if (v[i] == el)
                count1++;
        }

        if (count1 > n / 2) {
            return el;
        }
        return -1;
    }
}