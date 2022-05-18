package leetcode.techniques.Recursion;

public class ClimbingStairsCount {
    // This simple recursion approach gives TLE after Test case -> 43
    // Need to use DP to optimize.
    public int climbStairs(int n) {
        // Base Case
        if (n < 2)
            return 1;

        return climbStairs(n - 1) + climbStairs(n - 2);
    }
}
