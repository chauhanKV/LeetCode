package leetcode.techniques.NumberTheory;

public class PrimeFactorization {
    public void findPrimeFactors(int n)
    {
        int quotient = 0, remainder = -1, i = 2;

        while(quotient != 1)
        {
            if(remainder > 0)
            {
                i++;
                remainder = n % i;
            }
            else
            {
                quotient = n / i;
                remainder = n % i;

                if(remainder == 0)
                {
                    n = quotient;
                    System.out.print(i);
                    System.out.print(' ');
                }
            }
        }
    }
}
