package leetcode.techniques.BitManipulation;

public class Main {
    public static void main (String[] args)
    {
        isPowerOfTwo powerOfTwo = new isPowerOfTwo();
        boolean power = powerOfTwo.isPowerOfTwo(30);
        System.out.println("Is power of two : " + power);

        BitTricks bitTricks = new BitTricks();
        int set = bitTricks.setKthBit(10, 2);
        System.out.println("Setting kth bit results to : " + set);

        int clear = bitTricks.clearKthBit(125, 2);
        System.out.println("Clearing kth bit results to : " + clear);

        ReverseBits reverseBits = new ReverseBits();
        int reversed = reverseBits.reverseBits(43261596);
        System.out.println("Reverse Bits are : " + reversed);

    }
}
