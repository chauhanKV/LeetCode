package leetcode.techniques.Recursion;

public class Main {
    public static void main(String[] args) {
        BinarySearchWithRecursion recursionSearch = new BinarySearchWithRecursion();
        System.out.println("Result after binary search using recursion is : " + recursionSearch.search(new int[]{-1, 0, 3, 5, 9, 12}, 2));

        PowerLinear pow = new PowerLinear();
        System.out.println("Power with normal recursion approach : " + pow.power(2, 9));

        PowerLogarithmic powLog = new PowerLogarithmic();
        System.out.println("Power with logarithmic recursion approach : " + powLog.powerAnotherLogic(3, 6));

        PositiveNegativePower negPosPow = new PositiveNegativePower();
        System.out.println(negPosPow.myPow(8, -3));

        ZigZag zig = new ZigZag();
        zig.printZigZag(3);

        NumberOfStepsToReduce reduce = new NumberOfStepsToReduce();
        System.out.println("Number of steps to reduce to 0 : " + reduce.numberOfSteps(14));

        PowerOfTwo two = new PowerOfTwo();
        System.out.println("is number power of 2 ? : " + two.isPowerOfTwo(16));

        TowerOfHanoi tower = new TowerOfHanoi();
        tower.printTowerOfHanoiSolution(3, 11, 12, 13);

        MaxOfArray max = new MaxOfArray();
        int maxValue = max.maxOfArray(new int[]{22, 33, 4, 5, 78, 9}, 0);
        System.out.println("Max of an array is : " + maxValue);

        FindFirstIndex firstIndex = new FindFirstIndex();
        System.out.println("First index of given number after using recursion is : " + firstIndex.firstIndex(new int[]{2, 3, 4, 5, 3, 7, 8, 4}, 0, 4));

        FindLastIndex lastIndex = new FindLastIndex();
        System.out.println("Last index of given number after using recursion is : " + lastIndex.lastIndex(new int[]{2, 3, 4, 5, 3, 7, 8, 4}, 0, 4));

        CountOperationsToZero zero = new CountOperationsToZero();
        System.out.println("Count number of operations to return to zero using recursion : " + zero.countOperations(5, 7));

        CheckIfArrayIsSorted checkArray = new CheckIfArrayIsSorted();
        System.out.println("Check whether the given Array is sorted using Recursion : " + checkArray.checkIfArraySorted(new int[]{1, 2, 3, 4, 5}));
        System.out.println("Check whether the given Array is sorted using Recursion : " + checkArray.checkIfArraySorted(new int[]{1, 2, 8, 4, 5}));

        LinearSearchUsingRecursion linear = new LinearSearchUsingRecursion();
        System.out.println("Linear search index of target using recursion : " + linear.SearchIndex(new int[]{1, 2, 3, 4, 5}, 4));

        System.out.println("Multiple occurances of target using recursion : " + linear.SearchMultipleOccurnances(new int[]{1, 2, 3, 4, 4, 5, 6}, 4));

        BinarySearchInRotatedArray rotatedArray = new BinarySearchInRotatedArray();
        System.out.println("Search index of the target using Binary Search and Recursion : " + rotatedArray.search(new int[]{5, 6, 7, 8, 9, 1, 2, 3}, 0));
    }
}
