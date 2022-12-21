package leetcode.techniques.DynamicProgramming;

public class RodCutting {
    public int cutRod(int price[], int n) {

        int[] length = new int[n];
        for (int i = 0; i < n; i++) {
            length[i] = i + 1;
        }

        return unBoundedknapSack(n, length, price, n);

    }

    public int unBoundedknapSack(int W, int[] wt, int[] val, int n) {
        int[][] dp = new int[n + 1][W + 1];

        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < W + 1; j++) {
                // Initialization
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                }
            }
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < W + 1; j++) {
                // Choice Diagram

                if (wt[i - 1] <= j) {
                    dp[i][j] = Math.max((val[i - 1] + dp[i][j - wt[i - 1]]), dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[n][W];
    }
}
