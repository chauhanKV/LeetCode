package leetcode.techniques.NumberTheory;

public class Main {
    public static void main(String args[])
    {
        CountPrimeNumbers count = new CountPrimeNumbers();
        int primeCount = count.countPrimes(50);
        System.out.println("Count of prime number are : " + primeCount);
    }
}
