package leetcode.techniques.TwoPointers;

public class MinimumWindowSort {

    //Runtime: 1 ms, faster than 99.96% of Java online submissions for Shortest Unsorted Continuous Subarray.
    //Memory Usage: 40.5 MB, less than 49.51% of Java online submissions for Shortest Unsorted Continuous Subarray.
    //Next challenges:
    //Number of Longest Increasing Subsequence
    //Last Stone Weight II
    //Find Target Indices After Sorting Array

    //Time Complexity : O(N)
    //Space Complexity : O(1)

    public int findUnsortedSubarray(int[] nums) {
        int low = 0, high = nums.length - 1;

        // Find the min index which is not in sorted order from the beginning
        while(low < nums.length - 1 && nums[low] <= nums[low + 1])
        {
            low++;
        }

        // If all are sorted than return 0
        if(low == nums.length - 1)
            return 0;

        // First the max index which is not in sorted order from the end
        while(high >= 0 && nums[high] >= nums[high - 1])
        {
            high--;
        }

        // To rule out any indexes which is left outside the subarray boundary
        int maxSubArrayValue = Integer.MIN_VALUE, minSubArrayValue = Integer.MAX_VALUE;

        for(int i = low; i <= high ; i++)
        {
            maxSubArrayValue = Math.max(maxSubArrayValue, nums[i]);
            minSubArrayValue = Math.min(minSubArrayValue, nums[i]);
        }

        // extend the boundaries (from the point where they are now)
        // to include any index that has value greater than minValue and less than maxValue
        while(low > 0 && nums[low - 1] > minSubArrayValue)
        {
            low--;
        }

        while(high < nums.length - 1 && nums[high + 1] < maxSubArrayValue)
        {
            high++;
        }

        return (high - low) + 1;
    }
}
