package leetcode.techniques.Recursion;

public class FindMinimumInRotatedSortedArray {
    //Runtime: 1 ms, faster than 32.62% of Java online submissions for Find Minimum in Rotated Sorted Array.
    //Memory Usage: 42.6 MB, less than 38.36% of Java online submissions for Find Minimum in Rotated Sorted Array.
    //Next challenges:
    //Find Minimum in Rotated Sorted Array II

    // TC : O(Log N)
    // SC : O(Log N)
    public int findMin(int[] nums) {
        return findMinValue(nums, 0, nums.length - 1, 0);
    }

    private int findMinValue(int[] nums, int start, int end, int minIndex) {
        // Base Condition
        if (start > end) {
            return nums[minIndex];
        }

        int mid = start + (end - start) / 2;

        // Increasing Order
        if (nums[start] <= nums[mid]) {
            if (nums[minIndex] > nums[start]) {
                return findMinValue(nums, mid + 1, end, start);
            } else {
                return findMinValue(nums, mid + 1, end, minIndex);
            }
        } else {
            // Decreasing Order
            if (nums[minIndex] > nums[end]) {
                return findMinValue(nums, start, end - 1, end);
            } else {
                return findMinValue(nums, start, mid - 1, minIndex);
            }

        }
    }
}
