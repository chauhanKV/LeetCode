package leetcode.techniques.DynamicProgramming;

public class PalindromePartitioningII {
    public int minCut(String s) {
        //int[][] dp = new int[s.length()][s.length()];

        // Recursive Approach
        return minCutMCMRecursiveApproach(s, 0, s.length() - 1);

        // Dynamic Programming approach
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
