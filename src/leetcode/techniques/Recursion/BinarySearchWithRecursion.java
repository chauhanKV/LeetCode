package leetcode.techniques.Recursion;

public class BinarySearchWithRecursion {

    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Search.
    //Memory Usage: 54.3 MB, less than 46.66% of Java online submissions for Binary Search.
    //Next challenges:
    //Search in a Sorted Array of Unknown Size


    // Time Complexity : O(Log N)
    // Space Complexity : O(log N)

    public int search(int[] nums, int target) {
        int result = recursionSearch(nums, target, 0, nums.length - 1);
        return result;
    }

    private int recursionSearch(int[] nums, int target, int start, int end)
    {
        int mid = (start + end) / 2;

        if(nums[mid] == target)
        {
            return mid;
        }

        if(start > end)
        {
            return -1;
        }

        return nums[mid] < target ? recursionSearch(nums, target, mid + 1, nums.length - 1) : recursionSearch(nums, target, start, mid - 1);
    }
}
