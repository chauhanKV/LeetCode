package leetcode.techniques.NumberTheory;

public class CountPrimeNumbers {

    // Sieve of Eratosthenes
    // Understand more clearly.
    public int countPrimes(int n) {
        if(n == 0) return 0;
        boolean isPrime[] = new boolean[n+1];
        int countPrime = 0;

        for(int i = 0 ; i < isPrime.length; i++)
        {
            isPrime[i] = true;
        }
        isPrime[0] = false;
        isPrime[1] = false;

        for(int i = 2; i * i <= n ; i++)
        {
            if(isPrime[i] == true)
            {
                for(int j = i * i; j <= n; j = j+i)
                {
                    isPrime[j] = false;
                }
            }
        }

        for(int i = 0 ; i < isPrime.length; i++)
        {
            if(isPrime[i] == true)
            {
                countPrime++;
            }
        }
        return countPrime;
    }
}
