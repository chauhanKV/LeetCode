package leetcode.DataStructuresStrings;

public class PalindromicSubStrings {
    //Runtime: 470 ms, faster than 12.49% of Java online submissions for Palindromic Substrings.
    //Memory Usage: 118.1 MB, less than 5.50% of Java online submissions for Palindromic Substrings.
    //Next challenges:
    //Longest Palindromic Substring
    //Longest Palindromic Subsequence

    // Solution 1 : Brute Force

    // Time Complexity : O(N^3)
    // Space Complexity : O(N)
    public int countSubstrings(String s) {
        int palindromeCount = 0;
        for(int i = 0 ; i < s.length(); i++)
        {
            for(int j = i+1; j <= s.length(); j++)
            {
                if(isPalindrome(s.substring(i,j)))
                {
                    palindromeCount++;
                }
            }
        }
        return palindromeCount;
    }

    private boolean isPalindrome(String s)
    {
        int left = 0, right = s.length() - 1;

        while(left <= right)
        {
            if(s.charAt(left) != s.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }


    // Solution 2 : Optimized Approach (come back later when concepts are clear to optimize this)
}
