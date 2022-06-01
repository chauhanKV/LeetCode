package leetcode.techniques.Recursion;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

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

    public ArrayList<String> printUniquePaths(int row, int col)
    {
        return printUniquePathsRecursion(row, col, "");
    }

    private ArrayList<String> printUniquePathsRecursion(int row, int col, String processed) {
        if (row == 1 && col == 1) {
            ArrayList<String> baseResult = new ArrayList<>();
            baseResult.add(processed);
            return baseResult;
        }

        ArrayList<String> result = new ArrayList<>();

        if (row > 1) {
            result.addAll(printUniquePathsRecursion(row - 1, col, processed + "D"));
        }

        if (col > 1) {
            result.addAll(printUniquePathsRecursion(row, col - 1, processed + "R"));
        }

        return result;
    }

    public ArrayList<String> printUniquePathsDiagonally(int row, int col)
    {
        return printUniquePathsDiagonal(row, col, "");
    }
    private ArrayList<String> printUniquePathsDiagonal(int row, int col, String processed) {
        if (row == 1 && col == 1) {
            ArrayList<String> baseResult = new ArrayList<>();
            baseResult.add(processed);
            return baseResult;
        }

        ArrayList<String> result = new ArrayList<>();

        if (row > 1) {
            result.addAll(printUniquePathsDiagonal(row - 1, col, processed + "V"));
        }

        if (col > 1) {
            result.addAll(printUniquePathsDiagonal(row, col - 1, processed + "H"));
        }

        if (row > 1 && col > 1) {
            result.addAll(printUniquePathsDiagonal(row - 1, col - 1, processed + "D"));
        }

        return result;
    }

    public void printPathWithObstacle(boolean[][] maze)
    {
        printPathsWithObstacle(maze, "", maze.length - 1, maze[0].length - 1);
    }

    private void printPathsWithObstacle(boolean[][] maze, String processed, int row, int col) {
        // base condition
        if(row == maze.length - 1 && col == maze[0].length - 1)
        {
            System.out.println(processed);
            return;
        }

        if(!maze[row][col])
        {
            return;
        }

        if(row < maze.length - 1)
        {
           printPathsWithObstacle(maze, "D" + processed,row + 1, col);
        }

        if(col < maze[0].length - 1)
        {
           printPathsWithObstacle(maze, "R" + processed, row, col + 1);
        }
    }


    // Print count of paths after adding obstacles
    // Gives TLE for bigger Test cases on leetcode, find optimized solution.
    public int countUniquePathsWithObstacles(int[][] obstacleGrid) {
        return countPathsWithObstacles(obstacleGrid, 0, 0);
    }

    private int countPathsWithObstacles(int[][] maze, int row, int col) {
        // base condition
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            return maze[row][col] == 0 ? 1 : 0;
        }

        if (maze[row][col] == 1) {
            return 0;
        }

        int count = 0;

        if (row < maze.length - 1) {
            count += countPathsWithObstacles(maze, row + 1, col);
        }

        if (col < maze[0].length - 1) {
            count += countPathsWithObstacles(maze, row, col + 1);
        }
        return count;
    }

    // Above solution optimized using Dynamic Programming approach
    // Have back for intuition

    //Runtime: 1 ms, faster than 53.01% of Java online submissions for Unique Paths II.
    //Memory Usage: 41.5 MB, less than 76.42% of Java online submissions for Unique Paths II.
    //Next challenges:
    //Unique Paths
    //Unique Paths III

    int[][] dp;
    public int uniquePathsWithObstaclesDP(int[][] obstacleGrid) {
        dp = new int[obstacleGrid.length][obstacleGrid[0].length];
        for(int i = 0 ; i < obstacleGrid.length; i++)
        {
            for(int j = 0; j < obstacleGrid[0].length; j++)
            {
                dp[i][j] = -1;
            }
        }
        return countPathsWithObstaclesDP(obstacleGrid, 0, 0);
    }

    private int countPathsWithObstaclesDP(int[][] maze, int row, int col) {
        // base condition
        if (row == maze.length - 1 && col == maze[0].length - 1 && maze[row][col] != 1) {
            return 1;
        }

        if (row >= maze.length || col >= maze[0].length || maze[row][col] == 1) {
            return 0;
        }

        if (dp[row][col] != -1) {
            return dp[row][col];
        }

        dp[row][col] = countPathsWithObstaclesDP(maze, row + 1, col) + countPathsWithObstaclesDP(maze, row, col + 1);

        return dp[row][col];
    }


    // Backtracking
    // Print all paths (down, left, right, up)

    public void printAllPossiblePathsInAllDirections(boolean[][] maze)
    {
        printAllPossiblePaths(maze,"",0, 0);
    }

    private void printAllPossiblePaths(boolean[][] maze, String processed, int row, int col) {
        // base condition
        if(row == maze.length - 1 && col == maze[0].length - 1)
        {
            System.out.println(processed);
            return;
        }

        // Return when the cell is already visited
        if(!maze[row][col])
        {
            return;
        }

        // This block means that I am visiting this cell to make my path to destination.
        maze[row][col] = false;

        if(row < maze.length - 1)
        {
            printAllPossiblePaths(maze, "D" + processed, row + 1, col);
        }

        if(col < maze[0].length - 1)
        {
            printAllPossiblePaths(maze, "R" + processed, row, col + 1);
        }

        if(row > 0)
        {
            printAllPossiblePaths(maze, "U" + processed, row - 1, col);
        }

        if(col > 0)
        {
            printAllPossiblePaths(maze, "L" + processed, row , col - 1);
        }

        maze[row][col] = true;
    }


    // Backtracking - Print path and print the steps in Matrix

    public void printAllPathsInMatrix(boolean[][] maze)
    {
        int[][] path = new int[maze.length][maze[0].length];
        printAllPathsInMatrixInAllDirection(maze,"",0, 0, path, 1);
    }

    private void printAllPathsInMatrixInAllDirection(boolean[][] maze, String processed, int row, int col, int[][] path, int step) {
        // base condition
        if(row == maze.length - 1 && col == maze[0].length - 1)
        {
            for(int[] c : path)
            {
                System.out.println(Arrays.toString(c));
            }
            System.out.println(processed);
            System.out.println();
            return;
        }

        // Return when the cell is already visited
        if(!maze[row][col])
        {
            return;
        }

        // This block means that I am visiting this cell to make my path to destination.
        maze[row][col] = false;
        path[row][col] = step;

        if(row < maze.length - 1)
        {
            printAllPathsInMatrixInAllDirection(maze, "D" + processed, row + 1, col, path, step + 1);
        }

        if(col < maze[0].length - 1)
        {
            printAllPathsInMatrixInAllDirection(maze, "R" + processed, row, col + 1, path, step + 1);
        }

        if(row > 0)
        {
            printAllPathsInMatrixInAllDirection(maze, "U" + processed, row - 1, col, path, step + 1);
        }

        if(col > 0)
        {
            printAllPathsInMatrixInAllDirection(maze, "L" + processed, row , col - 1, path, step + 1);
        }

        maze[row][col] = true;
        path[row][col] = 0;
    }

}
