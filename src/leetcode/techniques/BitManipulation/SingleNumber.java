package leetcode.techniques.BitManipulation;

public class SingleNumber {

    //Runtime: 1 ms, faster than 94.64% of Java online submissions for Single Number.
    //Memory Usage: 47.7 MB, less than 18.09% of Java online submissions for Single Number.
    //Next challenges:
    //Single Number II
    //Single Number III
    //Missing Number
    //Find the Duplicate Number
    //Find the Difference

    // Time Complexity : O(N)
    // Space Complexity : O(1)
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int i = 0 ; i < nums.length; i++)
        {
            // number ^ number = 0
            // number ^ 0 = number (gives same number back)
            // when we do xor on same pair , it gives us 0. When we do xor of 0 with number not in pair we get the same number back.
            result = result ^ nums[i];
        }

        return result;
    }
}
