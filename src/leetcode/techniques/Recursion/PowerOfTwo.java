package leetcode.techniques.Recursion;

public class PowerOfTwo {

    // Did using Recursion

    // Time Complexity : O(M height of recursion tree)
    // Space Complexity : O(M)
    public boolean isPowerOfTwo(int n) {
        if(n == 0)
        {
            return false;
        }

        if(n == 1)
        {
            return true;
        }

        if(n % 2 != 0)
        {
            return false;
        }

        return isPowerOfTwo(n/2);
    }
}
