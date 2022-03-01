package leetcode.DataStructures;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        RotateAnArray rotate = new RotateAnArray();
        int[] rotatedArray = rotate.rotateArray(new int[] {1,2,3,4,5}, 3);
        System.out.println("Rotated Array : " + Arrays.toString(rotatedArray));

        InverseAnArray inverse = new InverseAnArray();
        int[] invertedArray = inverse.inverseArray(new int[] {3,2,1,4,0});
        System.out.println("Array after inversion : " + Arrays.toString(invertedArray));

        SubarraysOfAnArray subArrays = new SubarraysOfAnArray();
        subArrays.findSubArrays(new int[] {10, 20, 30, 40});

        SubSetOfArray subSet = new SubSetOfArray();
        subSet.printSubsetOfArray(new int[] {10, 20, 30});
    }
}
