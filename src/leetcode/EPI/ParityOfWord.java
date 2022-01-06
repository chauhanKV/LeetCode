package leetcode.EPI;

public class ParityOfWord {
    //Runtime: 2 ms, faster than 14.42% of Java online submissions for Number of 1 Bits.
    //Memory Usage: 38.1 MB, less than 7.87% of Java online submissions for Number of 1 Bits.
    //Next challenges:
    //Reverse Bits
    //Power of Two
    //Counting Bits
    //Binary Watch
    //Hamming Distance
    //Binary Number with Alternating Bits
    //Prime Number of Set Bits in Binary Representation

    // Understand this better :
    //Time Complexity : O(n)
    // Space Complexity : O(1)

    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int one = 0;
        while(n != 0)
        {
            one = one + (n & 1);
            n = n >>> 1;
        }

        return one;
    }
}
