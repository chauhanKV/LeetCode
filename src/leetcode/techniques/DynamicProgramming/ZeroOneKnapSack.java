package leetcode.techniques.DynamicProgramming;

public class ZeroOneKnapSack {

    // Basic Recursion Approach. Gives TLE for some test cases.
    public int knapSack(int W, int[] wt, int[] val, int n) {
        return knapSackHelper(W, wt, val, n - 1);
    }

    private int knapSackHelper(int W, int[] wt, int[] val, int n) {
        // Base condition
        if (n < 0) {
            return 0;
        }

        // Choices
        if (wt[n] > W) {
            return knapSackHelper(W, wt, val, n - 1); // we cannot put that item. It's exceeding the weight.
        }

        //Either we take or leave it
        return Math.max((val[n] + knapSackHelper(W - wt[n], wt, val, n - 1)), knapSackHelper(W, wt, val, n - 1));
    }


    // Fixes TLE issue when memoization is applied

    //Function to return max value that can be put in knapsack of capacity W.
    public int knapSackMemoization(int W, int[] wt, int[] val, int n)
    {
        int[][] dp = new int[W+1][n+1];

        for(int i = 0 ; i < W+1; i++)
        {
            for(int j = 0 ; j < n+1; j++)
            {
                dp[i][j] = -1;
            }
        }

        return knapSackHelperMemoization(W, wt, val, n-1, dp);
    }

    private int knapSackHelperMemoization(int W, int[] wt, int[] val, int n, int[][] dp)
    {
        // Base condition
        if(n < 0)
        {
            return 0;
        }

        if(dp[W][n] != -1)
        {
            return dp[W][n];
        }

        // Choices
        if(wt[n] > W)
        {
            return dp[W][n] = knapSackHelperMemoization(W,wt,val, n-1,dp); // we cannot put that item. Its exceeding the weight.
        }

        //Either we take or leave it
        return dp[W][n] = Math.max((val[n] + knapSackHelperMemoization(W - wt[n], wt, val, n-1,dp)), knapSackHelperMemoization(W,wt,val, n-1,dp));
    }
}
