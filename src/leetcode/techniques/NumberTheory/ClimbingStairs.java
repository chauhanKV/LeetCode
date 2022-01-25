package leetcode.techniques.NumberTheory;

public class ClimbingStairs {

    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Climbing Stairs.
    //Memory Usage: 38 MB, less than 10.61% of Java online submissions for Climbing Stairs.
    //Next challenges:
    //Min Cost Climbing Stairs
    //N-th Tribonacci Number

    // Time Complexity : O(N)
    // Space Complexity : O(1);
    public int climbStairs(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        if(n == 2) return 2;

        int oneStep = 1, twoStep = 2, ways = 0;

        for(int i = 2 ; i < n ; i++)
        {
            ways = oneStep + twoStep;
            oneStep = twoStep;
            twoStep = ways;
        }

        return ways;
    }
}
