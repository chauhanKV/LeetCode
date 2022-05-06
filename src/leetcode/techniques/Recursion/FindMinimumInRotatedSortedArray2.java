package leetcode.techniques.Recursion;

import java.util.Arrays;

public class FindMinimumInRotatedSortedArray2 {

    //Gives wrong answer of some test cases - Fix the solution.

    // TC : O(Log N)
    // SC : O(Log N)

    public int findMin(int[] nums) {
        return findMinValue(nums, 0, nums.length - 1, 0);
    }

    private int findMinValue(int[] nums, int start, int end, int minIndex) {
        // Base Condition
        if (start >= end) {
            return Math.min(nums[minIndex], nums[start]);
        }

        int mid = (start + end) / 2;

        // HAndles duplicates
        if (nums[start] == nums[mid] && nums[end] == nums[mid]) {
            return findMinValue(nums, start + 1, end - 1, minIndex);
        } else if (nums[start] < nums[mid]) {
            // Increasing Order
            if (nums[minIndex] > nums[start]) {
                return findMinValue(nums, mid + 1, end, start);
            } else {
                return findMinValue(nums, mid + 1, end, minIndex);
            }
        } else {
            // Decreasing Order
            if (nums[minIndex] > nums[mid]) {
                return findMinValue(nums, mid + 1, end, mid);
            } else {
                return findMinValue(nums, mid + 1, end, minIndex);
            }

        }
    }
}
