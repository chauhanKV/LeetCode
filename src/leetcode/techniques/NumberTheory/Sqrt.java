package leetcode.techniques.NumberTheory;

import java.util.ArrayList;
import java.util.Stack;

public class Sqrt {

    // Using Long division method - Not a good approach
    // Need to check Newton Raphson method to calculate square root
    public int findSqrt(int n) {

        ArrayList<Integer> pairs = new ArrayList<>();
        int digitCnt = 0;
        //create pairs of given number, store them in list or array
        while (n != 0) {
            digitCnt = digitCount(n);
            if (digitCnt > 1) {
                pairs.add(n % 100);
                n = n / 100;
            } else {
                pairs.add(n);
                n = n / 10;
            }
        }
        // loop through the pairs until we reach the end
        int dividend = pairs.get(pairs.size() - 1), remainder = 0, divisor = 0, divisorTemp = 0, quotient = 0, sqRoot = 0;

        for(int i = pairs.size() - 1; i >= 0; i--) {

            divisor = 2 * divisor;
            divisor = divisor * 10;
            divisorTemp = divisor;
            int counter = 0;
            quotient = counter;

            while (divisor * quotient <= dividend) {
                ++counter;
                divisor = divisorTemp + counter;
                quotient = counter;
            }

            if(divisor * quotient > dividend) {
                quotient = quotient - 1;
                divisor = divisor - 1;
            }

            remainder = dividend - (quotient * divisor);

            sqRoot = (sqRoot * 10) + quotient;

            if((i - 1) < 0)
            {
                break;
            }

            dividend = pairs.get(i - 1);
            remainder = remainder * (int) Math.pow(10, digitCount(dividend));
            dividend = dividend + remainder;
        }
        return sqRoot;
    }

    private int digitCount(int n) {
        int counter = 1;
        while (n != 0) {
            n = n / 10;
            counter++;
        }
        return counter;
    }
}
