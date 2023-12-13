package leetcode.techniques.DynamicProgramming;

import java.util.Arrays;

public class PalindromePartitioningIV {

    public void checkPartitioning(String s){
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                if (i >= j)
                    dp[i][j] = true;
                else if (s.charAt(i) == s.charAt(j))
                    dp[i][j] = dp[i + 1][j - 1];
            }
        }

        System.out.println(Arrays.deepToString(dp));
    }
}
