package leetcode.techniques.NumberTheory;

public class GCDandLCM {
    public void getGCD(int a, int b) {

        int aTemp = a, bTemp = b;

        // Calculate GCD
        int remainder = Integer.MIN_VALUE;

        while(remainder != 0)
        {
            remainder = a % b;
            a = b;
            b = remainder;
        }

        // Calculate LCM
        int lcm = aTemp * bTemp / a;

        System.out.println("Greatest Common Divisor of " + aTemp + " & " + bTemp + " using long division method is : " + a);
        System.out.println("Least Common multiple of " + aTemp + " & " + bTemp + " using formula approach is : " + lcm);

    }

    public void getGCDByEuclideansAlgo(int a, int b)
    {
        int aTemp = a, bTemp = b;

        // Calculate GCD
        while(a != b && a >= 0 && b >= 0)
        {
            if(a > b)
            {
                a = a - b;
            }
            if(b > a)
            {
                b = b - a;
            }
        }

        // Calculate LCM
        int lcm = aTemp * bTemp / a;

        System.out.println("Greatest Common Divisor of " + aTemp + " & " + bTemp + " using Euclidean's Algorithm is : " + a);
        System.out.println("Least Common multiple of " + aTemp + " & " + bTemp + " using formula approach is : " + lcm);
    }
}
