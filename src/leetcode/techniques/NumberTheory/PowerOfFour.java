package leetcode.techniques.NumberTheory;

public class PowerOfFour {
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Power of Four.
    //Memory Usage: 39.2 MB, less than 23.30% of Java online submissions for Power of Four.
    //Next challenges:
    //Maximum Product of Word Lengths
    //4 Keys Keyboard
    //Stone Game

    // Time Complexity : ? Understand this
    // Space Complexity : O(1)
    public boolean isPowerOfFour(int n) {
        if(n == 0) return false;

        while(n % 4 == 0)
        {
            n = n / 4;
        }

        return n == 1 ? true : false;
    }
}
