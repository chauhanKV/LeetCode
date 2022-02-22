package leetcode.questions.DifficultyEasy;

public class RunningSum {
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Running Sum of 1d Array.
    //Memory Usage: 43.3 MB, less than 25.05% of Java online submissions for Running Sum of 1d Array.
    //Next challenges:
    //Number of Islands II
    //Increasing Subsequences
    //Maximum Profit of Operating a Centennial Wheel

    // Time Complexity : O(N)
    // Space Complexity : O(1)
    public int[] runningSumOf1dArray(int[] nums) {
        if(nums.length <= 0) return new int[0];

        int sum = 0;

        for(int i = 0 ; i < nums.length; i++)
        {
            sum += nums[i];
            nums[i] = sum;
        }
        return nums;
    }

//    public int[] runningSum(int[] nums) {
//        if(nums.length <= 0) return new int[0];
//
//        for(int i = 1 ; i < nums.length; i++)
//        {
//            nums[i] += nums[i-1];
//        }
//        return nums;
//    }
}
