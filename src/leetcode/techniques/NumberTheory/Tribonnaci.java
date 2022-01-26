package leetcode.techniques.NumberTheory;

public class Tribonnaci {

    //Runtime: 0 ms, faster than 100.00% of Java online submissions for N-th Tribonacci Number.
    //Memory Usage: 35.8 MB, less than 67.26% of Java online submissions for N-th Tribonacci Number.
    //Next challenges:
    //Digit Count in Range
    //Filling Bookcase Shelves
    //Count Ways to Build Rooms in an Ant Colony

    //Time Complexity : O(N)
    //Space Complexity : O(1)

    // Solve in DP approach
    public int tribonacciValue(int n) {
        if(n == 0) return 0;
        if(n == 1 || n == 2) return 1;

        int first = 0, second = 1, third = 1, addition = 0;

        for(int i = 3; i <= n; i++)
        {
            addition = first + second + third;
            first = second;
            second = third;
            third = addition;
        }

        return addition;
    }
}
