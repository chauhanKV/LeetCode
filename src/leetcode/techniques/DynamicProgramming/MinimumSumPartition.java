package leetcode.techniques.DynamicProgramming;

import java.util.ArrayList;

public class MinimumSumPartition {
    public int minDifference(int[] nums, int N ) {
        if (nums.length <= 1) return 0;
        if (nums.length == 2) return Math.abs(nums[0]) + Math.abs(nums[1]);

        // Step 1 : find the range
        int range = 0;
        for (int i = 0; i < nums.length; i++) {
            range += nums[i];
        }


        // Step 2 : Subset sum problem
        int sum = range;
        boolean[][] dp = new boolean[N + 1][sum + 1];
        subSetSum(dp, N, sum, nums);



        // Step 3 : iterate half of the range and store it in another array
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < ((sum + 1) / 2); i++) {
            if (dp[N][i]) {
                list.add(i);
            }
        }


        // Step 4 : Iterate through the V array and find minimum
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < list.size(); i++) {
            System.out.println((sum) - 2 * list.get(i));
            minValue = Math.min(minValue, ((sum) - 2 * list.get(i)));
        }

        return minValue;
    }

    public void subSetSum(boolean[][] dp , int N, int sum, int[] arr) {
        // Step 1 initialization

        for (int i = 0; i < N + 1; i++) {
            for (int j = 0; j < sum + 1; j++) {
                if (i == 0) {
                    dp[i][j] = false;
                }

                if (j == 0) {
                    dp[i][j] = true;
                }
            }
        }

        // Step 2 : Choice diagram

        for (int i = 1; i < N + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                if (arr[i - 1] <= j) {
                    // Here we have two options - either take it or leave it
                    dp[i][j] = dp[i - 1][j - arr[i - 1]] || dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
    }
}
