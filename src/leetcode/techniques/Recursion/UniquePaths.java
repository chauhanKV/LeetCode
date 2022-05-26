package leetcode.techniques.Recursion;

public class UniquePaths {
    public int uniquePaths(int m, int n) {
       return findUniquePaths(m - 1, n - 1, 0, 0);
    }

    private int findUniquePaths(int m, int n, int row, int col)
    {
        // base condition
        if (row == m && col == n) {
            return 1;
        }

        int horizontalCount = 0, verticalCount = 0;

        if (row < m) {
            verticalCount = findUniquePaths(m, n, row + 1, col);
        }

        if (col < n) {
            horizontalCount = findUniquePaths(m, n, row, col + 1);
        }

        return horizontalCount + verticalCount;
    }



    // We do not go until row = m and col = n, we create a base condition when either row or col hits 1 and return 1 (path count).
    // We are saving one extra recursion call to reach the destination.
    // Kunal's solution

    public int uniquePathsReducedRecursion(int row, int col)
    {
        // Base Condition
        if(row == 1 || col == 1)
        {
            return 1;
        }

        int horizontalCount = uniquePathsReducedRecursion(row - 1, col);
        int verticalCount = uniquePathsReducedRecursion(row, col - 1);

        return horizontalCount + verticalCount;
    }


}
