package leetcode.DataStructuresArrays;

import java.util.Arrays;
public class RotateImage {

    //Runtime: 2 ms, faster than 8.18% of Java online submissions for Rotate Image.
    //Memory Usage: 42.8 MB, less than 38.74% of Java online submissions for Rotate Image.
    //Next challenges:
    //Determine Whether Matrix Can Be Obtained By Rotation

    // Time Complexity : O(N^2)
    // Space Complexity : O(1)
    public void rotate(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        int temp = 0;

        // First Transpose - O(N^2)

        for(int i = 0 ; i < row ; i++) // O(N)
        {
            for(int j = i ; j < col ; j++) // O(N)
            {
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Reverse each row  - O(N)

        for(int i = 0; i < row ; i++) // O(N)
        {
            int left = 0;
            int right = row - 1;
            while(left < right)  // O(N/2)
            {
                temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }

        System.out.println(Arrays.deepToString(matrix));
    }
}
