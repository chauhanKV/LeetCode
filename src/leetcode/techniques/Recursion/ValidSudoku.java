package leetcode.techniques.Recursion;

public class ValidSudoku {

    //Runtime: 2 ms, faster than 97.38% of Java online submissions for Valid Sudoku.
    //Memory Usage: 42.5 MB, less than 92.91% of Java online submissions for Valid Sudoku.

    // Time Complexity : O(N^2) -> traverse the matrix
    //                 : In each iteration - Validation is required - traversing row-wise + col-wise + submatrix to check for duplicate values
    //                 : O(N^2 * (m + n + k))

    // Space           : O(N^2 + k) k is the stack space to hold all the recursion calls.


    public boolean isValidSudoku(char[][] board) {
        boolean[][] visited = new boolean[9][9];
        return isValidSudokuHelper(board, visited);
    }

    public boolean isValidSudokuHelper(char[][] board, boolean[][] visited) {
        // Iterate through matrix
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] != '.' && !visited[i][j]) {
                    if (isValidPosition(board, i, j, board[i][j])) {
                        visited[i][j] = true;
                        return isValidSudokuHelper(board, visited);
                    } else {
                        return false;
                    }
                } else {
                    visited[i][j] = true;
                }
            }
        }
        return true;
    }

    public boolean isValidPosition(char[][] board, int row, int col, char value) {
        int countCol = 0, countRow = 0, countSubMatrix = 0;

        for (int i = 0; i < 9; i++) {
            // Check in col
            if (board[row][i] == value)
                countCol++;

            // Check in row
            if (board[i][col] == value)
                countRow++;

            // Check in submatrix
            if (board[(3 * (row / 3)) + (i / 3)][(3 * (col / 3)) + (i % 3)] == value)
                countSubMatrix++;
        }

        if (countCol > 1 || countRow > 1 || countSubMatrix > 1)
            return false;
        else
            return true;
    }
}
