package leetcode.DataStructuresArrays;

public class FirstLastPositionSortedArray {
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Find First and Last Position of Element in Sorted Array.
    //Memory Usage: 47.3 MB, less than 31.14% of Java online submissions for Find First and Last Position of Element in Sorted Array.
    //Next challenges:
    //First Bad Version
    //Plates Between Candles
    //Find Target Indices After Sorting Array

    // Time Complexity : O(N ^ 2)
    // Space Complexity : O(1)
    public int[] searchRange(int[] nums, int target) {
        int firstIndex = -1, lastIndex = -1, mid = 0, low = 0, high =  nums.length - 1;

        while(low <= high)
        {
            mid = (low + high) / 2;
            if(nums[mid] < target)
            {
                low = mid + 1;
            }
            else if(nums[mid] > target)
            {
                high = mid - 1;
            }
            else
            {
                firstIndex = mid;
                high = mid - 1;
            }
        }

        low = 0;
        high = nums.length - 1;
        while(low <= high)
        {
            mid = (low + high)/2;
            if(nums[mid] < target)
            {
                low = mid + 1;
            }
            else if(nums[mid] > target)
            {
                high = mid - 1;
            }
            else
            {
                lastIndex = mid;
                low = mid + 1;
            }
        }

        int[] arr = new int[2];
        arr[0] = firstIndex;
        arr[1] = lastIndex;

        return arr;
    }
}
