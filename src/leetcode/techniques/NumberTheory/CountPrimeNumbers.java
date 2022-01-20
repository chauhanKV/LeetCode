package leetcode.techniques.NumberTheory;

public class CountPrimeNumbers {


    // Sieve of Eratosthenes

    //Runtime: 245 ms, faster than 16.32% of Java online submissions for Count Primes.
    //Memory Usage: 65.2 MB, less than 37.01% of Java online submissions for Count Primes.
    //Next challenges:
    //Ugly Number
    //Ugly Number II
    //Perfect Squares

    // Time Complexity -
    // Space Complexity -
    public int countPrimes(int n) {
        // Create boolean array with size n
        boolean[] isPrime = new boolean[n];

        // Fill all values from 2 index as true; consider all prime initially.
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }

        int primeCounter = 0;

        // run the loop till root of n or while coding -> i * i < n as we cannot create square root function
        for(int i = 2; i * i < isPrime.length; i++)
        {
            // Run below code if we that index is not marked false;
            if(isPrime[i] == true)
            {
                // initialize div to square of i and let div jump in multiples of i
                for(int div = i * i; div < isPrime.length; div += i)
                {
                    isPrime[div] = false;
                }
            }
        }

        for(int i = 2; i < isPrime.length; i++)
        {
            if(isPrime[i])
            {
                primeCounter++;
            }
        }


        return primeCounter;
    }
}
