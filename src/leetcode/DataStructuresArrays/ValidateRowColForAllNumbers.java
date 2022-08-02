package leetcode.DataStructuresArrays;

public class ValidateRowColForAllNumbers {
    public boolean checkValid(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                if (!isValid(matrix, row, col))
                    return false;
            }
        }

        return true;
    }

    public boolean isValid(int[][] matrix, int row, int col) {
        int rowOccuranceCount = 0, colOccuranceCount = 0;

        for (int i = 0; i < matrix.length; i++) {
            // Check Col Occurance
            if (matrix[row][i] == matrix[row][col])
                colOccuranceCount++;

            // Check Row Occurance
            if (matrix[i][col] == matrix[row][col])
                rowOccuranceCount++;
        }

        return colOccuranceCount > 1 || rowOccuranceCount > 1 ? false : true;
    }
}
