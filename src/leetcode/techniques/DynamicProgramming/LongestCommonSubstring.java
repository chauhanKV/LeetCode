package leetcode.techniques.DynamicProgramming;

public class LongestCommonSubstring {
    public int longestCommonSubstring(String text1, String text2) {
        return longestCommonSubstringDP(text1.length(), text2.length(), text1, text2);
    }

    private int longestCommonSubstringDP(int m, int n, String text1, String text2) {
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 0; i < m + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                if (i == 0 || j == 0) {
                    dp[m][n] = 0;
                }
            }
        }

        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = 0;
                }
            }
        }

        return dp[m][n];

    }
}
