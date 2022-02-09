package leetcode.techniques.NumberTheory;

import java.util.Arrays;

public class MaxMin2 {

    // Time Complexity : O(log N)
    // Space Complexity : O(1)
    public void getMaxMin(int[] arr) {
        Arrays.sort(arr);
        int start = 0, end = arr.length - 1;

        System.out.print(arr[end - 1]);
        System.out.print(" ");
        System.out.print(arr[start + 1]);
    }
}
