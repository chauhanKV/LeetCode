package leetcode.techniques.SlidingWindow;

public class BinarySubArraysWithSum {
    public int numSubarraysWithSum(int[] nums, int goal) {
      return prefixSum(nums, goal) - prefixSum(nums, goal - 1);
    }

    public int prefixSum(int[] nums, int goal)
    {
        if(goal < 0) return 0;

        int start = 0;
        int result = 0;

        for(int end = 0; end < nums.length; end++)
        {
            goal -= nums[end];
            while(goal < 0)
            {
                goal += nums[start];
                start++;
            }
            result += end - start + 1;
        }

        return result;
    }
}
