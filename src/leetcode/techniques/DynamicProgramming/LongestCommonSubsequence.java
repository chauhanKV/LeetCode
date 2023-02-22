package leetcode.techniques.DynamicProgramming;

public class LongestCommonSubsequence {
    public int longestCommonSubsequence(String text1, String text2) {
        return longestCommonSubsequenceRecursion(text1, text2, text1.length(), text2.length());
    }

    public int longestCommonSubsequenceRecursion(String text1, String text2, int n, int m) {
        // Base condition
        // Think of the smallest valid input
        // smallest valid input is when text1 and text2 length is 0 , so the longest common subsequence is 0 which is valid
        if (n == 0 || m == 0)
            return 0;  // This is because if one text value is empty there wont be any longest subsequence as nothing is common.

        // Choice diagram
        // If the last string is common for both text1 and text2

        if (text1.charAt(n - 1) == text2.charAt(m - 1)) {
            // We need to add 1 add we got one common string
            return 1 + longestCommonSubsequenceRecursion(text1, text2, n - 1, m - 1);
        }

        // Find the max of both conditions.
        return Math.max(longestCommonSubsequenceRecursion(text1, text2, n, m - 1), longestCommonSubsequenceRecursion(text1, text2, n - 1, m));

    }
}
