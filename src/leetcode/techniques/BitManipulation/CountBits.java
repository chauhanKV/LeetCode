package leetcode.techniques.BitManipulation;

public class CountBits {

    //Runtime: 3 ms, faster than 43.07% of Java online submissions for Counting Bits.
    //Memory Usage: 45.2 MB, less than 21.55% of Java online submissions for Counting Bits.
    //Next challenges:
    //Maximum Alternating Subarray Sum
    //Maximum Score Words Formed by Letters
    //Maximum Absolute Sum of Any Subarray

    // Need to learn on how to define time complexity in bits problem.
    // Time complexity :
    // Space Complexity :
    public int[] countBits(int n) {
        int[] arr = new int[n+1];
        for(int i = 0; i <= n ; i++)
        {
            arr[i] = getParity(i);
        }
        return arr;
    }

    private int getParity(int n)
    {
        int one = 0;
        while(n != 0)
        {
            one = one + (n & 1);
            n = n >>> 1;
        }
        return one;
    }
}
