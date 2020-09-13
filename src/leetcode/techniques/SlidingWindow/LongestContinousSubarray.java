package leetcode.techniques.SlidingWindow;

public class LongestContinousSubarray {

    public int longestSubarray(int[] nums, int limit) {

        if(nums.length == 1) return 0;

        int currentRunningSum = 0;
        int windowSize = 0;
        int maxWindowSize = Integer.MIN_VALUE;

        currentRunningSum = nums[0];

        int window_start = 0;
        for(int window_end = 0; window_end < nums.length; window_end++)
        {
            if(window_start == window_end - 1)
            {
                currentRunningSum = nums[window_start] - nums[window_end];
            }
            else
            {
                currentRunningSum -= nums[window_end];
            }

            currentRunningSum = Math.abs(currentRunningSum);

            if(currentRunningSum <= limit)
            {
                windowSize = window_end - window_start + 1;
                maxWindowSize = Math.max(windowSize, maxWindowSize);
            }

            if(currentRunningSum > limit)
            {
                currentRunningSum -= nums[window_start];
                currentRunningSum = Math.abs(currentRunningSum);
                window_start++;
            }
        }
        return maxWindowSize;
    }

}
