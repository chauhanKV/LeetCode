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
}
