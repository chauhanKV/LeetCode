package leetcode.techniques.Recursion;

public class BinarySearchInRotatedArray {

    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Search in Rotated Sorted Array.
    //Memory Usage: 42.2 MB, less than 72.31% of Java online submissions for Search in Rotated Sorted Array.
    //Next challenges:
    //Search in Rotated Sorted Array II
    //Find Minimum in Rotated Sorted Array
    //Pour Water Between Buckets to Make Water Levels Equal

    // TC : O(logN)
    // SC : O(logN)
    public int search(int[] nums, int target) {
        return searchInRotatedArray(nums, target, 0, nums.length - 1);
    }

    private int searchInRotatedArray(int[] nums, int target, int start, int end) {
        // base condition
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (nums[mid] == target) {
            return mid;
        } else {
            if (nums[start] <= nums[mid]) {
                // Increasing order
                if (target >= nums[start] && target < nums[mid]) {
                    return searchInRotatedArray(nums, target, start, mid - 1);
                } else {
                    return searchInRotatedArray(nums, target, mid + 1, end);
                }
            } else {
                // Decreasing order
                if (target > nums[mid] && target <= nums[end]) {
                    return searchInRotatedArray(nums, target, mid + 1, end);
                } else {
                    return searchInRotatedArray(nums, target, start, mid - 1);
                }
            }
        }
    }
}
