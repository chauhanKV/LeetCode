package leetcode.techniques.BitManipulation;

public class BitTricks {

    public int setKthBit(int n, int k)
    {
        return n | (1 << k);
    }

    public int clearKthBit(int n, int k)
    {
        return (n & (~(n << (k - 1))));
    }

    public void oddEven(int i)
    {
        if((i & 1) == 0)
            System.out.println("Number is even number");
        else
            System.out.println("Number is odd number");
    }

    public int parity(int i)
    {
        int result = 0;
        while(i > 0)
        {
            result = result ^ 1;
            i = i & (i - 1); // Optimized approach to remove lowest bit from the result set.
        }
        return result;
    }

}