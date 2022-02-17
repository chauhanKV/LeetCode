package leetcode.techniques.NumberTheory;

public class AnyBaseToDecimal {
    public int getValueIndecimal(int n, int b){
        int remainder = 0;
        int counter = 0;
        while(n != 0)
        {
            int digit = n % 10;
            remainder = remainder + (digit * (int)Math.pow(b, counter)) ;
            n = n / 10;
            counter++;
        }

        return remainder;
    }
}
