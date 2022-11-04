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
    }
}
