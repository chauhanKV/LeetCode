package leetcode.techniques.NumberTheory;

public class AnyBaseToAnyBase {
    public int ConvertAnyBasetoAnyBase(int sourceBase, int destBase, int n) {

        // Convert Any base to decimal
        int sourceToDecimal = 0;
        int counter = 0;
        while(n != 0)
        {
            int digit = n % 10;
            sourceToDecimal += digit * (int)Math.pow(sourceBase, counter);
            n = n / 10;
            counter++;
        }

        // Convert decimal to Any base
        counter = 0;
        int decimalToDestination = 0;
        while(sourceToDecimal != 0)
        {
            int digit = sourceToDecimal % destBase;
            decimalToDestination += digit * (int)Math.pow(10, counter);
            sourceToDecimal = sourceToDecimal / destBase;
            counter++;
        }

        return decimalToDestination;

    }
}
