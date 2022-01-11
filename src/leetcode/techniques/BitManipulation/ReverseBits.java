package leetcode.techniques.BitManipulation;

import java.util.ArrayList;
import java.util.List;

public class ReverseBits {

    //Runtime: 5 ms, faster than 10.06% of Java online submissions for Reverse Bits.
    //Memory Usage: 40 MB, less than 7.60% of Java online submissions for Reverse Bits.
    //Next challenges:
    //Reverse Integer
    //A Number After a Double Reversal

    // Time Complexity : O(32) => O(1)
    // Space Complexity : O(32) => O(1)
    public int reverseBits(int n) {
        int reverse = 0;
        List<Integer> arr = new ArrayList<>();
        int t = 32;

        while(t > 0)
        {
            int value = n & 1;
            arr.add(0, value);
            n = n >> 1;
            t--;
        }

        for(int i = 0 ; i < arr.size(); i++)
        {
            reverse = reverse << 1;
            reverse = reverse | arr.get(i);
        }
        return reverse;
    }
}
