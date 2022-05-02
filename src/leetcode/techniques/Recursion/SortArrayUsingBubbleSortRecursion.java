package leetcode.techniques.Recursion;

import java.util.Arrays;

public class SortArrayUsingBubbleSortRecursion {
    public void sortArrayAscending(int[] nums)
    {
        sortArrayUsingBubbleSortRecursion(nums, nums.length - 1, 0);
        System.out.println(Arrays.toString(nums));
    }

    private void sortArrayUsingBubbleSortRecursion(int[] nums, int row, int col) {
        if (row == 0 && col == 0)
            return;

        if (row > col) {
            // Swap
            if (nums[col] > nums[col + 1]) {
                int temp = nums[col];
                nums[col] = nums[col + 1];
                nums[col + 1] = temp;
            }
            sortArrayUsingBubbleSortRecursion(nums, row, ++col);
        } else {
            sortArrayUsingBubbleSortRecursion(nums, --row, 0);
        }
    }
}
