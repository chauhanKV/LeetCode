package leetcode.DataStructuresArrays;

public class PlusOne {

    // Gives error for arrays > 9
    // Need to optimize the code

    // Time Complexity : O(N)
    // Space Complexity : O(N)
    public int[] plusOne(int[] digits) {

        int result = 0;
        int i = digits.length - 1;
        int carry = 0;
        int counter = 0;

        while(i >= 0)
        {
            int sum = 0;
            sum += carry;

            sum += digits[i];
            if(i == digits.length - 1)
            {
                sum += 1;
            }

            carry = sum / 10;
            sum = sum % 10;


            result += sum * (int)Math.pow(10, counter);

            counter++;
            i--;

        }

        int[] output;
        int n = result;

        if(carry > 0)
        {
            output = new int[digits.length + 1];
            counter = output.length - 1;
            while(n > 0)
            {
                int lastDigit = n % 10;
                n = n / 10;
                output[counter] = lastDigit;
                counter--;
            }

            output[0] = carry;
        }
        else
        {
            output = new int[digits.length];
            counter = output.length - 1;
            while(n > 0)
            {
                int lastDigit = n % 10;
                n = n / 10;
                output[counter] = lastDigit;
                counter--;
            }
        }

        return output;
    }
}
