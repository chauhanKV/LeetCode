package leetcode.DataStructuresArrays;

import java.util.Arrays;

public class DetermineMatrixRotation {
    //Runtime: 1 ms, faster than 80.42% of Java online submissions for Determine Whether Matrix Can Be Obtained By Rotation.
    //Memory Usage: 41.5 MB, less than 63.20% of Java online submissions for Determine Whether Matrix Can Be Obtained By Rotation.
    //Next challenges:
    //Maximum Distance in Arrays
    //Jump Game III
    //Check if Move is Legal

    // Time Complexity : Asked in LeetCode forum. My thought is -> O(R * (N^2))
    // Space Complexity : O(1)
    public boolean findRotation(int[][] mat, int[][] target) {
        // O(R)
        for(int i = 0; i < 4; i++)
        {
            if(Arrays.deepEquals(mat, target))
            {
                return true;
            }
            // O(N^2)
            rotate(mat);
        }
        return false;
    }

    private void rotate(int[][] mat)
    {
        // Transpose array - O(N^2)
        for(int i = 0 ; i < mat.length; i++)
        {
            for(int j = i; j < mat.length; j++)
            {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        // Reverse each row of 2D array - O(N)
        for(int i = 0; i < mat.length ; i++)
        {
            int left = 0;
            int right = mat.length - 1;
            while(left < right)
            {
                int temp = mat[i][left];
                mat[i][left] = mat[i][right];
                mat[i][right] = temp;
                left++;
                right--;
            }
        }
    }
}
