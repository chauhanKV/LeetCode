package leetcode.techniques.SlidingWindow;

import java.util.Arrays;

public class NumberOfSubsequenceThatSatisfyGivenCondition {
    public int numSubseq(int[] nums, int target) {

        if(nums == null || nums.length <= 0) return 0;

        Arrays.sort(nums);
        int start = 0;
        int end = nums.length - 1;
        int runningSum;
        int subsequenceCount = 0;
        int modulo = 1000000007;

        while(end < nums.length && end >= 0 && start < nums.length)
        {
            runningSum = nums[start] + nums[end];

            if(runningSum <= target) {
                subsequenceCount += (Math.pow(2, (end - start)) % modulo);
                start++;
            }
            else
                end--;
        }

        return subsequenceCount ;
    }
}
