package leetcode.techniques.SlidingWindow;

public class MinimumSizeSubArraySum {
    public int minSubArrayLen(int s, int[] nums) {
        if(nums == null || nums.length <= 0) return 0;

        int minSubArrayLength = Integer.MAX_VALUE;
        int start = 0;
        int currentRunningSum = 0;

        for(int end = 0 ; end < nums.length; end++)
        {
            currentRunningSum += nums[end];
            while(currentRunningSum >= s)
            {
                minSubArrayLength = Math.min((end - start + 1) , minSubArrayLength );
                currentRunningSum -= nums[start++];
            }
        }

        return minSubArrayLength == Integer.MAX_VALUE ? 0 : minSubArrayLength;
    }
}
