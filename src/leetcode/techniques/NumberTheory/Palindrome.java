package leetcode.techniques.NumberTheory;

public class Palindrome {
    
    //Runtime: 19 ms, faster than 21.51% of Java online submissions for Palindrome Number.
    //Memory Usage: 44.9 MB, less than 5.17% of Java online submissions for Palindrome Number.
    //Next challenges:
    //Ugly Number III
    //Count Ways to Make Array With Product
    //The Number of Full Rounds You Have Played

    // Time Complexity : O(N^2)
    // Space Complexity : O(1)

    // No an optimized solution.
    public boolean isPalindrome(int x) {
        if(x < 0) return false;

        int reverseValue = 0;
        int originalValue = x;

        while(x != 0)
        {
            int digit = x % 10;
            x = x / 10;
            int noOfDigits = getNoOfDigits(x);
            reverseValue = reverseValue + (digit * (int)Math.pow(10, noOfDigits));
        }

        return reverseValue == originalValue;
    }

    private int getNoOfDigits(int value)
    {
        int digitNumbers = 0;
        while(value != 0)
        {
            value = value/10;
            digitNumbers++;
        }
        return digitNumbers;
    }


//    public boolean isPalindromeUsingTwoPointers(int x)
//    {
//
//    }
}
