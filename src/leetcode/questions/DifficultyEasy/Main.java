package leetcode.questions.DifficultyEasy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ValidAnagrams validAnagrams = new ValidAnagrams();
        System.out.println("Is it a Valid Anagram ? " + validAnagrams.isAnagram("anagram", "nagaram"));

        TwoSum twosum = new TwoSum();
        var twoSumResult = twosum.twoSum(new int[]{2,5,5,11},10 );
        System.out.println("Two numbers that add upto the given target is : " + Arrays.toString(twoSumResult));

        TwoSumII twoSumII = new TwoSumII();
        var twoSumIIResult = twoSumII.twoSum(new int[]{2,7,11,15}, 9);
        System.out.println("Two numbers that add upto the given target II is : " + Arrays.toString(twoSumIIResult));

        MinStack obj = new MinStack();
        obj.push(2);
        obj.push(0);
        obj.push(3);
        obj.push(0);
        int param_1 = obj.getMin();
        obj.pop();
        int param_2 = obj.getMin();
        obj.pop();
        int param_3 = obj.getMin();
        obj.pop();
        int param_4 = obj.getMin();
        System.out.println("Value at the top of Stack is  : " + param_1);
        System.out.println("Value at the top of Stack is  : " + param_2);
        System.out.println("Value at the top of Stack is  : " + param_3);
        System.out.println("Min value in Stack is  : " + param_4);

        AddDigits addDigits = new AddDigits();
        int addition = addDigits.addDigits(38);
        System.out.println("Addition of input value is : " +addition);

        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        System.out.println("Contains Duplicate ? : " + containsDuplicate.containsDuplicate(new int[]{1,2,3,1}));

        ValidParentheses vlid = new ValidParentheses();
        boolean isValid = vlid.isValid("{()}}]");
        System.out.println("Are parentheses valid ? : " + isValid);

        RunningSum sum = new RunningSum();
        int[] arr = sum.runningSumOf1dArray(new int[] {1,3,6,4,7});
        System.out.println("Running sum of array is : " + Arrays.toString(arr));

        SumOf2Arrays sumOfArrays = new SumOf2Arrays();
        int[] sumValue = sumOfArrays.sumOfArrays(new int[] {3,1,0,7,5}, new int[] {1,1,1,1,1,1});
        System.out.println("Sum of two arrays is : " + Arrays.toString(sumValue));

        DifferenceOf2Arrays difference = new DifferenceOf2Arrays();
        int[] diffValue = difference.differenceOfArrays(new int[] {2,6,7}, new int[] {1,0,0,0});
        System.out.println("Difference of 2 arrays : " + Arrays.toString(diffValue));
    }
}
