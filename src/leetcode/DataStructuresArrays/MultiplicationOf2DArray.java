package leetcode.DataStructuresArrays;

public class MultiplicationOf2DArray {

    public void multiplyMatrix(int[][] arr1, int r1, int c1, int[][]arr2, int r2, int c2)
    {
        int[][] result = new int[r1][c2];
        if(c1 != r2)
        {
            System.out.println("Invalid input");
        }
        else
        {
            for(int i = 0 ; i < r1 ; i++)
            {
                for(int j = 0 ; j < c2 ; j++)
                {
                    for(int k = 0 ; k < c1; k++)
                    {
                        result[i][j] += arr1[i][k] * arr2[k][j];
                    }
                }
            }

            for(int i = 0 ; i < r1; i++)
            {
                for(int j = 0 ; j < c2; j++)
                {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
