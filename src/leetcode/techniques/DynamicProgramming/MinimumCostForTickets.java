package leetcode.techniques.DynamicProgramming;

public class MinimumCostForTickets {

    // Recursion Approach - 1

    public int mincostTickets(int[] days, int[] costs) {
        // Recursion approach
        return solve(days.length, days, costs, 0);
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
}
