package leetcode.techniques.NumberTheory;

import java.util.ArrayList;
import java.util.Arrays;
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

        PrimeFactorization primeFactor = new PrimeFactorization();
        primeFactor.findPrimeFactors(30);
        System.out.println(" ");

        PythagoreanTriplet triple = new PythagoreanTriplet();
        boolean isTriplet = triple.isPythagoreanTriplet(3, 4, 5);
        System.out.println("Are the given numbers Pythagorean Triplet ? " + isTriplet);

//        MissingNumbers missing = new MissingNumbers();
//        int number = missing.missingNumber(new int[]{3,0,1});
//        System.out.println("Missing Number is : " + number);

        BenjaminBulbs bulbs = new BenjaminBulbs();
        System.out.print("Bulbs that are on after N fluctuations are : ");
        bulbs.findOnBenjaminBulbsOptimized(20);
        System.out.println(" ");

        BulbSwitcher switcher = new BulbSwitcher();
        int switchedBulbs = switcher.bulbSwitch(20);
        System.out.println("Bulbs switched on after N fluctuations are : " + switchedBulbs);

        MaxMin2 maxMin = new MaxMin2();
        maxMin.getMaxMin(new int[] {3, 7, 2, -1, 4, 9});

        PowerOfThree three = new PowerOfThree();
        boolean powThree = three.isPowerOfThree(27);
        System.out.println("Is number power of 3 ? : " + powThree);

        PowerOfFour four = new PowerOfFour();
        boolean powFour = four.isPowerOfFour(27);
        System.out.println("Is number power of 4 ? : " + powFour);

        ConvertToAnyBase convertAnyBase = new ConvertToAnyBase();
        int conversionToAny = convertAnyBase.getValueInBase(57, 2);
        System.out.println("Number converted to any base is : " + conversionToAny);

        AnyBaseToDecimal anybase = new AnyBaseToDecimal();
        int toDecimal = anybase.getValueIndecimal(111001, 2);
        System.out.println("Any base to decimal conversion is : " + toDecimal);

        ConvertToBase7 convertBase7 = new ConvertToBase7();
        String base7 = convertBase7.convertToBase7(57);
        System.out.println("Number converted to base 7 is : " + base7);

        Sqrt root = new Sqrt();
        int rtBS = root.mySqrtUsingBinarySearch(40);
        System.out.println("Square Root of number is using Binary Search is : " + rtBS);

        double rtNRM = root.mySqrtUsingNewtonRaphsonMethod(40);
        System.out.print("Square Root of number is using Newton Raphson Method is : ");
        System.out.printf("%.3f" , rtNRM);
        System.out.println();

        AnyBaseToAnyBase any = new AnyBaseToAnyBase();
        int anyBaseConversion = any.ConvertAnyBasetoAnyBase(8, 2, 634);
        System.out.println("Any base to Any base conversion gives : " + anyBaseConversion);

        SumBase base = new SumBase();
        int addition = base.sumBaseValue(34, 6);
        System.out.println("Addition of digits in base k is : " + addition);

        AnyBaseAddition anyBaseAddition = new AnyBaseAddition();
        int baseAddition = anyBaseAddition.getSum(8, 777, 1);
        System.out.println("Any base Addition gives : " + baseAddition);

        AnyBaseSubstraction anyBaseSubstraction = new AnyBaseSubstraction();
        int baseSubstraction = anyBaseSubstraction.getSubstraction(8, 777, 1);
        System.out.println("Any base Substraction gives : " + baseSubstraction);

        AnyBaseMultiplication anyBaseMultiplication = new AnyBaseMultiplication();
        int baseMultiplication = anyBaseMultiplication.getMultiplication(8, 777, 1);
        System.out.println("Any base Multiplication gives : " + baseMultiplication);

        SubSetOfArray subSet = new SubSetOfArray();
        List<List<Integer>> subSets = subSet.subsets(new int[]{10, 20, 30});
        System.out.println("Subset of an Array are / Power Set : " + Arrays.toString(subSets.toArray()));

        ConvertToTitleExcel excel = new ConvertToTitleExcel();
        System.out.println("Excel sheet column number is : " + excel.convertToTitle(6234));

        MinimumCostToMoveChips moveChips = new MinimumCostToMoveChips();
        System.out.println("Minimum cost to move chips to same position : " + moveChips.minCostToMoveChips(new int[] {2,2,2,3,3,4,4,4}));

        MaximumProductOfThreeNumbers maxProduct = new MaximumProductOfThreeNumbers();
        System.out.println("Maximum Product of Tnree numbers is : " + maxProduct.maximumProduct(new int[] {1,2,3,4}));

        DetermineColorOfaChessBoardSquare determineColor = new DetermineColorOfaChessBoardSquare();
        System.out.println("Color of Given coordinate is in chessboard is : " + determineColor.squareIsWhite("h2"));
    }
}
