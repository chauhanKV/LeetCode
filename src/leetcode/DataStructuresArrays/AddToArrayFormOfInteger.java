package leetcode.DataStructuresArrays;

import java.util.ArrayList;
import java.util.List;

public class AddToArrayFormOfInteger {
    // Runtime: 5 ms, faster than 86.28% of Java online submissions for Add to Array-Form of Integer.
    //Memory Usage: 62.6 MB, less than 22.75% of Java online submissions for Add to Array-Form of Integer.
    //Next challenges:
    //Add Two Numbers
    //Plus One
    //Add Strings



    // Optimize this code
    public List<Integer> addToArrayForm(int[] num, int k) {
        int i = num.length - 1, quotient = k, lastDigit, sum, carry = 0;

        int maxLength = Math.max(num.length, getDigitCount(k));
        int[] arr = new int[maxLength];
        maxLength = maxLength - 1;

        while(maxLength >= 0)
        {
            // get the last digit of number
            sum = 0;
            sum += carry;

            if(quotient != 0)
            {
                lastDigit = quotient % 10;
                quotient = quotient / 10;
                sum += lastDigit;
            }

            if(i >= 0)
            {
                sum += num[i];
                i--;
            }

            lastDigit = sum % 10;
            carry = sum / 10;

            arr[maxLength] = lastDigit;
            maxLength--;
        }

        List<Integer> numList = new ArrayList<>();

        for(int j = 0 ; j < arr.length; j++)
        {
            if(carry != 0 && j == 0)
            {
                numList.add(carry);
                numList.add(arr[j]);
            }
            else
            {
                numList.add(arr[j]);
            }
        }

        return numList;
    }

    private int getDigitCount(int k)
    {
        int counter = 0;
        int quotient = k;
        while(quotient != 0)
        {
            int lastDigit = quotient % 10;
            quotient = quotient / 10;
            counter++;
        }
        return counter;
    }
}
