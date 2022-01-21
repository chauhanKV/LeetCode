package leetcode.techniques.NumberTheory;

public class UglyNumber {
    //Runtime: 2 ms, faster than 43.84% of Java online submissions for Ugly Number.
    //Memory Usage: 38.3 MB, less than 8.16% of Java online submissions for Ugly Number.
    //Next challenges:
    //Ugly Number II

    public boolean isUgly(int n) {
        for(int i = 2; i < 6 && n > 0; i++)
        {
            while(n % i == 0)
            {
                n = n / i;
            }
        }
        return n == 1;
    }
}
