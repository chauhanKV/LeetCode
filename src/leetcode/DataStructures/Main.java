package leetcode.DataStructures;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        RotateAnArray rotate = new RotateAnArray();
        int[] rotatedArray = rotate.rotateArray(new int[] {1,2,3,4,5}, 3);
        System.out.println("Rotated Array : " + Arrays.toString(rotatedArray));
    }
}
