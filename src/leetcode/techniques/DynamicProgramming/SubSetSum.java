package leetcode.techniques.DynamicProgramming;

public class SubSetSum {

    // Recursion approach 1 - Gives TLE

    // with Recursion approach - 1
    public Boolean isSubsetSumRecursion(int N, int[] arr, int sum){
        return isSubsetSumHelper(N, arr, sum, 0, 0);
    }

    public Boolean isSubsetSumHelper(int N, int[] arr, int target, int runningSum, int index)
    {
        // Base Condition
        if(runningSum == target)
        {
            return true;
        }

        if(index >= arr.length)
        {
            return false;
        }

        return isSubsetSumHelper(N, arr, target, runningSum + arr[index], index + 1) || isSubsetSumHelper(N, arr, target, runningSum, index + 1);

    }

    // Memoization approach - 2
    public Boolean isSubsetSumMemoization(int N, int[] arr, int sum){

        int range = 0;
        for (int k : arr) {
            range += k;
        }

        int[][] dp = new int[N+1][range+1];

        // initialize dp with -1
        for(int i = 0 ; i < N + 1; i++)
        {
            for(int j = 0 ; j < range + 1; j++)
            {
                dp[i][j] = -1;
            }
        }

        return isSubsetSumHelperMemoization(N, arr, sum, 0, 0, dp);
    }

    public Boolean isSubsetSumHelperMemoization(int N, int[] arr, int target, int runningSum, int index, int[][] dp)
    {
        // Base Condition
        if(runningSum == target)
        {
            return true;
        }

        if(index >= arr.length)
        {
            return false;
        }

        if(dp[index][runningSum] != -1)
        {
            return dp[index][runningSum] == 1;
        }

        boolean result = isSubsetSumHelperMemoization(N, arr, target, runningSum + arr[index], index + 1, dp)
                            ||
                         isSubsetSumHelperMemoization(N, arr, target, runningSum, index + 1, dp);

        dp[index][runningSum] = result ? 1 : 0;
        return result;

    }


    // DP approach 3 - Optimized Approach
    public Boolean isSubsetSum(int N, int[] arr, int sum) {

        // Understand Knapsack basic problem to understand this.
        boolean[][] t = new boolean[N + 1][sum + 1];

        // Step 1 initialization

        for (int i = 0; i < N + 1; i++) {
            for (int j = 0; j < sum + 1; j++) {
                if (i == 0) {
                    t[i][j] = false;
                }

                if (j == 0) {
                    t[i][j] = true;
                }
            }
        }

        // Step 2 : Choice diagram

        for (int i = 1; i < N + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                if (arr[i - 1] <= j) {
                    // Here we have two options - either take it or leave it
                    t[i][j] = t[i - 1][j - arr[i - 1]] || t[i - 1][j];
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }

        return t[N][sum];
    }




}
