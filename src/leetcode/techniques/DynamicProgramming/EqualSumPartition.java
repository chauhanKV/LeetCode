package leetcode.techniques.DynamicProgramming;

public class EqualSumPartition {

    //417. Pacific Atlantic Water Flow
    //More challenges
    //698. Partition to K Equal Sum Subsets
    //1981. Minimize the Difference Between Target and Chosen Elements
    //2025. Maximum Number of Ways to Partition an Array
    public int equalPartition(int N, int[] arr)
    {
        int sum = 0;
        // Find sum
        for(int i = 0 ; i < N; i++)
        {
            sum += arr[i];
        }

        if(sum % 2 != 0)
        {
            return 0;
        }

        return isSubsetSum(N, arr, sum/2) ? 1 : 0;
    }

    public Boolean isSubsetSum(int N, int[] arr, int sum) {

        // Understand Knapsack basic problem to understand this.
        boolean[][] t = new boolean[N + 1][sum + 1];

        // Step 1 initialization

        for (int i = 0; i < N + 1; i++) {
            for (int j = 0; j < sum + 1; j++) {
                if (i == 0) {
                    t[i][j] = false;
                }

                if (j == 0) {
                    t[i][j] = true;
                }
            }
        }

        // Step 2 : Choice diagram

        for (int i = 1; i < N + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                if (arr[i - 1] <= j) {
                    // Here we have two options - either take it or leave it
                    t[i][j] = t[i - 1][j - arr[i - 1]] || t[i - 1][j];
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }

        return t[N][sum];
    }
}
