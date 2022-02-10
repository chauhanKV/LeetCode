package leetcode.techniques.NumberTheory;

public class PowerOfThree {
    //Runtime: 19 ms, faster than 58.37% of Java online submissions for Power of Three.
    //Memory Usage: 47.4 MB, less than 11.07% of Java online submissions for Power of Three.
    //Next challenges:
    //Power of Four
    //Check if Number is a Sum of Powers of Three

    // Time Complexity : ? Understand this
    // Space Complexity : O(1)
    public boolean isPowerOfThree(int n) {
        if(n == 0) return false;

        while(n % 3 == 0)
        {
            n = n / 3;
        }

        return n == 1 ? true : false;
    }
}
