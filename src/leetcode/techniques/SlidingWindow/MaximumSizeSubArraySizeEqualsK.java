package leetcode.techniques.SlidingWindow;

public class MaximumSizeSubArraySizeEqualsK {
    public int maxSubArrayLenEqualsK(int k, int[] nums) {
        if(nums == null || nums.length <= 0) return 0;
        int maxSubArray = Integer.MIN_VALUE;
        int start = 0;
        int currentRunningSum = 0;

        for(int end = 0 ; end < nums.length; end++)
        {
            currentRunningSum += nums[end];
            while(currentRunningSum >= k)
            {
                if(currentRunningSum == k)
                    maxSubArray = Math.max((end - start + 1), maxSubArray);

                currentRunningSum -= nums[start++];
            }
        }

        return maxSubArray == Integer.MIN_VALUE ? 0 : maxSubArray;
    }
}
