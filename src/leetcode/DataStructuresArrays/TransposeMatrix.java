package leetcode.DataStructuresArrays;

public class TransposeMatrix {

    //Runtime: 1 ms, faster than 63.80% of Java online submissions for Transpose Matrix.
    //Memory Usage: 48.4 MB, less than 36.73% of Java online submissions for Transpose Matrix.
    //Next challenges:
    //Beautiful Arrangement
    //Find Duplicate File in System
    //Count Submatrices With All Ones

    // Time Complexity : O(M*N)
    // Space Complexity : O(M*N)
        public int[][] transpose(int[][] matrix) {

            int row = matrix.length;
            int col = matrix[0].length;

            int[][] arr = new int[col][row];

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    arr[j][i] = matrix[i][j];
                }
            }
            return arr;
        }

}
