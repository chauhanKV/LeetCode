package leetcode.techniques.SlidingWindow;

import java.util.Arrays;

public class SlidingWindowMain {
    public static void main(String[] args) {

        MaximumNoOfVowels maximumNoOfVowels = new MaximumNoOfVowels();

        var maxVowels = maximumNoOfVowels.maxVowels("abciiidef", 3);
        System.out.println("Max vowels in size K is : "+ maxVowels);

        MaximumPointsFromCards maximumPointsFromCards = new MaximumPointsFromCards();
        var maxScore = maximumPointsFromCards.maxScore(new int[] {1,2,3,4,5,6,1}, 3);
        System.out.println("Max score from Cards is : "+ maxScore);

        PermutationInString permutationInString = new PermutationInString();
        var exists = permutationInString.checkInclusion("ab", "eidbaooo");
        System.out.println("Permutation in string : " + exists);

        GrumpyBookStore grumpyBookStore = new GrumpyBookStore();
        var customers = grumpyBookStore.maxSatisfied(new int[]{1,0,1,2,1,1,7,5}, new int[]{0,1,0,1,0,1,0,1}, 4);
        System.out.println("Satisfied Customers are : " + customers);

        SlidingWindowMaximum slidingWindowMaximum = new SlidingWindowMaximum();
        var maxSliding = slidingWindowMaximum.maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7}, 3);
        System.out.println("Sliding Window Maximum is : " + Arrays.toString(maxSliding));

        LongestContinousSubarray longestContinousSubarray = new LongestContinousSubarray();
        var maxSubarrayLength = longestContinousSubarray.longestSubarray(new int[]{10,1,2,4,7,2}, 5);
        System.out.println("Longest Continous Subarray is : " + maxSubarrayLength);

        LongestRepeatingCharacterReplacement longestReplacement = new LongestRepeatingCharacterReplacement();
        var longestChar = longestReplacement.characterReplacement("AABABBADDDDADADD", 2);
        System.out.println("Longest repeating character replacement : " + longestChar);
    }
}
