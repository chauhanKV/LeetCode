package leetcode.techniques.DynamicProgramming;

public class CountSubsetSum {

    // Approach 1 : Recursive Approach
    public int perfectSumRecursion(int[] arr,int n, int sum) {
        return perfectSumRecursionHelper(arr, n, sum, 0, 0);
    }

    int perfectSumRecursionHelper(int[] arr, int n, int target, int runningSum, int index) {
        // base condition
        if (runningSum == target) {
            return 1;
        }

        if (index >= arr.length) {
            return 0;
        }

        if (runningSum > target) {
            return 0;
        }

        return perfectSumRecursionHelper(arr, n, target, runningSum + arr[index], index + 1) +
                perfectSumRecursionHelper(arr, n, target, runningSum, index + 1);
    }

    // Approach 2 : Memoization
    public int perfectSumMemoization(int[] arr,int n, int sum) {
        int range = 0;

        for (int k : arr) {
            range += k;
        }

        int[][] dp = new int[n + 1][range + 1];

        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < range + 1; j++) {
                dp[i][j] = -1;
            }
        }

        return perfectSumMemoizationHelper(arr, n, sum, 0, 0, dp);
    }

    int perfectSumMemoizationHelper(int[] arr, int n, int target, int runningSum, int index, int[][] dp) {
        // base condition
        if (runningSum == target) {
            return 1;
        }

        if (index >= arr.length) {
            return 0;
        }

        if (runningSum > target) {
            return 0;
        }

        if (dp[index][runningSum] > -1) {
            return dp[index][runningSum];
        }

        return perfectSumMemoizationHelper(arr, n, target, runningSum + arr[index], index + 1, dp) +
                perfectSumMemoizationHelper(arr, n, target, runningSum, index + 1, dp);
    }

    // Approach 3 : Using Dynamic Programming
    int value = 1000000007;
    public int perfectSum(int[] arr ,int n, int sum) {

        int[][] t = new int[n + 1][sum + 1];

        // Initialization
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < sum + 1; j++) {
                if (i == 0) {
                    t[i][j] = 0;
                }

                if (j == 0) {
                    t[i][j] = 1;
                }
            }
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 0; j < sum + 1; j++) {
                if (arr[i - 1] <= j) {
                    t[i][j] = (t[i - 1][j] + t[i - 1][j - arr[i - 1]]);
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }
        return t[n][sum];
    }
}
