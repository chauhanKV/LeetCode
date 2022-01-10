package leetcode.techniques.BitManipulation;

public class Main {
    public static void main (String[] args)
    {
        isPowerOfTwo powerOfTwo = new isPowerOfTwo();
        boolean power = powerOfTwo.isPowerOfTwo(30);
        System.out.println("Is power of two : " + power);

        BitTricks setBit = new BitTricks();
        int set = setBit.setKthBit(10, 2);
        System.out.println("Setting kth bit results to : " + set);

        int clear = setBit.clearKthBit(125, 2);
        System.out.println("Clearing kth bit results to : " + clear);
    }
}
