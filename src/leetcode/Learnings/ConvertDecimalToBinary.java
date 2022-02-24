package leetcode.Learnings;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertDecimalToBinary {

    public int[] ConvertToBinary(int number) {
        int[] arr = new int[20];
        int remainder = 0;

        for (int i = 0; number > 0; i++) {
            remainder = number % 2;
            number = number / 2;
            arr[i] = remainder;
        }


        for (int i = arr.length - 1 ; i > 0; i--) {
            System.out.print(arr[i]);
        }

        return arr;
    }
}
