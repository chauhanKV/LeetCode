package leetcode.techniques.Recursion;

import java.util.ArrayList;
import java.util.List;

public class NQueensII {

    //Runtime: 10 ms, faster than 15.34% of Java online submissions for N-Queens II.
    //Memory Usage: 41 MB, less than 50.58% of Java online submissions for N-Queens II.
    //Next challenges:
    //Word Search
    //Beautiful Arrangement
    //Tiling a Rectangle with the Fewest Squares

    // Not an optimized approach. Come back.
    public int totalNQueens(int n) {
        char[][] chessboard = new char[n][n];

        for (int i = 0; i < chessboard.length; i++) {
            for (int j = 0; j < chessboard[0].length; j++) {
                chessboard[i][j] = '.';
            }
        }

        List<List<String>> placedQueens = new ArrayList<>();
        solveNQueensHelper(chessboard, placedQueens, 0, n);
        return placedQueens.size();
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

    public List<String> convertToList(char[][] chessboard) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < chessboard.length; i++) {
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


    //Runtime: 2 ms, faster than 76.63% of Java online submissions for N-Queens II.
    //Memory Usage: 38.8 MB, less than 98.06% of Java online submissions for N-Queens II.
    //Next challenges:
    //Restore IP Addresses
    //Sum of All Subset XOR Totals
    //Maximum Compatibility Score Sum

    // More optimized by removing List<List<Integer>>

    public int totalNQueensOptimized1(int n) {
        char[][] chessboard = new char[n][n];

        for (int i = 0; i < chessboard.length; i++) {
            for (int j = 0; j < chessboard[0].length; j++) {
                chessboard[i][j] = '.';
            }
        }

        return solveNQueensHelperOptimized1(chessboard, 0, n);
    }

    public int solveNQueensHelperOptimized1(char[][] chessboard, int col, int n) {
        // base condition
        if (col == n) {
            return 1;
        }

        int count = 0;
        for (int row = 0; row < n; row++) {
            if (isSafe(chessboard, n, row, col)) // Is safe to place the queen at this location?
            {
                chessboard[row][col] = 'Q';
                count += solveNQueensHelperOptimized1(chessboard, col + 1, n);
                chessboard[row][col] = '.';
            }
        }

        return count;
    }
}
