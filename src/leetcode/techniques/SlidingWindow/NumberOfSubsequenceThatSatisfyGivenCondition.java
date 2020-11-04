package leetcode.techniques.SlidingWindow;

public class NumberOfSubsequenceThatSatisfyGivenCondition {
    public int numSubseq(int[] nums, int target) {

        if(nums == null || nums.length <= 0) return 0;

        int minValue = 0;
        int maxValue = 0;
        int start = 0;
        int end = 0;
        int subsequenceCount = 0;

        while(end < nums.length)
        {
            minValue = Math.min(nums[start], minValue);
            maxValue = Math.max(nums[end], maxValue);

            if(minValue + maxValue <= target)
            {
                subsequenceCount++;
            }

            if(start != end && nums[start] == nums[end])
            {
                start++;
            }
            else
            {
                end++;
            }
        }

        return subsequenceCount;
    }
}
