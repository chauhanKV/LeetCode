package leetcode.techniques.Recursion;

public class PalindromePartitionII {

    // This solution give TLE. Will have to use DP to store the result so that my logic doesn't have to compute. Come to this problem once you learn DP.

    public int minCut(String s) {
        return minCutHelper(s, 0, 0, Integer.MAX_VALUE);
    }

    public int minCutHelper(String s, int index, int cutCount, int minCut) {
        // base condition
        if (index == s.length()) {
            return cutCount - 1;
        }

        for (int i = index; i < s.length(); i++) {
            if (isPalindrome(s, index, i)) {
                minCut = Math.min(minCutHelper(s, i + 1, cutCount + 1, minCut), minCut);
            }
        }

        return minCut;
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


    //Optimized solution using DP and MCM
    //Runtime: 1329 ms, faster than 32.83% of Java online submissions for Palindrome Partitioning II.
    //Memory Usage: 55.3 MB, less than 24.40% of Java online submissions for Palindrome Partitioning II.
    //Next challenges:
    //Palindrome Partitioning IV

    public int minCutOptimized(String s) {
        int[][] dp = new int[s.length()][s.length()];

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                dp[i][j] = -1;
            }
        }

        return minCutHelperOptimized(s, 0, s.length() - 1, Integer.MAX_VALUE, dp);
    }

    public int minCutHelperOptimized(String s, int start, int end, int minCut, int[][] dp) {
        // base condition
        if (start >= end) {
            return 0;
        }

        if (isPalindrome(s, start, end)) {
            return 0;
        }

        if (dp[start][end] != -1) {
            return dp[start][end];
        }

        for (int i = start; i < end; i++) {
            if (isPalindrome(s, start, i)) {
                minCut = Math.min(1 + minCutHelperOptimized(s, i + 1, end, minCut, dp), minCut);
            }
        }

        dp[start][end] = minCut;
        return minCut;
    }
}
