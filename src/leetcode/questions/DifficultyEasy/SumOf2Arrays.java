package leetcode.questions.DifficultyEasy;

import java.util.Arrays;

public class SumOf2Arrays {

    public int[] sumOfArrays(int[] arr1, int[] arr2) {
        int[] sum = new int[arr1.length > arr2.length ? arr1.length : arr2.length];

        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = sum.length - 1;
        int carry = 0;

        while(k >= 0)
        {
            int digit = carry;

            if(i >= 0)
            {
                digit += arr1[i];
            }

            if(j >= 0)
            {
                digit += arr2[j];
            }

            carry = digit / 10;
            sum[k] = digit % 10;

            i--;
            j--;
            k--;
        }

        if(carry != 0)
        {
            sum[k] =  carry;
        }

       return sum;
    }
}
