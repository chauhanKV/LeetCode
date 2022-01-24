package leetcode.techniques.NumberTheory;

public class FibonacciNumber {

    // Iterative Approach

    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Fibonacci Number.
    //Memory Usage: 37.7 MB, less than 28.41% of Java online submissions for Fibonacci Number.
    //Next challenges:
    //Climbing Stairs
    //Split Array into Fibonacci Sequence
    //Length of Longest Fibonacci Subsequence
    //N-th Tribonacci Number

    // Time Complexity : O(N)
    // Space Complexity : O(N)
    public int fib(int n) {
        if(n < 2)
            return n;

        int temp = 0, a = 0, b = 1;
        for(int i = 2; i <= n; i++)
        {
            temp = a + b;
            a = b;
            b = temp;
        }

        return temp;
    }

    // Recursive Approach

    //Runtime: 7 ms, faster than 30.52% of Java online submissions for Fibonacci Number.
    //Memory Usage: 35.6 MB, less than 85.59% of Java online submissions for Fibonacci Number.

    public int fibRecursive(int n) {
        if(n <= 1)
            return n;

        return fibRecursive(n - 1) + fibRecursive(n - 2);
    }


    // Dynamic Programming Approach

    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Fibonacci Number.
    //Memory Usage: 37.4 MB, less than 45.57% of Java online submissions for Fibonacci Number.

    int[] dp = new int[31];
    public int fibDP(int n) {
        if(n <= 1)
        {
            return n;
        }

        if(dp[n] > 0)
        {
            return dp[n];
        }

        dp[n] = fibDP(n - 1) + fibDP(n - 2);
        return dp[n];
    }
}
