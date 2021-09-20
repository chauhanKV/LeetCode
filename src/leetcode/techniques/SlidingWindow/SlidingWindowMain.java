package leetcode.techniques.SlidingWindow;

import java.util.Arrays;
import java.util.List;

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
        var longestChar = longestReplacement.characterReplacement("AAABCCD", 2);
        System.out.println("Longest repeating character replacement : " + longestChar);

        MaxConsecutiveOnesIII maxConsecutiveOnesIII = new MaxConsecutiveOnesIII();
        var maxOnes = maxConsecutiveOnesIII.longestOnes(new int[]{1,1,1,0,0,0,1,1,1,1,0}, 2);
        System.out.println("Max Consecutive Ones III is : " + maxOnes);

        LongestSubstringWithoutRepeatingCharacters longestString = new LongestSubstringWithoutRepeatingCharacters();
        var longestNonRepeatingChars = longestString.lengthOfLongestSubstring("aab");
        System.out.println("Longest Substring without Repeating Characters : " + longestNonRepeatingChars);

        LongestSubstringWithKDistinctCharacters kDistinctCharacters = new LongestSubstringWithKDistinctCharacters();
        var distinctChar = kDistinctCharacters.LongestSubstring("aabacbebebe", 2);
        System.out.println("Longest string with K distinct character: " + distinctChar);

        LongestSubstringWithKDistinctCount kDistinctCount = new LongestSubstringWithKDistinctCount();
        var distinctCount = kDistinctCount.findLength("aabacbebebe", 2);
        System.out.println("Longest string with K distinct Count: " + distinctCount);

        LongestSubstringWithTwoDistinctCharacters twoDistinctCharacters = new LongestSubstringWithTwoDistinctCharacters();
        var distinct2Char = twoDistinctCharacters.lengthOfLongestSubstringTwoDistinct("aaa");
        System.out.println("Longest sustring with 2 distinct characters: " + distinct2Char);

        MinimumSizeSubArraySum minimumSizeSubArraySum = new MinimumSizeSubArraySum();
        var minArraySize = minimumSizeSubArraySum.minSubArrayLen(7, new int[]{2,3,1,2,4,3});
        System.out.println("Minimum Size SubArray Sum is : " + minArraySize);

        MaximumSizeSubArraySizeEqualsK maxSubArray = new MaximumSizeSubArraySizeEqualsK();
        var maxArraySize = maxSubArray.maxSubArrayLenEqualsK(7, new int[]{2,3,1,2,4,3});
        System.out.println("Maximum Size SubArray Sum equals to K is : " + maxArraySize);

        FindAllAnagramsInString anagramsInString = new FindAllAnagramsInString();
        anagramsInString.findAnagrams("aebdcdefabc", "abc");

        NumberOfSubsequenceThatSatisfyGivenCondition subsequence = new NumberOfSubsequenceThatSatisfyGivenCondition();
        var subsequenceCount = subsequence.numSubseq(new int[]{7, 10, 7, 3, 7, 5,4},12 );
        System.out.println("Number of subsequences that satisfy given sum condition are : " + subsequenceCount);

        SubstringwithConcatenationOfAllWords concatenation = new SubstringwithConcatenationOfAllWords();
        List<Integer> result = concatenation.findWordConcatenation("lingmindraboofooowingdingbarrwingmonkeypoundcake", new String[] { "fooo","barr","wing","ding","wing" });
        System.out.println("Substring with Concatenation Of All Words : " + result);

        MinimumWindowSubstring minimumWindowSubstring = new MinimumWindowSubstring();
        String res = minimumWindowSubstring.minWindow("ADOBECODEBANC", "ABC");
        System.out.println("Minimum Window substring : " + res);

        MaximumAvgSubarrayI maximumAvgSubarrayI = new MaximumAvgSubarrayI();
        double output = maximumAvgSubarrayI.findMaxAverage(new int[] {1,12,-5,-6,50,3}, 4);
        System.out.println("Maximum Average Subarray I : " + output);
    }
}
