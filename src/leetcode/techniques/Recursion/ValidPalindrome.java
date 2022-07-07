package leetcode.techniques.Recursion;

public class ValidPalindrome {

    //Runtime: 34 ms, faster than 37.87% of Java online submissions for Valid Palindrome.
    //Memory Usage: 55 MB, less than 12.60% of Java online submissions for Valid Palindrome.
    //Next challenges:
    //Valid Palindrome II
    //Maximum Product of the Length of Two Palindromic Subsequences
    //Find First Palindromic String in the Array
    //Valid Palindrome IV

    // Not an optimized solution. Check by using just one variable instead of start and end.

    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");

        return isPalindromeHelper(s, 0, s.length() - 1, s.length());
    }

    public boolean isPalindromeHelper(String s, int start, int end, int length) {
        if (start >= end) {
            return true;
        }

        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        return isPalindromeHelper(s, start + 1, end - 1, length);
    }
}
