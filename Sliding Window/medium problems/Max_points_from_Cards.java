public class Max_points_from_Cards {
    public int maxScore(int[] cardPoints, int k) {
        int sum = 0, totSum = 0, minSum = Integer.MAX_VALUE;
        ;
        int i = 0, j = 0;
        int len = cardPoints.length - k;

        for (int m = 0; m < cardPoints.length; m++) {
            totSum += cardPoints[m];
        }

        if (len == 0)
            return totSum;

        while (j < cardPoints.length) {
            sum += cardPoints[j];
            if (j - i + 1 < len) {
                j++;
            } else if (j - i + 1 == len) {
                minSum = Math.min(minSum, sum);
                sum -= cardPoints[i];
                i++;
                j++;
            }
        }

        return totSum - minSum;
    }
}
