package leetcode.techniques.Sorting;

import java.util.Arrays;

public class MergeArrays {
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Merge Sorted Array.
    //Memory Usage: 42.8 MB, less than 47.95% of Java online submissions for Merge Sorted Array.
    //Next challenges:
    //Merge Two Sorted Lists
    //Interval List Intersections

    // TC : O(N)
    // SC : O(N)
    public void mergeSortedArrays(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = new int[nums1.length];

        int i = 0, j = 0, k = 0;

        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                arr[k] = nums1[i];
                i++;
            } else {
                arr[k] = nums2[j];
                j++;
            }
            k++;
        }

        while (i < m) {
            arr[k] = nums1[i];
            i++;
            k++;
        }

        while (j < n) {
            arr[k] = nums2[j];
            j++;
            k++;
        }

        System.arraycopy(arr, 0, nums1, 0, arr.length);

        System.out.println("Arrays after merging : " + Arrays.toString(nums1));
    }
}
