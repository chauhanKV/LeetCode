package leetcode.techniques.DynamicProgramming;

public class Main {
    public static void main(String[] args) {
        ZeroOneKnapSack knapSack = new ZeroOneKnapSack();
        int maxProfit = knapSack.knapSack(3, new int[]{1,2,4}, new int[]{6,7,8}, 3);
        System.out.println("Maximum profit in 0/1 Knapsack Problem is : " + maxProfit);

        int maxProfitWithMemoization = knapSack.knapSackMemoization(3, new int[]{1,2,4}, new int[]{6,7,8}, 3);
        System.out.println("Maximum profile in 0/1 Knapsack Problem with Memoization is : " + maxProfitWithMemoization);

        ZeroOneKnapSackTopDown topDown = new ZeroOneKnapSackTopDown();
        int maxProfitTopDown = topDown.knapSack(3, new int[]{1,2,4}, new int[]{6,7,8}, 3);
        System.out.println("0/1 KnapSack with Top Down Approach : " + maxProfitTopDown);

        SubSetSum sum = new SubSetSum();
        boolean isSubsetPresent = sum.isSubsetSum(6, new int[] {3, 34, 4, 12, 5, 2}, 30);
        System.out.println("Is Subset Present ? : " + isSubsetPresent);

        EqualSumPartition equalSum = new EqualSumPartition();
        int result = equalSum.equalPartition(4, new int[]{1, 5, 11, 5});
        System.out.println("Equal Sum Partition possible ? " + result);

        CountSubsetSum count = new CountSubsetSum();
        int output = count.perfectSum(new int[] {2, 3, 5, 6, 8, 10}, 6, 10 );
        System.out.println("Count of subset sum is : " + output);

        MinimumSumPartition partition = new MinimumSumPartition();
        int resultData = partition.minDifference(new int[]{1, 6, 11, 5}, 4);
        System.out.println("Minimum Sum Partition is : " + resultData);

        PartitionToKEqualSumSubset partitionToKEqualSumSubset = new PartitionToKEqualSumSubset();
        boolean result1 = partitionToKEqualSumSubset.canPartitionKSubsetsMemoization(new int[] {12,1,2,3,18,2,5,2,11,1}, 3);
        System.out.println("Partition to K Equal Sum Subset : " + result1);
    }
}
