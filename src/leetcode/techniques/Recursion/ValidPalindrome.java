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

    // Using single variable
    // Runtime: 853 ms, faster than 22.20% of Java online submissions for Valid Palindrome.
    //Memory Usage: 54 MB, less than 13.12% of Java online submissions for Valid Palindrome.
    //Next challenges:
    //Valid Palindrome II
    //Maximum Product of the Length of Two Palindromic Subsequences
    //Find First Palindromic String in the Array
    //Valid Palindrome IV

    // Not sure why single variable solution is taking more time. Come back to understand this. Check other leetcode solutions on discuss section.
    // Two pointer solution is much faster than recursion solution.
    // And we should not use any inbuild function to replace nonalphanumeric characters because that is allocating one more memory location to store
    // replaced string.
    public boolean isPalindromeHelperSingleVariable(String s, int i, int length)
    {
        if(i >= length/2)
        {
            return true;
        }

        if(s.charAt(i) != s.charAt((length - 1) - i))
        {
            return false;
        }

        return isPalindromeHelperSingleVariable(s, i + 1, length);
    }
}
