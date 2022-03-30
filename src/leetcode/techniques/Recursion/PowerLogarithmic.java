package leetcode.techniques.Recursion;

public class PowerLogarithmic {
    public int power(int x, int n){
        // Base Condition
        if(n == 0)
        {
            return 1;
        }

        if(n == 1)
        {
            return x;
        }

        // Actual Logic
        int n1 = n / 2;
        int n2 = n - (n/2);

        return power(x, n1) * power(x, n2);
    }

    public int powerAnotherLogic(int x, int n)
    {
        if(n == 0)
        {
            return 1;
        }

        int xpnm1 = powerAnotherLogic(x, n / 2);
        int xn = xpnm1 * xpnm1;

        if(n % 2 == 1)
        {
            xn = xn * x;
        }

        return xn;
    }
}
