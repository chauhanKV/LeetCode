package leetcode.techniques.Recursion;

public class SearchInRotatedSortedArrayII {
    //Runtime: 1 ms, faster than 80.44% of Java online submissions for Search in Rotated Sorted Array II.
    //Memory Usage: 44.6 MB, less than 6.77% of Java online submissions for Search in Rotated Sorted Array II.
    //Next challenges:
    //Arranging Coins
    //Minimize Malware Spread II
    //Maximum Font to Fit a Sentence in a Screen

    //Problem is same as Search in Rotated Sorted Array with slight change mentioned in the code as comment. Come back for intuition.

    // TC : O(logN)
    // SC : O(logN)

    public boolean search(int[] nums, int target) {
        return searchUsingBinaryRecursion(nums, target, 0, nums.length - 1);
    }

    private boolean searchUsingBinaryRecursion(int[] nums, int target, int start, int end)
    {
        // Base Condition
        if(start > end)
            return false;

        int mid = start + (end - start) / 2;

        if(nums[mid] == target)
        {
            return true;
        }
        // This is the edge case specific to this problem to handle duplicate.
        else if(nums[start] == nums[mid] && nums[end] == nums[mid])
        {
            return searchUsingBinaryRecursion(nums, target, start+1, end-1);
        }
        else
        {
            if(nums[start] <= nums[mid])
            {
                // Increasing order
                if(target >= nums[start] && target < nums[mid])
                {
                    return searchUsingBinaryRecursion(nums, target, start, mid - 1);
                }
                else
                {
                    return searchUsingBinaryRecursion(nums, target, mid + 1, end);
                }
            }
            else
            {
                //Decreasing order
                if(target > nums[mid] && target <= nums[end])
                {
                    return searchUsingBinaryRecursion(nums, target, mid + 1, end);
                }
                else
                {
                    return searchUsingBinaryRecursion(nums, target, start, mid - 1);
                }
            }
        }
    }
}
