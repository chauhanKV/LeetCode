package leetcode.techniques.BitManipulation;

public class isPowerOfTwo {
    //Runtime: 1 ms, faster than 99.97% of Java online submissions for Power of Two.
    //Memory Usage: 35.9 MB, less than 65.65% of Java online submissions for Power of Two.
    //Next challenges:
    //Power of Three
    //Power of Four

    // Time Complexity : O(N)
    // Space Complexity : O(1)
    public boolean isPowerOfTwo(int n) {
        return n > 0 && ((n & (n-1)) == 0);
    }
}
