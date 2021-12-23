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
    }
}
