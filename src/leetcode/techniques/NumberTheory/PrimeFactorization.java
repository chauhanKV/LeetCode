package leetcode.techniques.NumberTheory;

public class PrimeFactorization {
    public void findPrimeFactors(int n)
    {
        // if p * q < n
        // then p < n and q < n
        // also p < sqrt(n), and this is the reason we run loop till sqrt
        for(int div = 2; div * div <= n; div++) {
            while(n % div == 0)
            {
                System.out.print(div);
                System.out.print(" ");
                n = n / div;
            }

            if(n != 1)
            {
                System.out.print(n);
                System.out.print(" ");
            }
        }
    }
}
