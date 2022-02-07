package leetcode.techniques.NumberTheory;

import java.util.ArrayList;
import java.util.List;

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

        ClimbingStairs cs = new ClimbingStairs();
        int countWays = cs.climbStairs(10);
        System.out.println("Number of ways to climb the stairs are : " + countWays);

        Tribonnaci tri = new Tribonnaci();
        int value = tri.tribonacciValue(10);
        System.out.println("Tribonnaci value of input number is : " + value);

        InverseANumber inverse = new InverseANumber();
        int inverted = inverse.InverseNumber(231645);
        System.out.println("Inverted number is : " + inverted);

        FizzBuzz fizz = new FizzBuzz();
        List<String> fizValue = fizz.fizzBuzz(10);
        System.out.println("FizzBuzz value is : " + fizValue);

        Palindrome palindrome = new Palindrome();
        boolean isPalindrome = palindrome.isPalindrome(12321);
        System.out.println("Is Number Palindrome ? : " + isPalindrome);

        RotateANumber rotate = new RotateANumber();
        int rotation = rotate.rotateNumber(325233, -546345345);
        System.out.println("Rotated number is : " + rotation);

        GCDandLCM gcdlcm = new GCDandLCM();
        gcdlcm.getGCD(12, 8);

        gcdlcm.getGCDByEuclideansAlgo(12, 8);

        Sqrt root = new Sqrt();
        int rt = root.findSqrt(240);
        System.out.println("Square Root of number is : " + rt);

        PrimeFactorization primeFactor = new PrimeFactorization();
        primeFactor.findPrimeFactors(30);
    }
}
