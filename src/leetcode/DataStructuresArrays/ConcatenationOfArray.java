package leetcode.DataStructuresArrays;

public class ConcatenationOfArray {
    // Runtime: 1 ms, faster than 86.08% of Java online submissions for Concatenation of Array.
    //Memory Usage: 50.3 MB, less than 13.13% of Java online submissions for Concatenation of Array.
    //Next challenges:
    //Jump Game
    //Pairs of Songs With Total Durations Divisible by 60
    //Find the Kth Largest Integer in the Array

    // Time Complexity : O(N)
    // Space Complexity : O(2*N)
    public int[] getConcatenation(int[] nums) {
        int[] arr = new int[nums.length * 2];

        for(int i = 0 ; i < nums.length; i++)
        {
            int position = i + nums.length;
            arr[i] = nums[i];
            arr[position] = nums[i];
        }

        return arr;
    }
}
