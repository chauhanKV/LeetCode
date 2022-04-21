package leetcode.techniques.NumberTheory;

public class MaximumProductOfThreeNumbers {

    // Does not work for all test case.
    // This is done using Sliding window technique.
    // Can try two pointer approach for non-contiguous results. ( which is the ask of this question )
    public int maximumProduct(int[] nums) {
        int left = 0, right = 0, runningProduct = 1, maxValue = Integer.MIN_VALUE, k = 2;

        while (right < nums.length) {
            runningProduct *= nums[right];
            System.out.println(runningProduct);

            if (right == k) {
                if (maxValue < runningProduct) {
                    maxValue = runningProduct;
                }

                if (nums[left] != 0) {
                    runningProduct /= nums[left];
                }

                left++;
                k++;
            }
            right++;
        }

        return maxValue;
    }
}
