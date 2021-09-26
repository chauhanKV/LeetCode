package leetcode.techniques.DivideAndConquer;

public class MaximumSubarray {
    // Wrong answer : Find the problem
    public int maxSubArray(int[] nums) {
        int start = 0;
        int runningSum = 0;
        int maxLength = Integer.MIN_VALUE;

        for(int end = 0; end < nums.length; end++)
        {
            runningSum += nums[end];
            maxLength = Math.max(maxLength, runningSum);

            if(runningSum < maxLength)
            {
                while(start < end)
                {
                    runningSum -= nums[start];
                    start++;
                }
            }
        }

        return maxLength;
    }
}
