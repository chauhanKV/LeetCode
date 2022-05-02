package leetcode.techniques.Recursion;

import java.util.Arrays;

public class MoveAllZeros {

    //Runtime: 2 ms, faster than 67.78% of Java online submissions for Move Zeroes.
    //Memory Usage: 55 MB, less than 34.76% of Java online submissions for Move Zeroes.
    //Next challenges:
    //Remove Element

    // Time Complexity : O(N)
    // Space Complexity : O(N)

    // Optimized this solution
    public void moveZeroes(int[] nums) {
        moveZerosUsingBubbleSort(nums, 0, 0);
        System.out.println(Arrays.toString(nums));
    }

    public void moveZerosUsingBubbleSort(int[] nums, int i, int snowBallCount) {
        if (i == nums.length) {
            return;
        }

        if (nums[i] == 0) {
            moveZerosUsingBubbleSort(nums, i + 1, snowBallCount + 1);
        } else {
            // Swap
            if (snowBallCount > 0) {
                int temp = nums[i];
                nums[i] = 0;
                nums[i - snowBallCount] = temp;
            }

            moveZerosUsingBubbleSort(nums, i + 1, snowBallCount);
        }
    }
}
