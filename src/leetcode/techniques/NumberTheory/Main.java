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

        PrimeTillN prime = new PrimeTillN();
        prime.printPrimeTillN(23, 57);

        FibonacciNumber fib = new FibonacciNumber();
        int fibNo = fib.fib(10);
        System.out.println("Fibonacci Number is : " + fibNo);

        int fibRecursive = fib.fibRecursive(10);
        System.out.println("Fibonacci Number with Recursive Approach : " + fibRecursive);

        PrintFibonacciTillN tillN = new PrintFibonacciTillN();
        tillN.Printfib(10);
    }
}
