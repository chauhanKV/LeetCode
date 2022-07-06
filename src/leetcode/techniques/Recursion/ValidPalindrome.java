package leetcode.techniques.Recursion;

public class ValidPalindrome {

    // Gives compile error - fix the error.
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z]", "");

        return isPalindromeHelper(s, 0, s.length() - 1, s.length());
    }

    public boolean isPalindromeHelper(String s, int start, int end, int length) {
        if (start >= length / 2) {
            return true;
        }


        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }


        return isPalindromeHelper(s, start + 1, start - (length - 1), length);
    }
}
