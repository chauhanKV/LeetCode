package leetcode.techniques.BitManipulation;

public class SingleNumberII {
    //Runtime: 1 ms, faster than 86.10% of Java online submissions for Single Number II.
    //Memory Usage: 40.9 MB, less than 38.17% of Java online submissions for Single Number II.
    //Next challenges:
    //Single Number III


    // Time Complexity : O(N)
    // Space Complexity : O(1)
    public int singleNumber(int[] nums) {
        int ones = 0, twos = 0;
        for(int i = 0 ; i < nums.length; i++)
        {
            ones = (ones ^ nums[i]) & ~twos;
            twos = (twos ^ nums[i]) & ~ones;
        }
        return ones;
    }
}
