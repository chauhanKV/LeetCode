package leetcode.techniques.Recursion;

import java.util.Arrays;

public class SelectionSortWithRecursion {

    public void selectionSortArray(int[] nums)
    {
        selectionSortUsingRecursion(nums, nums.length - 1, 0, 0);
        System.out.println("Array after selection sort using recursion : " + Arrays.toString(nums));
    }

    private void selectionSortUsingRecursion(int[] nums, int row, int col, int max) {
        if(row == 0)
            return;

        if(row > col)
        {
            if(nums[max] < nums[col])
            {
                selectionSortUsingRecursion(nums, row, col+1, col);
            }
            else
            {
                selectionSortUsingRecursion(nums, row, col+1, max);
            }
        }
        else
        {
            int temp = nums[max];
            nums[max] = nums[row];
            nums[row] = temp;

            selectionSortUsingRecursion(nums, row-1, 0, max);
        }
    }
}
