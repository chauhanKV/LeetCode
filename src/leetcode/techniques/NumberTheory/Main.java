package leetcode.techniques.NumberTheory;

public class Main {
    public static void main(String args[])
    {
        CountPrimeNumbers count = new CountPrimeNumbers();
        int primeCount = count.countPrimes(50);
        System.out.println("Count of prime number are : " + primeCount);

        UglyNumber no = new UglyNumber();
        boolean isNumberUgly = no.isUgly(8);
        System.out.println("Is number ugly ? : " + isNumberUgly);
    }
}
