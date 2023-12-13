package leetcode.techniques.DynamicProgramming;

public class LongestCommonSubstring {
    public int longestCommonSubstring(String text1, String text2) {
        //return longestCommonSubStringRecursion(text1.length(), text2.length(), text1, text2);
        int m = text1.length();
        int n = text2.length();
        int[][] dp = new int[m+1][n+1];
        for(int i = 0 ; i < m + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                dp[i][j] = -1;
            }
        }

        return longestCommonSubStringMemoization(m, n, text1, text2, dp);
    }

    // Recursion
    private int longestCommonSubStringRecursion(int m, int n, String text1, String text2)
    {
        // Base condition
        if(m == 0 || n == 0)
            return 0;

        if(text1.charAt(m-1) == text2.charAt(n-1))
        {
            return 1 + longestCommonSubStringRecursion(m-1, n-1, text1, text2);
        }

        return longestCommonSubStringRecursion(m-1, n-1, text1, text2);
    }

    // Memoization
    private int longestCommonSubStringMemoization(int m, int n, String text1, String text2, int[][] dp)
    {
        // Base condition
        if(m == 0 || n == 0)
            return 0;

        if(dp[m][n] != -1)
        {
            return dp[m][n];
        }

        if(text1.charAt(m-1) == text2.charAt(n-1))
        {
            return dp[m][n] = 1 + longestCommonSubStringMemoization(m-1, n-1, text1, text2, dp);
        }

        return dp[m][n] = longestCommonSubStringMemoization(m-1, n-1, text1, text2, dp);

    }


    // Dynamic Programming
    private int longestCommonSubstringDP(int m, int n, String text1, String text2) {
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 0; i < m + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                if (i == 0 || j == 0) {
                    dp[m][n] = 0;
                    break;
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
