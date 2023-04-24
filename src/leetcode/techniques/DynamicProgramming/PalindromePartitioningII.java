package leetcode.techniques.DynamicProgramming;

public class PalindromePartitioningII {
    public int minCut(String s) {
        int[][] dp = new int[s.length() + 1][s.length() + 1];

        // Recursive Approach
        //return minCutMCMRecursiveApproach(s, 0, s.length() - 1);

        // Dynamic Programming approach
        for (int i = 0; i < s.length() + 1; i++) {
            for (int j = 0; j < s.length() + 1; j++) {
                dp[i][j] = -1;
            }
        }

        //return minCutRecursionAndMemoization(s, 0, s.length() - 1, dp);

        // Dynamic Programming Optimized Approach
        return minCutRecursionAndMemoizationOptimized(s, 0, s.length() - 1, dp);
    }

    public int minCutMCMRecursiveApproach(String s, int i, int j) {
        // Base Condition
        if (i >= j) {
            return 0;
        }

        // When its palindrome - I do not have to partition so return 0;
        if (isPalindrome(s, i, j)) {
            return 0;
        }

        // Schemes for i and j
        int minMN = Integer.MAX_VALUE;
        for (int k = i; k <= j - 1; k++) {
            int tempAns = 1 + minCutMCMRecursiveApproach(s, i, k) + minCutMCMRecursiveApproach(s, k + 1, j);
            minMN = Math.min(tempAns, minMN);
        }
        return minMN;
    }

    // MCM - Memoization Approach
    public int minCutRecursionAndMemoization(String s, int i, int j, int[][] dp) {
        // Base Condition
        if (i >= j) {
            return 0;
        }

        // When its palindrome - I do not have to partition so return 0;
        if (isPalindrome(s, i, j)) {
            return 0;
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        // Schemes for i and j
        int minCut = Integer.MAX_VALUE;
        for (int k = i; k <= j - 1; k++) {
            // Matrix chain multiplication
            int tempAns = 1 + minCutRecursionAndMemoization(s, i, k, dp) + minCutRecursionAndMemoization(s, k + 1, j, dp);
            minCut = Math.min(tempAns, minCut);
        }

        return dp[i][j] = minCut;
    }

    public int minCutRecursionAndMemoizationOptimized(String s, int i, int j, int[][] dp) {
        // Base condition
        if (i >= j) {
            return 0;
        }

        if (isPalindrome(s, i, j)) {
            return 0;
        }

        // MCM
        int minCut = Integer.MAX_VALUE;
        for (int k = i; k <= j - 1; k++) {
            // left
            int left = 0;
            if (dp[i][k] != -1) {
                left = dp[i][k];
            } else {
                left = minCutRecursionAndMemoizationOptimized(s, i, k, dp);
                dp[i][k] = left;
            }

            // right
            int right = 0;
            if (dp[k + 1][j] != -1) {
                right = dp[k + 1][j];
            } else {
                right = minCutRecursionAndMemoizationOptimized(s, k + 1, j, dp);
                dp[k + 1][j] = right;
            }

            int result = 1 + left + right;
            minCut = Math.min(minCut, result);
        }

        return dp[i][j] = minCut;
    }

    public boolean isPalindrome(String s, int start, int end) {
        while (start <= end) {
            if (s.charAt(start) != s.charAt(end))
                return false;

            start++;
            end--;
        }

        return true;
    }


}
