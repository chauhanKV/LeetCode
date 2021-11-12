package leetcode.techniques.TwoPointers;

public class SortColors {

    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Sort Colors.
    //Memory Usage: 37.5 MB, less than 85.51% of Java online submissions for Sort Colors.
    //Next challenges:
    //Sort List
    //Wiggle Sort

    // Time Complexity : O(N)
    // Space Complexity : O(1)
    public int[] sortColors(int[] nums) {
        int low = 0, high = nums.length - 1;

        for (int i = 0; i <= high; ) {
            if (nums[i] == 0) {
                swap(nums, i, low);
                low++;
                i++;
            } else if (nums[i] == 1) {
                i++;
            } else {
                swap(nums, i, high);
                high--;
            }
        }
        return nums;
    }

    private void swap(int[] nums, int i, int lowOrHigh)
    {
        var temp = nums[i];
        nums[i] = nums[lowOrHigh];
        nums[lowOrHigh] = temp;
    }
}
