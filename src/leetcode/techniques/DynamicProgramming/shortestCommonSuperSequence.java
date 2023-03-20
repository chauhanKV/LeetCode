package leetcode.techniques.DynamicProgramming;

public class shortestCommonSuperSequence {

    // Count
    public static int shortestCommonSupersequence(String X,String Y,int m,int n)
    {

        // Initialization
        int[][] dp = new int[m+1][n+1];

        for(int i = 0; i < m + 1; i++)
        {
            for(int j = 0; j < n + 1; j++)
            {
                if(i == 0 && j == 0)
                {
                    dp[i][j] = 0;
                }
            }
        }

        // Choice Diagram
        for(int i = 1; i < m + 1; i++)
        {
            for(int j = 1; j < n + 1; j++)
            {
                if(X.charAt(i - 1) == Y.charAt(j - 1)) // Why i - 1 Everywhere?
                {
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else
                {
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                }
            }
        }

        // Answer

        int i = m, j = n;
        int count = 0;
        while(i > 0 && j > 0)
        {
            if(X.charAt(i-1) == Y.charAt(j-1))
            {
                count++;
                i--;
                j--;
            }
            else
            {
                if(dp[i][j - 1] > dp[i-1][j])
                {
                    j--;
                }
                else
                {
                    i--;
                }
            }
        }

        return (X.length() + Y.length()) - count;
    }
}
