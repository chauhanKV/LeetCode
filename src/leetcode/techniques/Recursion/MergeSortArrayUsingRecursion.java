package leetcode.techniques.Recursion;

import java.util.Arrays;

public class MergeSortArrayUsingRecursion {

    // TC : O(NlogN) -> Explanation given in Kunal's recursion video
    // SC : O(N)
    public int[] MergeSortArrayUsingRecursionWithSpace(int[] nums)
    {
        return mergeSort(nums);
    }

    private int[] mergeSort(int[] nums) {
        if(nums.length == 1)
        {
            return nums;
        }

        int mid = nums.length / 2;

        int[] leftArray = mergeSort(Arrays.copyOfRange(nums, 0 , mid));
        int[] rightArray = mergeSort(Arrays.copyOfRange(nums, mid, nums.length));

        return mergeArrays(leftArray, rightArray);
    }

    private int[] mergeArrays(int[] leftArray, int[] rightArray)
    {
        int[] mix = new int[leftArray.length + rightArray.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < leftArray.length && j < rightArray.length)
        {
            if(leftArray[i] < rightArray[j])
            {
                mix[k] = leftArray[i];
                i++;
            }
            else
            {
                mix[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // it may be possible that one of the arrays is longer in length.
        while(i < leftArray.length)
        {
            mix[k] = leftArray[i];
            i++;
            k++;
        }

        while(j < rightArray.length)
        {
            mix[k] = rightArray[j];
            j++;
            k++;
        }

        return mix;
    }


    // IN PLACE sorting
    public void MergeSortArrayUsingRecursionInPlace(int[] nums)
    {
        mergeArraysInPlace(nums, 0, nums.length);
        System.out.println("Merge Sort Using Recursion IN PLACE : " + Arrays.toString(nums));
    }

    private void mergeArraysInPlace(int[] nums, int start, int end) {
        // Base Condition
        if(end - start == 1)
        {
            return;
        }

        int mid = start + (end - start) / 2;

        mergeArraysInPlace(nums, start, mid);
        mergeArraysInPlace(nums, mid, end);

        mergeSortedInPlace(nums, start, mid, end);
    }

    private void mergeSortedInPlace(int[] nums, int start, int mid, int end) {
        int[] mix = new int[end - start];

        int k = 0;
        int i = start;
        int j = mid;

        while(i < mid && j < end)
        {
            if(nums[i] < nums[j])
            {
                mix[k] = nums[i];
                i++;
            }
            else
            {
                mix[k] = nums[j];
                j++;
            }
            k++;
        }

        // When any one of the array has more elements then the other

        while(i < mid)
        {
            mix[k] = nums[i];
            i++;
            k++;
        }

        while(j < end)
        {
            mix[k] = nums[j];
            k++;
            j++;
        }

        // Store mix in nums
        for(int l = 0 ; l < mix.length; l++)
        {
            nums[start + l] = mix[l];
        }
    }

}
