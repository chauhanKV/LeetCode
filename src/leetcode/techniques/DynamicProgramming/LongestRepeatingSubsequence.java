package leetcode.techniques.DynamicProgramming;

public class LongestRepeatingSubsequence {
    public int LongestRepeatingSubsequence(String str) {
        int n = str.length();
        int m = str.length();

        // Create DP array
        int[][] dp = new int[n + 1][m + 1];

        // Initialization
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < m + 1; j++) {
                if (i == j) {
                    dp[i][j] = 0;
                }
            }
        }

        // Choice Diagram
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (str.charAt(i - 1) == str.charAt(j - 1) && i != j) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                }
            }
        }

        return dp[n][m];
    }
}
