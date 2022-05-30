package leetcode.techniques.Recursion;

import java.lang.reflect.Array;
import java.util.ArrayList;

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

}
