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
}
