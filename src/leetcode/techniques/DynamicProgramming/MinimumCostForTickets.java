package leetcode.techniques.DynamicProgramming;

public class MinimumCostForTickets {

    // Recursion Approach - 1

    public int mincostTickets(int[] days, int[] costs) {
        // Recursion approach
        //return solve(days.length, days, costs, 0);

        // Memoization approach
//        int[] dp = new int[days.length + 1];
//        for(int i = 0 ; i < dp.length; i++)
//        {
//            dp[i] = -1;
//        }
        // return solveMem(days.length, days, costs, 0, dp);

        // Dynamic Programming - Bottom Up
        return solveDP(days.length, days, costs);
    }
    private int solve(int n, int[] days, int[] costs, int index) {
        // base condition
        if (index >= n)
            return 0;

        // Option 1 - 1 day pass
        int option1 = costs[0] + solve(n, days, costs, index + 1);

        int i;
        // Option 2 - 7 day pass
        for (i = index; i < n && days[i] < days[index] + 7; i++) ;
        int option2 = costs[1] + solve(n, days, costs, i);

        // Option 3 - 30 day pass
        for (i = index; i < n && days[i] < days[index] + 30; i++) ;
        int option3 = costs[2] + solve(n, days, costs, i);

        return Math.min(option1, Math.min(option2, option3));
    }

    // Memoization Approach
    public int solveMem(int n, int[] days, int[] costs, int index, int[] dp)
    {
        // base condition
        if(index >= n)
            return 0;

        if(dp[index] != -1)
        {
            return dp[index];
        }

        // Option 1 - 1 day pass
        int option1 = costs[0] + solveMem(n, days, costs, index+1, dp);

        int i;
        // Option 2 - 7 day pass
        for(i = index ; i < n && days[i] < days[index] + 7; i++);
        int option2 = costs[1] + solveMem(n, days, costs, i, dp);

        // Option 3 - 30 day pass
        for(i = index ; i < n && days[i] < days[index] + 30; i++);
        int option3 = costs[2] + solveMem(n, days, costs, i, dp);

        dp[index] = Math.min(option1, Math.min(option2, option3));
        return dp[index];
    }


    // Dynamic Programming  - Not optimized
    public int solveDP(int n, int[] days, int[] costs) {
        int[] dp = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        dp[n] = 0;

        for (int k = n - 1; k >= 0; k--) {
            // Option 1 - 1 day pass
            int option1 = costs[0] + dp[k + 1];

            int i;
            // Option 2 - 7 day pass
            for (i = k; i < n && days[i] < days[k] + 7; i++) ;
            int option2 = costs[1] + dp[i];

            // Option 3 - 30 day pass
            for (i = k; i < n && days[i] < days[k] + 30; i++) ;
            int option3 = costs[2] + dp[i];

            dp[k] = Math.min(option1, Math.min(option2, option3));
        }
        return dp[0];
    }
}
