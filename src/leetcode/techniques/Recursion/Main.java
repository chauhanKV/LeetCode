package leetcode.techniques.Recursion;

import leetcode.techniques.Sorting.MergeArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

        System.out.println("Multiple occurrences of target using recursion : " + linear.SearchMultipleOccurnances(new int[]{1, 2, 3, 4, 4, 5, 6}, 4));

        BinarySearchInRotatedArray rotatedArray = new BinarySearchInRotatedArray();
        System.out.println("Search index of the target using Binary Search and Recursion : " + rotatedArray.search(new int[]{5, 6, 7, 8, 9, 1, 2, 3}, 0));

        AllIndicesOfArray indices = new AllIndicesOfArray();
        System.out.println("Indices of occurrences using array are : " + Arrays.toString(indices.returnAllIndicesInArray(new int[]{1, 2, 3, 4, 5, 4, 6, 7}, 4)));

        PrintTriangle printTriangle = new PrintTriangle();
        System.out.println("Triangle printed in inverted format using recursion : ");
        printTriangle.reverseTriangle(4, 0);

        System.out.println("Triangle print in normal format using recursion : ");
        printTriangle.normalTriangle(4, 0);
        System.out.println();

        SortArrayUsingBubbleSortRecursion sort = new SortArrayUsingBubbleSortRecursion();
        sort.sortArrayAscending(new int[]{5, 4, 3, 2, 1});

        MoveAllZeros move = new MoveAllZeros();
        move.moveZeroes(new int[]{0, 1, 0, 3, 12});

        SelectionSortWithRecursion selection = new SelectionSortWithRecursion();
        selection.selectionSortArray(new int[]{4, 3, 2, 8, 1});

        FindMinimumInRotatedSortedArray array1 = new FindMinimumInRotatedSortedArray();
        System.out.println("Minimum in rotated sorted array using Binary Search Recursion is : " + array1.findMin(new int[]{3, 1, 2}));

        FindMinimumInRotatedSortedArray2 array2 = new FindMinimumInRotatedSortedArray2();
        array2.findMin(new int[]{2,2,2,0,1});
        System.out.println("Minimum in rotated sorted array having duplicate using Binary Search Recursion is : " + array2.findMin(new int[]{3, 1}));

        MergeSortArrayUsingRecursion sortRecursion = new MergeSortArrayUsingRecursion();
        int[] sortedArray = sortRecursion.MergeSortArrayUsingRecursionWithSpace(new int[] {6,12,8,3,0,45,19,32,4});
        System.out.println("Merge Sort using Recursion : " + Arrays.toString(sortedArray));

        sortRecursion.MergeSortArrayUsingRecursionInPlace(new int[] {6,12,8,3,0,45,19,32,4});

        // Subsequence questions using Recursion
        GetSubsequence subsequence = new GetSubsequence();
        ArrayList<String> result = subsequence.getAllSubsequences("abc");
        System.out.println("All subsequences of the given string are : " + result);

        subsequence.getAllSubsequencesUsingSubsetPattern("abc");

        IsSubsequence isSub = new IsSubsequence();
        System.out.println("Is the given string value subsequence of the string ? : " + isSub.isSubsequence("abc", "ahbgdc"));

        System.out.println("Is the given string value subsequence of the string (with recursion logic) ? : " + isSub.isSubsequenceWithRecursion("abc", "ahbgdc"));

        // QuickSort Algorithm
        QuickSortUsingRecursion quick = new QuickSortUsingRecursion();
        quick.sortArrayUsingQuickSort(new int[]{1,4,5,3,2,6,7,0});

        LetterCombinationOfPhoneNumber combination = new LetterCombinationOfPhoneNumber();
        List<String> str = combination.letterCombinations("57");
        System.out.println("List of combinations : " + str);

        List<String> str1 = combination.letterCombinationsUsingKunalApproach("57");
        System.out.println("List of combinations of pressed number using Kunal's approach is : " + str1);

        Power pw = new Power();
        System.out.println("Power of given number without using Math.pow is : " + pw.myPow(6, 3));

        Permutation permutation = new Permutation();
        // Permutation of any string is factorial of given string Length
        permutation.printPermutations("", "abc");
        System.out.println("Printing all permutation of string using ArrayList : " + permutation.printPermutationList("", "abcd"));
        System.out.println("Count of permutation in a string is : " + permutation.printPermutationCount("", "abcdef"));

        ClimbingStairsCombinations combinations = new ClimbingStairsCombinations();
        System.out.println("Climbing stairs combinations for a given number are : " + combinations.climbingStairsCombination(5));

        ClimbingStairsCount combinationCount = new ClimbingStairsCount();
        System.out.println("Climbing Stairs combination count for a given number is : " + combinationCount.climbStairs(41));

        MazePaths paths = new MazePaths();
        System.out.println("Maze paths for given matrix dimension are " + paths.getMazePaths(1,1, 3,3));

        NumberOfDiceRolls dice = new NumberOfDiceRolls();
        System.out.println("Count of possibility of Number of dice rolls that sum up to target is : " + dice.numRollsToTarget(2, 6, 4));

        UniquePaths uniquePaths = new UniquePaths();
        //uniquePaths.uniquePaths(3,7);
        System.out.println("Number of unique Paths are : " + uniquePaths.uniquePaths(3,7));
    }
}
