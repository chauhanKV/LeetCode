package leetcode.techniques.Recursion;

import java.util.*;

public class NQueens {

    //Runtime: 4 ms, faster than 77.35% of Java online submissions for N-Queens.
    //Memory Usage: 46 MB, less than 36.03% of Java online submissions for N-Queens.
    //Next challenges:
    //N-Queens II
    //Grid Illumination
    public List<List<String>> solveNQueens(int n) {
        char[][] chessboard = new char[n][n];

        for (int i = 0; i < chessboard.length; i++) {
            for (int j = 0; j < chessboard[0].length; j++) {
                chessboard[i][j] = '.';
            }
        }

        List<List<String>> placedQueens = new ArrayList<>();
        solveNQueensHelper(chessboard, placedQueens, 0, n);
        return placedQueens;
    }

    public void solveNQueensHelper(char[][] chessboard, List<List<String>> placedQueens, int col, int n) {
        // base condition
        if (col == n) {
            placedQueens.add(convertToList(chessboard));
            return;
        }

        for (int row = 0; row < n; row++) {
            if (isSafe(chessboard, n, row, col)) // Is safe to place the queen at this location?
            {
                chessboard[row][col] = 'Q';
                solveNQueensHelper(chessboard, placedQueens, col + 1, n);
                chessboard[row][col] = '.';
            }
        }
    }

    public List<String> convertToList(char[][] chessboard)
    {
        List<String> result = new ArrayList<>();

        for(int i = 0 ; i < chessboard.length; i++)
        {
            String s = new String(chessboard[i]);
            result.add(s);
        }

        return result;
    }

    public boolean isSafe(char[][] chessboard, int n, int row, int col) {
        int rowDup = row;
        int colDup = col;

        // Check upper left diagonal
        while (row >= 0 && col >= 0) {
            if (chessboard[row][col] == 'Q')
                return false;

            row--;
            col--;
        }

        row = rowDup;
        col = colDup;
        // Check left
        while (col >= 0) {
            if (chessboard[row][col] == 'Q')
                return false;

            col--;
        }

        row = rowDup;
        col = colDup;
        // Check lower left diagonal
        while (row < n && col >= 0) {
            if (chessboard[row][col] == 'Q')
                return false;

            row++;
            col--;
        }
        return true;
    }

}
