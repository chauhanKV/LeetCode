package leetcode.techniques.DynamicProgramming;

public class PartitionToKEqualSumSubset {

    // Approach 1 : Recursion -> Gives TLE
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = 0;
        int N = nums.length;

        // Get sum of all the values in nums
        for(int i = 0 ; i < nums.length; i++)
        {
            sum += nums[i];
        }

        if(sum % k != 0) {
            return false;
        }

        boolean[] visitedIndex = new boolean[nums.length];

        return canPartition(nums.length, nums, sum/k, 0, 0, k, visitedIndex);
    }

    public boolean canPartition(int N, int[] arr, int target, int runningSum, int index, int k, boolean[] visitedIndex)
    {
        // Base Condition
        if(k == 0)
        {
            return true;
        }

        if(runningSum > target)
        {
            return false;
        }

        if(runningSum == target)
        {
            return canPartition(N, arr, target, 0, 0, k-1, visitedIndex);
        }

        for(int i = index; i < arr.length; i++)
        {
            if(visitedIndex[i]) continue;
            visitedIndex[i] = true;
            if(canPartition(N, arr, target, runningSum + arr[i], i + 1, k, visitedIndex)) return true;
            visitedIndex[i] = false;
        }
        return false;
    }


    // Approach 2 : Memoization
    public boolean canPartitionKSubsetsMemoization(int[] nums, int k) {
        int sum = 0;
        int N = nums.length;

        // Get sum of all the values in nums
        for(int i = 0 ; i < nums.length; i++)
        {
            sum += nums[i];
        }

        if(sum % k != 0)
        {
            return false;
        }

        int[][] dp = new int[N+1][sum+1];
        for(int i = 0 ; i < N + 1; i++)
        {
            for(int j = 0 ; j < sum + 1; j++)
            {
                dp[i][j] = -1;
            }
        }

        boolean[] visitedIndex = new boolean[N];

        return canPartitionMemoization(N, nums, sum/k, 0, 0, k, visitedIndex, dp);
    }

    public boolean canPartitionMemoization(int N, int[] arr, int target, int runningSum, int index, int k, boolean[] visitedIndex, int[][] dp)
    {
        // Base Condition
        if(k == 0)
        {
            return true;
        }

        if(runningSum > target)
        {
            return false;
        }

        if(runningSum == target)
        {
            for(int i = 0 ; i < N + 1; i++)
            {
                for(int j = 0 ; j < target + 1; j++)
                {
                    dp[i][j] = -1;
                }
            }
            return canPartitionMemoization(N, arr, target, 0, 0, k-1, visitedIndex, dp);
        }

        if(dp[index][runningSum] != -1)
        {
            return dp[index][runningSum] == 1;
        }

        for(int i = index; i < arr.length; i++)
        {
            if(visitedIndex[i]) continue;
            visitedIndex[i] = true;

            if(canPartitionMemoization(N, arr, target, runningSum + arr[i], i + 1, k, visitedIndex, dp))
            {
                dp[i][runningSum] = 1;
                return true;
            }

            dp[i][runningSum] = 0;
            visitedIndex[i] = false;
        }

        return false;
    }
}
