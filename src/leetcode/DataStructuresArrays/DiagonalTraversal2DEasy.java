package leetcode.DataStructuresArrays;

public class DiagonalTraversal2DEasy {

    // Calculate Time and Space Complexity of below logic
    public void traverseDiagonally(int[][] arr)
    {
        // Logic starts here

        for(int gap = 0; gap < arr.length; gap++)
        {
            for(int i = 0, j = gap; j < arr[0].length; i++, j++)
            {
                System.out.print(arr[i][j] + "  ");
            }
        }
    }
}
