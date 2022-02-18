package leetcode.techniques.NumberTheory;

public class SumBase {

    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Sum of Digits in Base K.
    //Memory Usage: 41.2 MB, less than 6.80% of Java online submissions for Sum of Digits in Base K.
    //Next challenges:
    //Remove 9
    //Moving Stones Until Consecutive II
    //Sum of All Subset XOR Totals

    // Time complexity : as while loop will run based on how many numbers are present in digits. And as every loop has division, log10 N.
    // Time Complexity : O(Log10 N)
    // Space Complexity : O(1)
    public int sumBaseValue(int n, int k) {
        // Convert base 10 to base k
        int counter = 0, result = 0;
        while(n != 0)
        {
            int digit = n % k;
            result += digit * (int)Math.pow(10, counter);
            counter++;
            n = n / k;
        }

        // Add digits of the result and return
        int finalResult = 0;
        while(result != 0)
        {
            int digit = result % 10;
            finalResult += digit;
            result = result / 10;
        }

        return finalResult;
    }
}
