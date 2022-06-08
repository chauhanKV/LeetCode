package leetcode.techniques.Recursion;

public class IslandPerimeter {

    // Gives wrong answer, need to find the bug in this code.
    public int islandPerimeter(int[][] grid) {
        int[][] visited = new int[grid.length][grid[0].length];

        for (int i = 0; i < grid.length - 1; i++) {
            for (int j = 0; j < grid[0].length - 1; j++) {
                if (grid[i][j] == 1) {
                    return islandPerimeterHelper(grid, i, j, 0, visited);
                    //return statement is already returning once match is found. no need of break;
                    //break;
                }
            }
        }
        return 0;
    }

    public int islandPerimeterHelper(int[][] grid, int row, int col, int count, int[][] visited) {
        // base condition
        if (row < 0 || col < 0 || row >= grid.length || col >= grid[0].length || grid[row][col] == 0 || visited[row][col] == 1) {
            return 1;
        }

        visited[row][col] = 1;

        int edgeCount = 0;

        // up
        edgeCount += islandPerimeterHelper(grid, row - 1, col, count, visited);

        // left
        edgeCount += islandPerimeterHelper(grid, row, col - 1, count, visited);

        // down
        edgeCount += islandPerimeterHelper(grid, row + 1, col, count, visited);

        // right
        edgeCount += islandPerimeterHelper(grid, row, col + 1, count, visited);

        visited[row][col] = 0;

        return edgeCount;
    }
}
