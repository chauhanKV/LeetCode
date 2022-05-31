package leetcode.techniques.Recursion;

public class MinimumPathSum {
    public int minPathSum(int[][] grid) {
        return minPath(grid, 0, 0);
    }

    // Gives wrong answer
//    private int minPath(int[][]grid, int row, int col) {
//        // base condition
//        if (row == grid.length - 1 && col == grid[0].length - 1) {
//            return grid[row][col];
//        }
//
//        int verticalSum = 0;
//        int horizontalSum = 0;
//
//        if (row < grid.length - 1) {
//            verticalSum = minPath(grid, row + 1, col);
//        }
//
//        if (col < grid[0].length - 1) {
//            horizontalSum = minPath(grid,  row, col + 1);
//        }
//
//        return grid[row][col] + Math.min(verticalSum, horizontalSum);
//    }


    // This solution gives TLE
    private int minPath(int[][] grid, int row, int col) {
        // base condition
        if (row >= grid.length || col >= grid[0].length) {
            return Integer.MAX_VALUE;
        }
        if (row == grid.length - 1 && col == grid[0].length - 1) {
            return grid[row][col];
        }

        int verticalSum = minPath(grid, row + 1, col);
        int horizontalSum = minPath(grid, row, col + 1);

        return grid[row][col] + Math.min(verticalSum, horizontalSum);
    }

}
