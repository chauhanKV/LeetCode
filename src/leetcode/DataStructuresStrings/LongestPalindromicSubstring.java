package leetcode.DataStructuresStrings;

public class LongestPalindromicSubstring {

    // Brute Force
    // Time Complexity : O(N^2)
    // Space Complexity : O(N)

    // Gives TLE error, find better solution
    public String longestPalindrome(String s) {
        String longestPalindrome = "";
        int max = Integer.MIN_VALUE;
        // TC : O(N)
        for(int i = 0 ; i < s.length(); i++)
        {
            // O(N)
            for(int j = i+1; j <= s.length(); j++)
            {
                if(isPalindrome(s.substring(i,j)))
                {
                    if(max < (j - i))
                    {
                        max = j - i;
                        longestPalindrome = s.substring(i,j);
                    }
                }
            }
        }
        return longestPalindrome;
    }

    // O(N/2)
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
}
