package leetcode.techniques.Recursion;

import java.util.Arrays;

public class QuickSortUsingRecursion {
    public void sortArrayUsingQuickSort(int[] nums)
    {
        sortArray(nums, 0, nums.length - 1);
        System.out.println("Array after using quick sort - " + Arrays.toString(nums));
    }

    private void sortArray(int[] nums, int low, int hi) {
        // Base Condition
        if(low >= hi)
        {
            return;
        }

        int start = low;
        int end = hi;
        int mid = start + (end - start) / 2;
        int pivot = nums[mid];

        while(start < end)
        {
            while(nums[start] < pivot)
            {
                start++;
            }
            while(nums[end] > pivot)
            {
                end--;
            }

            // The moment we find violation we swap
            if(start <= end)
            {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }

        // Now that the pivot is at correct index, sort the two halves now
        sortArray(nums, low, end);
        sortArray(nums, start, hi);
    }
}
