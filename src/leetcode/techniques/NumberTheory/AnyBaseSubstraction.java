package leetcode.techniques.NumberTheory;

public class AnyBaseSubstraction {
    // Time Complexity : O(log10 max(n1, n2, result))
    // Space Complexity : O(1)
    public int getSubstraction(int b, int n1, int n2){
        // Convert n1 into base 10
        int n1Decimal = 0, n2Decimal = 0, finalResult = 0;
        int counter = 0;

        while(n1 != 0)
        {
            int digit = n1 % 10;
            n1Decimal += digit * (int)Math.pow(b, counter);
            counter++;
            n1 = n1 / 10;
        }

        // Convert n2 into base 10
        counter = 0;
        while(n2 != 0)
        {
            int digit = n2 % 10;
            n2Decimal += digit * (int)Math.pow(b, counter);
            counter++;
            n2 = n2 / 10;
        }

        // Add both numbers

        int result = Math.abs(n1Decimal - n2Decimal);

        // Convert back to given base b

        counter = 0;
        while(result != 0)
        {
            int digit = result % b;
            finalResult += digit * (int)Math.pow(10, counter);
            counter++;
            result = result / b;
        }

        return finalResult;
    }
}
