package leetcode.DataStructuresArrays;

public class SearchIn2DMatrix {
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Search a 2D Matrix.
    //Memory Usage: 41.9 MB, less than 67.60% of Java online submissions for Search a 2D Matrix.
    //Next challenges:
    //Search a 2D Matrix II

    // Time Complexity : O(N)
    // Space Complexity : O(1)
    public boolean searchMatrixWithReducedTC(int[][] matrix, int target) {

        int i = 0, j = matrix[0].length - 1;

        while (i < matrix.length && j >= 0) {
            if (target == matrix[i][j]) {
                return true;
            } else if (target > matrix[i][j]) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }

    // Time Complexity : O(n + n/2)
    // Space Complexity : O(1)
    public boolean searchMatrixWith2Passes(int[][] matrix, int target) {
        int left = 0, right = matrix[0].length - 1;

        // Time : O(N)
        for (int i = 0; i < matrix.length; i++) {
            left = 0;
            right = matrix[0].length - 1;
            // Time : O(N/2)
            while (left <= right) {
                if (matrix[i][left] == target) {
                    return true;
                }

                if (matrix[i][right] == target) {
                    return true;
                }
                left++;
                right--;
            }
        }
        return false;
    }
}
