package leetcode.techniques.Recursion;

public class FloodFillNados {

    public void floodFillRecursion(int[][] maze) {
        boolean[][] visited = new boolean[maze.length][maze[0].length];
        floodFillRecursionHelper(maze, "", 0, 0, visited);
    }

    private void floodFillRecursionHelper(int[][] maze, String processed, int row, int col, boolean[][] visited) {
        // base condition
        if (row < 0 || col < 0 || row >= maze.length || col >= maze[0].length || maze[row][col] == 1 || visited[row][col]) {
            return;
        }

        if (row == maze.length - 1 && col == maze[0].length - 1) {
            if(processed.isEmpty())
            {
                System.out.println("No way found");
                return;
            }
            System.out.println(processed);
            return;
        }

        visited[row][col] = true;

        // move up
        floodFillRecursionHelper(maze,  processed + "U", row - 1, col, visited);
        // move left
        floodFillRecursionHelper(maze, processed + "L", row, col - 1, visited);
        // move down
        floodFillRecursionHelper(maze, processed + "D", row + 1, col, visited);
        // move right
        floodFillRecursionHelper(maze, processed + "R", row, col + 1, visited);

        visited[row][col] = false;
    }
}
