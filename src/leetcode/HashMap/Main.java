package leetcode.HashMap;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        NumberSmallThanCurrent smaller = new NumberSmallThanCurrent();
        System.out.println(Arrays.toString(smaller.smallerNumbersThanCurrent(new int[] {8,0,2,2,4})));

        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSum(new int[] {2,7,11,15}, 9);
        System.out.println("Two Sum : " + Arrays.toString(result));

        SubArraySumEqualK equalK = new SubArraySumEqualK();
        int result1 = equalK.subarraySum(new int[] {1,1,1}, 2);
        System.out.println("SubArray with Sum equal K (Prefix Sum): " + result1);

        PermutationPalindrome permutationPalindrome = new PermutationPalindrome();
        boolean result2 = permutationPalindrome.hasPalindromePermutation("aabcbcd");
        System.out.println("Permutation Palindrome : " + result2);

    }
}
