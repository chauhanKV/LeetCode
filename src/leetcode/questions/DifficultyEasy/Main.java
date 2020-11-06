package leetcode.questions.DifficultyEasy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ValidAnagrams validAnagrams = new ValidAnagrams();
        System.out.println("Is it a Valid Anagram ? " + validAnagrams.isAnagram("anagram", "nagaram"));

        TwoSum twosum = new TwoSum();
        var twoSumResult = twosum.twoSum(new int[]{2,5,5,11},10 );
        System.out.println("Two numbers that add upto the given target is : " + Arrays.toString(twoSumResult));
    }
}
