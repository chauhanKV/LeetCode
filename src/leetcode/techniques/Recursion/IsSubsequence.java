package leetcode.techniques.Recursion;

import java.util.ArrayList;

public class IsSubsequence {

    // Brute Force approach
    //Runtime: 1 ms, faster than 88.74% of Java online submissions for Is Subsequence.
    //Memory Usage: 42.1 MB, less than 48.31% of Java online submissions for Is Subsequence.
    //Next challenges:
    //Number of Matching Subsequences
    //Shortest Way to Form String
    public boolean isSubsequence(String s, String t) {
        if (t.length() <= 0 && s.length() <= 0) return true;

        if (s.length() <= 0 && t.length() > 0) return true;

        int j = 0;
        for (int i = 0; i < t.length() && j < s.length(); i++) {
            if (t.charAt(i) == s.charAt(j)) {
                j++;
            }
        }

        return j == s.length();
    }

    // With Recursion
    //Runtime: 2 ms, faster than 37.97% of Java online submissions for Is Subsequence.
    //Memory Usage: 43.7 MB, less than 5.28% of Java online submissions for Is Subsequence.
    //Next challenges:
    //Number of Matching Subsequences
    //Shortest Way to Form String
    public boolean isSubsequenceWithRecursion(String s, String t)
    {
        return checkIfSubSequence(s, t, s.length(), t.length());
    }

    private boolean checkIfSubSequence(String s, String t, int s_length, int t_length) {
        if (s_length == 0)
            return true;

        if (t_length == 0)
            return false;

        if (s.charAt(s_length - 1) == t.charAt(t_length - 1)) {
            return checkIfSubSequence(s, t, s_length - 1, t_length - 1);
        } else {
            return checkIfSubSequence(s, t, s_length, t_length - 1);
        }
    }
}
