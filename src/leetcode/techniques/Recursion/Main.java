package leetcode.techniques.Recursion;

import leetcode.techniques.Sorting.MergeArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

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
        array2.findMin(new int[]{2, 2, 2, 0, 1});
        System.out.println("Minimum in rotated sorted array having duplicate using Binary Search Recursion is : " + array2.findMin(new int[]{3, 1}));

        MergeSortArrayUsingRecursion sortRecursion = new MergeSortArrayUsingRecursion();
        int[] sortedArray = sortRecursion.MergeSortArrayUsingRecursionWithSpace(new int[]{6, 12, 8, 3, 0, 45, 19, 32, 4});
        System.out.println("Merge Sort using Recursion : " + Arrays.toString(sortedArray));

        sortRecursion.MergeSortArrayUsingRecursionInPlace(new int[]{6, 12, 8, 3, 0, 45, 19, 32, 4});

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
        quick.sortArrayUsingQuickSort(new int[]{1, 4, 5, 3, 2, 6, 7, 0});

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
        System.out.println("Maze paths for given matrix dimension are " + paths.getMazePaths(1, 1, 3, 3));

        NumberOfDiceRolls dice = new NumberOfDiceRolls();
        System.out.println("Count of possibility of Number of dice rolls that sum up to target is : " + dice.numRollsToTarget(2, 6, 4));

        UniquePaths uniquePaths = new UniquePaths();
        System.out.println("Number of unique Paths are : " + uniquePaths.uniquePaths(3, 7));
        System.out.println("Number of unique Paths with reduced recursion call : " + uniquePaths.uniquePathsReducedRecursion(3, 3));
        System.out.println("Unique Paths are : " + uniquePaths.printUniquePaths(3, 3));
        System.out.println("Printing Unique paths including Diagonal path : " + uniquePaths.printUniquePathsDiagonally(3, 3));
        boolean[][] arr = new boolean[][]{{true, true, true}, {true, false, true}, {true, true, true}};
        System.out.print("Print unique paths with obstacle : ");
        uniquePaths.printPathWithObstacle(arr);
        int[][] obstacles = new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        System.out.println("Print count of paths with Obstacle : " + uniquePaths.countUniquePathsWithObstacles(obstacles));
        boolean[][] inputArray = new boolean[][]{{true, true, true}, {true, true, true}, {true, true, true}};
        System.out.println("BACKTRACKING - All possible paths in all direction without repeating the same path are :");
        uniquePaths.printAllPossiblePathsInAllDirections(inputArray);
        System.out.println("BACKTRACKING : Print all paths in matrix and string format : ");
        uniquePaths.printAllPathsInMatrix(inputArray);
        // Optimized using DP
        System.out.println("Paths count with Obstacles using DP for huge test cases : " + uniquePaths.uniquePathsWithObstaclesDP(obstacles));

        MinimumPathSum minPath = new MinimumPathSum();
        int minPathValue = minPath.minPathSum(new int[][]{{1, 2}, {1, 1}});
        System.out.println("Path with minimum sum value in a matrix is : " + minPathValue);

        SquareRoot sqRt = new SquareRoot();
        System.out.println("Square root using Newton Raphson method + Recursion : " + sqRt.findSquareRootUsingNewtonRaphson(427));

        MazePathsWithJumps jumps = new MazePathsWithJumps();
        System.out.println("Maze Path with Jumps are : " + jumps.getMazePathWithJumps(4, 4));

        PrintEncodings print = new PrintEncodings();
        System.out.print("Encoding value of the number is : ");
        print.printAllEncodings("123");

        FloodFillNados floodNados = new FloodFillNados();
        floodNados.floodFillRecursion(new int[][]{{0, 0, 0}, {1, 0, 1}, {0, 0, 0}});

        FloodFillLeetCode floodLeetCode = new FloodFillLeetCode();
        int[][] floodResult = floodLeetCode.floodFill(new int[][]{{1, 1, 1}, {1, 1, 0}, {1, 0, 1}}, 1, 1, 2);
        System.out.println("Flood Fill LeetCode result : " + Arrays.deepToString(floodResult));

        IslandPerimeter perimeter = new IslandPerimeter();
        int perimeterValue = perimeter.islandPerimeter(new int[][]{{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}});
        System.out.println("Perimeter of Island is : " + perimeterValue);

        CombinationSum combinationSum = new CombinationSum();
        List<List<Integer>> subsetCombination = combinationSum.combinationSum(new int[]{2, 3, 6, 7}, 7);
        System.out.println("Combination Sum : " + subsetCombination);

        TargetSumSubset subSubSet = new TargetSumSubset();
        System.out.println("Target Sum Subset are : ");
        subSubSet.printTargetSumSubsets(new int[]{10, 20, 30}, 0, "", 0, 30);

        CombinationSumII combinationSumII = new CombinationSumII();
        List<List<Integer>> result2 = combinationSumII.combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8);
        System.out.println("Combination Sum II : " + result2);

        SubSets sets = new SubSets();
        List<List<Integer>> resultSubset1 = sets.subsets(new int[]{1, 2, 3});
        System.out.println("All Subsets(Power Set) of given array are : " + resultSubset1);

        SubSetsII setsII = new SubSetsII();
        List<List<Integer>> resultSubset2 = setsII.subsetsWithDup(new int[]{1, 2, 2});
        System.out.println("All Subsets(Power Set) of given array are without duplicates are : " + resultSubset2);

        Permutations permutations = new Permutations();
        System.out.println("Permutation using subset method are : " + permutations.permute(new int[]{1, 2, 3}));

        PermutationsII permutationsII = new PermutationsII();
        List<List<Integer>> permuteIIResult = permutationsII.permuteUnique(new int[]{3, 3, 0, 3});
        System.out.println("Permutation II results : " + permuteIIResult);

        NQueens queens = new NQueens();
        List<List<String>> queensData = queens.solveNQueens(4);
        System.out.println("Queens : " + queensData);

        NQueensII queensII = new NQueensII();
        int queensDataII = queensII.totalNQueens(4);
        System.out.println("Queens Count: " + queensDataII);

        ValidPalindrome palindrome = new ValidPalindrome();
        System.out.println("Is the given string palindrome ? : " + palindrome.isPalindrome("A man, a plan, a canal: Panama"));

        SudokuSolver solver = new SudokuSolver();
        solver.solveSudoku(new char[][]{
                {'9', '5', '7', '.', '1', '3', '.', '8', '4'},
                {'4', '8', '3', '.', '5', '7', '1', '.', '6'},
                {'.', '1', '2', '.', '4', '9', '5', '3', '7'},
                {'1', '7', '.', '3', '.', '4', '9', '.', '2'},
                {'5', '.', '4', '9', '7', '.', '3', '6', '.'},
                {'3', '.', '9', '5', '.', '8', '7', '.', '1'},
                {'8', '4', '5', '7', '9', '.', '6', '1', '3'},
                {'.', '9', '1', '.', '3', '6', '.', '7', '5'},
                {'7', '.', '6', '1', '8', '5', '4', '.', '9'}
        });


        ValidSudoku validate = new ValidSudoku();
        boolean isValid = validate.isValidSudoku(new char[][]{
                {'9', '.', '7', '.', '1', '3', '.', '8', '4'},
                {'.', '.', '3', '.', '5', '.', '1', '.', '.'},
                {'.', '1', '2', '.', '4', '.', '.', '3', '7'},
                {'1', '.', '.', '3', '.', '4', '9', '.', '.'},
                {'.', '.', '4', '9', '7', '.', '.', '6', '.'},
                {'3', '.', '9', '.', '.', '8', '7', '.', '.'},
                {'8', '4', '.', '7', '9', '.', '.', '1', '3'},
                {'.', '9', '1', '.', '.', '.', '.', '7', '.'},
                {'.', '.', '6', '.', '.', '5', '4', '.', '9'}
        });
        System.out.println("The sudoku is valid : " + isValid);

        CombinationSumIII combinationSumIII = new CombinationSumIII();
        List<List<Integer>> resultIII = combinationSumIII.combinationSum3(3, 7);
        System.out.println("Combination Sum III : " + resultIII);

        PalindromicPartitioning partitioning = new PalindromicPartitioning();
        List<List<String>> resultPartition = partitioning.partition("aabbccde");
        System.out.println("Palindromic Partitioning : " + resultPartition);

        PalindromePartitionII partitionII = new PalindromePartitionII();
        int minCut = partitionII.minCut("aaabbbcdefgmadam");
        System.out.println("Min Cut needed for Palindrome Partitioning are : " + minCut);

        CombinationSumIV combinationSumIV = new CombinationSumIV();
        int combinationIVCount = combinationSumIV.combinationSum4(new int[]{1,2,3}, 32);
        System.out.println("Combination Sum IV : " + combinationIVCount);

        PermutationSequence sequence = new PermutationSequence();
        String sequenceValue = sequence.getPermutation(4, 17);
        System.out.println("Kth Permutation Sequence is : " + sequenceValue);

        Stack<Integer> objStack = new Stack<>();
        objStack.push(1);
        objStack.push(2);
        objStack.push(3);
        objStack.push(4);
        objStack.push(5);
        StackOperations op = new StackOperations();
        op.reverse(objStack);

        KthSymbolGrammar symbol = new KthSymbolGrammar();
        System.out.println("kth Symbol Grammar : " + symbol.kthGrammar(3, 4));
    }
}
