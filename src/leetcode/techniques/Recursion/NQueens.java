package leetcode.techniques.Recursion;

import java.util.*;

public class NQueens {

    public List<List<String>> solveNQueens(int n) {
        String[][] chessboard = new String[n][n];

        for (int i = 0; i < chessboard.length; i++) {
            for (int j = 0; j < chessboard[0].length; j++) {
                chessboard[i][j] = ".";
            }
        }

        List<List<String>> placedQueens = new ArrayList<>();

        solveNQueensHelper(chessboard, placedQueens, 0, n);

        return placedQueens;
    }

    public void solveNQueensHelper(String[][] chessboard, List<List<String>> placedQueens, int col, int n) {
        // base condition
        if (col == n) {

            placedQueens.add(new ArrayList<>(Collections.singleton(Arrays.toString(chessboard))));
        }

        for (int row = 0; row < n; row++) {
            if (isSafe(chessboard, n, row, col)) // Is safe to place the queen at this location?
            {
                chessboard[row][col] = "Q";
                solveNQueensHelper(chessboard, placedQueens, col + 1, n);
                chessboard[row][col] = ".";
            }
        }
    }

    public boolean isSafe(String[][] chessboard, int n, int row, int col) {
        int rowDup = row;
        int colDup = col;

        // Check upper left diagonal
        while (row >= 0 && col >= 0) {
            if (Objects.equals(chessboard[row][col], "Q"))
                return false;

            row--;
            col--;
        }

        row = rowDup;
        col = colDup;
        // Check left
        while (col >= 0) {
            if (Objects.equals(chessboard[row][col], "Q"))
                return false;

            col--;
        }

        row = rowDup;
        col = colDup;
        // Check lower left diagonal
        while (row < n && col < n) {
            if (Objects.equals(chessboard[row][col], "Q"))
                return false;

            row++;
            col--;
        }
        return true;
    }

}
