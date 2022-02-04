package leetcode.techniques.NumberTheory;

public class Sqrt {
    public int mySqrt(int x) {

        int i = 1;
        while(i * i <= x)
        {
            if(i * i == x)
                return i;

            i++;
        }
        return i - 1;
    }
}
