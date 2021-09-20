package leetcode.techniques.SlidingWindow;

public class MaximumAvgSubarrayI {
    public double findMaxAverage(int[] nums, int k) {
        double maxAvg = Integer.MIN_VALUE;
        double runningSum = 0;
        int start = 0;

        for(int end = 0 ; end < nums.length; end++)
        {
            runningSum += nums[end];

            if(end - start == (k-1))
            {
                double avg = runningSum / (end - start + 1);
                maxAvg = Math.max(maxAvg, avg);

                runningSum = runningSum - nums[start];
                start++;
            }
        }

        return maxAvg;
    }
}
