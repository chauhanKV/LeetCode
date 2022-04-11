package leetcode.DataStructuresArrays;

public class ReshapeTheMatrix {

    // Runtime: 0 ms, faster than 100.00% of Java online submissions for Reshape the Matrix.
    //Memory Usage: 42.8 MB, less than 97.01% of Java online submissions for Reshape the Matrix.
    //Next challenges:
    //Convert 1D Array Into 2D Array

    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int orgRow = mat.length;
        int orgCol = mat[0].length;

        // Edge case 1
        if(orgRow * orgCol != r * c)
        {
            return mat;
        }

        // Edge case 2
        if(orgRow == r && orgCol == c)
        {
            return mat;
        }

        int[][] result = new int[r][c];

        for(int i = 0 ; i < r*c ; i++)
        {
            result[i / c][i % c] = mat[i / orgCol][i % orgCol];
        }

        return result;
    }
}
