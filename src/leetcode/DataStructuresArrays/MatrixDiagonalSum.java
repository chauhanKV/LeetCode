package leetcode.DataStructuresArrays;

public class MatrixDiagonalSum {

    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Matrix Diagonal Sum.
    //Memory Usage: 48.1 MB, less than 32.69% of Java online submissions for Matrix Diagonal Sum.
    //Next challenges:
    //Check if Every Row and Column Contains All Numbers

    // TC : O(N)
    // SC : O(1)
    public int diagonalSum(int[][] mat) {
        int runningSum = 0;

        // Calculate primary Diagonal
        int i = 0, j = 0;
        while(i < mat.length && j < mat.length)
        {
            runningSum += mat[i][j];
            i++;
            j++;
        }

        // Calculate Secondary Diagonal
        i = 0;
        j = mat.length - 1;
        while(i < mat.length && j >= 0)
        {
            runningSum += mat[i][j];
            i++;
            j--;
        }

        // Substract the middle value
        if(mat.length % 2 == 1)
        {
            i = (mat.length / 2);
            j = (mat.length / 2);

            runningSum -= mat[i][j];
        }

        return runningSum;
    }
}
