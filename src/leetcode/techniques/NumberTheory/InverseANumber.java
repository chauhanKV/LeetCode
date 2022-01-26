package leetcode.techniques.NumberTheory;

public class InverseANumber {
    public int InverseNumber(int no)
    {
        int power = 1;
        int inverted = 0;
        while(no != 0)
        {
            int digit = no % 10;
            no = no /10;
            inverted = inverted + (int)(power * Math.pow(10, digit - 1));
            power++;
        }
        return inverted;
    }
}
