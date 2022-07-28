package leetcode.techniques.Recursion;

import java.util.Arrays;

public class SudokuSolver {

    //Runtime: 20 ms, faster than 45.75% of Java online submissions for Sudoku Solver.
    //Memory Usage: 41.9 MB, less than 39.25% of Java online submissions for Sudoku Solver.
    //Next challenges:
    //Valid Sudoku
    //Unique Paths III

    public void solveSudoku(char[][] board) {
        solveSudokuHelper(board, 0, 0);
        System.out.println(Arrays.deepToString(board));
    }


    public boolean solveSudokuHelper(char[][] board, int r, int c) {
        // traverse the matrix
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                // Check if the space is empty
                if (board[row][col] == '.') {
                    // We iterate from 1-9 to place the value
                    for (char inputValue = '1'; inputValue <= '9'; inputValue++) {
                        // We check if its a valid position to keep that value
                        if (isValidPosition(board, row, col, inputValue)) {
                            board[row][col] = inputValue;

                            if (solveSudokuHelper(board, row, col)) {
                                return true;
                            } else {
                                board[row][col] = '.';
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isValidPosition(char[][] board, int row, int col, char c) {
        for (int i = 0; i < 9; i++) {
            // Check row
            if (board[i][col] == c)
                return false;

            // Check col
            if (board[row][i] == c)
                return false;

            // Check in submatrix
            if (board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == c)
                return false;
        }
        return true;
    }
}
