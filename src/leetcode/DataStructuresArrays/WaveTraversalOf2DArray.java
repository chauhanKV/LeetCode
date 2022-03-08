package leetcode.DataStructuresArrays;

public class WaveTraversalOf2DArray {

    public void waveTraversal(int[][] arr, int r1, int c1)
    {
        for(int j = 0; j < c1; j++)
        {
            if(j % 2 == 0)
            {
                for(int i = 0 ; i < r1 ; i++)
                {
                    System.out.println(arr[i][j]);
                }

            }
            else
            {
                for(int i = r1 - 1 ; i >= 0 ; i--)
                {
                    System.out.println(arr[i][j]);
                }
            }
        }
    }
}
