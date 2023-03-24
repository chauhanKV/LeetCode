package leetcode.techniques.DynamicProgramming;

public class PrintLongestCommonSubsequence {
    public void shortestCommonSupersequence(String str1, String str2) {
        System.out.println("Shortest Common Super Sequence : " + shortestCommonSupersequenceDP(str1, str2));
    }

    public String shortestCommonSupersequenceDP(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();

        // Initialization
        int[][] dp = new int[n + 1][m + 1];

        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < m + 1; j++) {
                if (i == 0 && j == 0) {
                    dp[i][j] = 0;
                }
            }
        }

        // Choice Diagram
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                }
            }
        }

        // Answer
        StringBuilder builder = new StringBuilder();
        int i = n;
        int j = m;
        while (i > 0 && j > 0) {
            if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                builder.append(str1.charAt(i - 1));
                i--;
                j--;
            } else {
                if (dp[i][j - 1] > dp[i - 1][j]) {
                    builder.append(str2.charAt(j - 1));
                    j--;
                } else {
                    builder.append(str1.charAt(i - 1));
                    i--;
                }
            }
        }

        while (i > 0) {
            builder.append(str1.charAt(i - 1));
            i--;
        }

        while (j > 0) {
            builder.append(str2.charAt(j - 1));
            j--;
        }

        return builder.reverse().toString();
    }
}
