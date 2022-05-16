package leetcode.techniques.Recursion;

public class Power {
    //Runtime: 1 ms, faster than 76.33% of Java online submissions for Pow(x, n).
    //Memory Usage: 42.7 MB, less than 54.14% of Java online submissions for Pow(x, n).
    //Next challenges:
    //Super Pow

    // TC : O(log N) / O(2Log N)
    // SC : O(log N)
    // Come back for intuition.
    public double myPow(double x, int n) {
        return myPow_util(x, n);
    }

    private double myPow_util(double x, long n) {
        // Base case
        if (n == 0) return 1.0;
        if (n == 1) return x;
        if (n < 0) return myPow_util(1 / x, -n);

        double result = myPow_util(x * x, n / 2);
        if (n % 2 == 1) {
            result *= x;
        }

        return result;
    }
}
