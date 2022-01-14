package leetcode.techniques.BitManipulation;

import java.lang.reflect.Array;
import java.util.Arrays;

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

        int parity = bitTricks.parity(127);
        System.out.println("Is odd Parity ? " + parity);

        ReverseBits reverseBits = new ReverseBits();
        int reversed = reverseBits.reverseBits(43261596);
        System.out.println("Reverse Bits are : " + reversed);

        CountBits count = new CountBits();
        int[] arr = count.countBits(5);
        System.out.println("Number of bits are : " + Arrays.toString(arr));

        AddBinary add = new AddBinary();
        String addition = add.addBinary("111", "11");
        System.out.println("Addition of two binary numbers is : " + addition);

        SingleNumber pair = new SingleNumber();
        int num = pair.singleNumber(new int[]{2,2,1});
        System.out.println("Return the number not in pair : " + num);
    }
}
