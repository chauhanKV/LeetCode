package leetcode.techniques.Recursion;

import java.util.Arrays;

public class FindMinimumInRotatedSortedArray2 {

    //Runtime: 1 ms, faster than 67.89% of Java online submissions for Find Minimum in Rotated Sorted Array II.
    //Memory Usage: 43.8 MB, less than 32.97% of Java online submissions for Find Minimum in Rotated Sorted Array II.
    //Next challenges:
    //Find the Town Judge
    //Count the Number of Consistent Strings
    //Maximum Total Beauty of the Gardens

    // TC : O(Log N)
    // SC : O(Log N)

    // Understand the intuition - this one is tricky.
    public int findMin(int[] nums) {
        return findMinValue(nums, 0, nums.length - 1);
    }

    private int findMinValue(int[] nums, int start, int end) {
        // Base Condition
        if (start >= end) {
            return nums[start];
        }

        int mid = start + (end - start) / 2;

        if (nums[mid] > nums[end]) {
            return findMinValue(nums, mid + 1, end);
        } else if (nums[mid] < nums[start]) {
            return findMinValue(nums, start + 1, mid);
        } else {
            return findMinValue(nums, start, end - 1);
        }
    }


    // Does not work for all test cases - need to check optimized solution.
    private int findMinValueTemp(int[] nums, int start, int end, int minIndex) {
        // Base Condition
        if (start >= end) {
            return nums[minIndex] > nums[start] ? nums[start] : nums[minIndex];
        }

        int mid = (start + end) / 2;

        // HAndles duplicates
        if (nums[start] == nums[mid] && nums[end] == nums[mid]) {
            return findMinValueTemp(nums, start + 1, end - 1, minIndex);
        } else if (nums[start] < nums[mid]) {
            // Increasing Order
            if (nums[minIndex] > nums[start]) {
                return findMinValueTemp(nums, mid + 1, end, start);
            } else {
                return findMinValueTemp(nums, mid + 1, end, minIndex);
            }
        } else {
            // Decreasing Order
            if (nums[minIndex] > nums[mid]) {
                return findMinValueTemp(nums, start, mid - 1, mid);
            } else {
                return findMinValueTemp(nums, mid + 1, mid, minIndex);
            }
        }
    }
}
