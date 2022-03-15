package leetcode.DataStructuresArrays;

import java.util.ArrayList;
import java.util.List;

public class SaddlePoint {

    //Runtime: 2 ms, faster than 82.17% of Java online submissions for Lucky Numbers in a Matrix.
    //Memory Usage: 50 MB, less than 37.64% of Java online submissions for Lucky Numbers in a Matrix.
    //Next challenges:
    //House Robber
    //Check If It Is a Straight Line
    //Minimum Incompatibility

    // Try this : 807. Max Increase to Keep City Skyline

    // Time Complexity : O(M * N)
    // Space Complexity : O(max(M,N)) => O(1)
    public List<Integer> findSaddlePoint (int[][] matrix) {
        // Space Complexity : O(max(M,N)) => O(1)
        List<Integer> arr = new ArrayList<>();

        int minRow = 0,
                minValue = Integer.MAX_VALUE,
                maxValue = Integer.MIN_VALUE;

        int row = 0, col = 0;

        // Time Complexity : O(M * N)
        while(minRow < matrix.length)
        {
            minValue = Integer.MAX_VALUE;
            maxValue = Integer.MIN_VALUE;

            for(int i = minRow, j = 0; j < matrix[0].length; j++)
            {
                if(minValue > matrix[i][j])
                {
                    minValue = matrix[i][j];
                    col = j;
                }
            }

            for(int i = 0, j = col; i < matrix.length ; i++)
            {
                if(maxValue < matrix[i][j])
                {
                    maxValue = matrix[i][j];
                    row = i;
                }
            }

            if(minValue == maxValue)
            {
                arr.add(matrix[row][col]);
                return arr;
            }

            minRow++;

        }
        return arr;
    }
}
