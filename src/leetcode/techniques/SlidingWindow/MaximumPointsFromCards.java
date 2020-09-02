package leetcode.techniques.SlidingWindow;

public class MaximumPointsFromCards {

    public int maxScore(int[] cardPoints, int k) {
        int minWindowSum = 0;
        int sliding_window_length = cardPoints.length - k;
        int currentRunningWindowSum = 0;
        int totalSum = 0;

        for (int i = 0; i < sliding_window_length; i++) {
            currentRunningWindowSum += cardPoints[i];
        }
        minWindowSum = currentRunningWindowSum;
        totalSum = currentRunningWindowSum;

        for (int i = sliding_window_length; i < cardPoints.length; i++) {
            totalSum += cardPoints[i];
            currentRunningWindowSum += cardPoints[i];
            currentRunningWindowSum -= cardPoints[i - sliding_window_length];

            minWindowSum = Math.min(currentRunningWindowSum, minWindowSum);
        }
        return totalSum - minWindowSum;
    }
}