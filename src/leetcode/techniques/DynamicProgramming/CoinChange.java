package leetcode.techniques.DynamicProgramming;

public class CoinChange {

    //323. Number of Connected Components in an Undirected Graph
    //More challenges
    //983. Minimum Cost For Tickets
    //2218. Maximum Value of K Coins From Piles
    //2224. Minimum Number of Operations to Convert Time
    public int coinChange(int[] coins, int amount) {
        int[][] dp = new int[coins.length + 1][amount + 1];

        // Initialization
        for (int i = 0; i < coins.length + 1; i++) {
            for (int j = 0; j < amount + 1; j++) {
                if (i == 0) {
                    dp[i][j] = Integer.MAX_VALUE - 1;
                }

                if (j == 0 && i > 0) {
                    dp[i][j] = 0;
                }
            }
        }

        for (int j = 1; j < amount + 1; j++) {
            if (j % coins[0] == 0) {
                dp[1][j] = Integer.MAX_VALUE - 1;
            } else {
                dp[1][j] = j / coins[0];
            }
        }

        //System.out.println(Arrays.deepToString(dp));

        // choice diagram

        for (int i = 1; i < coins.length + 1; i++) {
            for (int j = 1; j < amount + 1; j++) {
                if (coins[i - 1] <= j) {
                    dp[i][j] = Math.min(dp[i][j - coins[i - 1]] + 1, dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[coins.length][amount] == Integer.MAX_VALUE - 1 ? -1 : dp[coins.length][amount];
    }
}
