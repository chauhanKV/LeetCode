package leetcode.techniques.NumberTheory;

public class ConvertToAnyBase {
    public int getValueInBase(int n, int b){
        int counter = 1;
        int val = 0;
        while(n != 0)
        {
            int digit = n % b;
            val = val + (digit * (int)Math.pow(10, counter - 1));
            n = n / b;
            counter++;
        }

        return val;
    }
}
