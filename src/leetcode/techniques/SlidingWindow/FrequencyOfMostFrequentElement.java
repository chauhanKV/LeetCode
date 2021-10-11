package leetcode.techniques.SlidingWindow;
import java.util.*;

public class FrequencyOfMostFrequentElement {

    public int maxFrequency(int[] nums, int k) {
        if(nums.length <= 0 || k == 0) return 0;

        Arrays.sort(nums);
        long actualSum = 0;
        int start = 0;
        int maxLength = Integer.MIN_VALUE;
        for(int end = 0; end < nums.length; end++)
        {
            actualSum += nums[end];
            long desiredSum = (end - start + 1) * (long)nums[end]; // window

            while(start < nums.length && desiredSum - actualSum > k) // invalid case
            {
                actualSum -= nums[start];
                start += 1;
            }

            maxLength = Math.max(maxLength, (end - start + 1));
        }

        return maxLength == Integer.MIN_VALUE ? 0 : maxLength;
    }
}
