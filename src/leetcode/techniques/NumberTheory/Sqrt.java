package leetcode.techniques.NumberTheory;

import java.util.ArrayList;

public class Sqrt {

    // Using Newton Raphson method - best approach to get faster solution

    // Gives Time Limit exceeded on leetcode
    public double mySqrtUsingNewtonRaphsonMethod(double n) {
        double root = 0;
        double x = n;

        while (true) {
            root = 0.5 * (x + (n / x));

            if (Math.abs(root - x) < 0.5) {
                break;
            }

            x = root;
        }
        return root;
    }


    // Optimized to :
    public int mySqrtOptimizedNewtonRaphsonMethod(int n) {
        if(n == 0) return 0;

        long x = n;

        while(x * x > n)
        {
            x = (x + (n/x)) / 2;
        }

        return (int)x;

    }

    //Runtime: 2 ms, faster than 69.03% of Java online submissions for Sqrt(x).
    //Memory Usage: 41.7 MB, less than 9.83% of Java online submissions for Sqrt(x).
    //Next challenges:
    //Pow(x, n)
    //Valid Perfect Square

    // Time Complexity : O(LogN)
    // Space Complexity : O(1)
    public int mySqrtUsingBinarySearch(int n) {
        if (n == 0) return 0;

        int start = 1, end = n;

        while (start < end) {
            int middle = start + (end - start) / 2;
            if (middle <= n / middle && (middle + 1) > n / (middle + 1)) {
                return middle;
            } else if (middle > n / middle) {
                end = middle;
            } else {
                start = middle + 1;
            }

        }
        return start;

    }

    // Using Long division method - Not a good approach, gives wrong answer
    public int mySqrtUsingLongDivisionMethod(int n) {

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

        for (int i = pairs.size() - 1; i >= 0; i--) {

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

            if (divisor * quotient > dividend) {
                quotient = quotient - 1;
                divisor = divisor - 1;
            }

            remainder = dividend - (quotient * divisor);

            sqRoot = (sqRoot * 10) + quotient;

            if ((i - 1) < 0) {
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
