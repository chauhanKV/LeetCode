package leetcode.techniques.TwoPointers;

import java.util.Arrays;

public class TripletsWithSmallerSum {
    public int searchTriplets(int[] arr, int target) {
        int count = 0;
        if (arr.length < 3) return 0;

        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 2; i++) {
            if (i == 0 || (i > 0 && arr[i] != arr[i - 1])) {
                int left = i + 1;
                int right = arr.length - 1;

                while (left < right) {
                    int targetSum = target - arr[i];
                    if (arr[left] + arr[right] < targetSum) {
                        // since arr[right] > arr[left], therefore we can replace arr[right] with any number between left and right
                        // to get the sum less than target sum.
                        count += right - left;
                        left++;
                    } else {
                        right--;
                    }

                }
            }
        }

        return count;
    }
}
