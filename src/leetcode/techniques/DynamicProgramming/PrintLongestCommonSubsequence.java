package leetcode.techniques.DynamicProgramming;

public class PrintLongestCommonSubsequence {
    public void printLongestCommonSubstring(String text1, String text2) {
         printlongestCommonSubStringDP(text1.length(), text2.length(), text1, text2);
    }

    private void printlongestCommonSubStringDP(int m, int n, String text1, String text2)
    {
        // Initialization
        int[][] dp = new int[m+1][n+1];
        for(int i = 0 ; i < m + 1; i++)
        {
            for(int j = 0; j < n + 1; j++)
            {
                if(i == 0 || j == 0) {
                    dp[i][j] = 0;
                }
            }
        }

        // Choice diagram
        for(int i = 1; i < m + 1; i++)
        {
            for(int j = 1; j < n + 1; j++)
            {
                if(text1.charAt(i - 1) == text2.charAt(j - 1))
                {
                    dp[i][j] = 1 + dp[i-1][j-1];
                }

                dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
            }
        }

        // Bottom up
        int i = m; int j = n;
        StringBuilder str = new StringBuilder();
        while(i > 0 && j > 0) {
            if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                str.append(text1.charAt(i - 1));
            } else {
                if (dp[i - 1][j] > dp[i][j - 1]) {
                    i--;
                } else {
                    j--;
                }
            }
        }

        System.out.println(str.toString());
    }
}
