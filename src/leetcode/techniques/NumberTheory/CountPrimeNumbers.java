package leetcode.techniques.NumberTheory;

public class CountPrimeNumbers {

    public int countPrimes(int n) {
        boolean flag = true;
        int primeCount = 1;
        for(int i = 1 ; i < n; i++)
        {
            for(int j = 2 ; j <= i; j++)
            {
                if(i % j == 0)
                {
                    flag = false;
                    break;
                }
            }
            if(flag)
            {
                primeCount++;
            }
        }
        return primeCount;
    }
}
