package leetcode.techniques.Recursion;

public class IslandPerimeter {

    // Gives wrong answer, need to find the bug in this code.
    // Check functions with iterative bug resolution

    public int islandPerimeter(int[][] grid) {
        // Take note of this line below :
        if(grid == null) return 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    return islandPerimeterHelperOptimized(grid, i, j);
                }
            }
        }
        return 0;
    }
    private int islandPerimeterBUG1(int[][] grid) {
        // int[][] visited = new int[grid.length][grid[0].length];

        for (int i = 0; i < grid.length - 1; i++) {
            for (int j = 0; j < grid[0].length - 1; j++) {
                if (grid[i][j] == 1) {
                    //return islandPerimeterHelper(grid, i, j, 0, visited);
                }
            }
        }
        return 0;
    }

    private int islandPerimeterBUG2(int[][] grid) {
        // BUG 2 : grid.length and not grid.length - 1
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    //return islandPerimeterHelperOptimized(grid, i, j);
                }
            }
        }
        return 0;
    }


    // BUG No : 1 -> I am returning one when visited is 1, instead I should return 0 when the cell is already visited.
    private int islandPerimeterHelperBUG1(int[][] grid, int row, int col, int count, int[][] visited) {
        // base condition
        // visited condition should be separate
        if (row < 0 || col < 0 || row >= grid.length || col >= grid[0].length || grid[row][col] == 0 || visited[row][col] == 1) {
            return 1;
        }

        // Like this
//        if(visited[row][col] == 1)
//        {
//            return 0;
//        }

        visited[row][col] = 1;

        int edgeCount = 0;

        // up
        edgeCount += islandPerimeterHelperBUG1(grid, row - 1, col, count, visited);

        // left
        edgeCount += islandPerimeterHelperBUG1(grid, row, col - 1, count, visited);

        // down
        edgeCount += islandPerimeterHelperBUG1(grid, row + 1, col, count, visited);

        // right
        edgeCount += islandPerimeterHelperBUG1(grid, row, col + 1, count, visited);

        visited[row][col] = 0;

        return edgeCount;
    }


    // BUG No : 2 -> If the function is returning count, no need to pass it in recursion function. We already have edgeCount internal variable that is
    // calculating count for all recursion function in a particular call and it will return count at the end. Count parameter is useless here.
    private int islandPerimeterHelperBUG2(int[][] grid, int row, int col, int[][] visited) {
        // base condition
        if (row < 0 || col < 0 || row >= grid.length || col >= grid[0].length || grid[row][col] == 0) {
            return 1;
        }

        if(visited[row][col] == 1)
        {
            return 0;
        }

        visited[row][col] = 1;

        int edgeCount = 0;

        // up
        edgeCount += islandPerimeterHelperBUG2(grid, row - 1, col, visited);

        // left
        edgeCount += islandPerimeterHelperBUG2(grid, row, col - 1, visited);

        // down
        edgeCount += islandPerimeterHelperBUG2(grid, row + 1, col, visited);

        // right
        edgeCount += islandPerimeterHelperBUG2(grid, row, col + 1, visited);

        visited[row][col] = 0;

        return edgeCount;
    }


    // BUG No : 3 -> Test Case [[1,1][1,1]]. Understand this carefully, why visited should not be reassigned to 0 in post call.
    // When recursion calls are returned, we are making visited 0 so that it can be visited again. But in this use case we need unique count of edges.
    // making visited 0 is not required as we have to visit any cell only once to get the unique count of edges. Hence we remove this variable itself.
    // And we do this ->
    private int islandPerimeterHelperBUG3(int[][] grid, int row, int col, int[][] visited) {
        // base condition
        if (row < 0 || col < 0 || row >= grid.length || col >= grid[0].length || grid[row][col] == 0) {
            return 1;
        }

        if(visited[row][col] == 1)
        {
            return 0;
        }

        visited[row][col] = 1;

        int edgeCount = 0;

        // up
        edgeCount += islandPerimeterHelperBUG3(grid, row - 1, col, visited);

        // left
        edgeCount += islandPerimeterHelperBUG3(grid, row, col - 1, visited);

        // down
        edgeCount += islandPerimeterHelperBUG3(grid, row + 1, col, visited);

        // right
        edgeCount += islandPerimeterHelperBUG3(grid, row, col + 1, visited);

        //visited[row][col] = 0;

        return edgeCount;
    }

    // To optimize space, we remove visited array completely
    public int islandPerimeterHelperOptimized(int[][] grid, int row, int col) {
        // base condition

        // Take note of grid condition == 0 in this if condition.
        if (row < 0 || col < 0 || row >= grid.length || col >= grid[0].length || grid[row][col] == 0) {
            return 1;
        }

        // Take note of this condition
        if (grid[row][col] == -1) {
            return 0;
        }

        // Take note of this assignment
        grid[row][col] = -1;

        int edgeCount = 0;

        // up
        edgeCount += islandPerimeterHelperOptimized(grid, row - 1, col);

        // left
        edgeCount += islandPerimeterHelperOptimized(grid, row, col - 1);

        // down
        edgeCount += islandPerimeterHelperOptimized(grid, row + 1, col);

        // right
        edgeCount += islandPerimeterHelperOptimized(grid, row, col + 1);

        return edgeCount;
    }


}
