package leetcode.techniques.DynamicProgramming;

public class LongestCommonSubsequence {
    public int longestCommonSubsequence(String text1, String text2) {
        //return longestCommonSubsequenceRecursion(text1, text2, text1.length(), text2.length());

//        int[][] dp = new int[text1.length() + 1][text2.length() + 1];
//        for(int i = 0 ; i < text1.length() + 1; i++)
//        {
//            for(int j = 0 ; j < text2.length() + 1; j++)
//            {
//                dp[i][j] = -1;
//            }
//        }
//        return longestCommonSubsequenceMem(text1, text2, text1.length(), text2.length(), dp);

        return longestCommonSubsequenceDP(text1, text2, text1.length(), text2.length());
    }

    // Approach 1 - Recursion
    public int longestCommonSubsequenceRecursion(String text1, String text2, int n, int m) {
        // Base condition
        // Think of the smallest valid input
        // smallest valid input is when text1 and text2 length is 0 , so the longest common subsequence is 0 which is valid
        if (n == 0 || m == 0)
            return 0;  // This is because if one text value is empty there wont be any longest subsequence as nothing is common.

        // Choice diagram
        // If the last string is common for both text1 and text2

        if (text1.charAt(n - 1) == text2.charAt(m - 1)) {
            // We need to add 1 add we got one common string
            return 1 + longestCommonSubsequenceRecursion(text1, text2, n - 1, m - 1);
        }

        // Find the max of both conditions.
        return Math.max(longestCommonSubsequenceRecursion(text1, text2, n, m - 1), longestCommonSubsequenceRecursion(text1, text2, n - 1, m));

    }

    // Memoized code - Approach 2
    public int longestCommonSubsequenceMem(String text1, String text2, int n, int m, int[][] dp) {
        // Base condition
        // Think of the smallest valid input
        // smallest valid input is when text1 and text2 length is 0 , so the longest common subsequence is 0 which is valid
        if (n == 0 || m == 0)
            return 0;  // This is because if one text value is empty there wont be any longest subsequence as nothing is common.


        if (dp[n][m] != -1) {
            return dp[n][m];
        }
        // Choice diagram
        // If the last string is common for both text1 and text2

        if (text1.charAt(n - 1) == text2.charAt(m - 1)) {
            // We need to add 1 add we got one common string
            return dp[n][m] = 1 + longestCommonSubsequenceMem(text1, text2, n - 1, m - 1, dp);
        }

        // Find the max of both conditions.
        return dp[n][m] = Math.max(longestCommonSubsequenceMem(text1, text2, n, m - 1, dp), longestCommonSubsequenceMem(text1, text2, n - 1, m, dp));

    }

    // Approach 3 - DP

    public int longestCommonSubsequenceDP(String text1, String text2, int n, int m) {
        int[][] dp = new int[m + 1][n + 1];
        // Recursive base condition changes to initialization in Top down - DP approach
        for (int i = 0; i < m + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                }
            }
        }


        // Choice diagram
        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (text1.charAt(i) == text2.charAt(j))
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                else
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);

            }
        }

        return dp[m][n];
    }


}
