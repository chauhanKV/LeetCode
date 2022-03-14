package leetcode.DataStructuresArrays;

public class RingRotate2DArray {
    // Calculate Time and Space Complexity of below logic

    public void ringRotateArray(int[][] arr, int s, int r)
    {
        int minRow = s - 1,
                minCol = s - 1,
                maxRow = arr.length - s,
                maxCol = arr[0].length - s,
                noOfElements = 2 * (maxRow - minRow + maxCol - minCol);

        int[] shellArray = new int[noOfElements];

        // 1. Convert shell into 1D array
        fill1DArrayFromShell(arr, shellArray, minRow, minCol, maxRow, maxCol);

        // 2. Rotate by r
        reverseArray(shellArray, r, noOfElements);

        // 3. Put the shell back to 2D array after conversion
        fillShellFrom1DArray(arr, shellArray, minRow, minCol, maxRow, maxCol);

        // 4. Display Rotated Array
        display(arr);
    }

    private void fill1DArrayFromShell(int[][] arr, int[] shellArray, int minRow, int minCol, int maxRow, int maxCol)
    {
        int count = 0;

        // Left wall
        for(int i = minRow, j = minCol ; i <= maxRow; i++)
        {
            shellArray[count] = arr[i][j];
            count++;
        }

        // Bottom wall
        for(int i = maxRow, j = minCol + 1; j <= maxCol; j++)
        {
            shellArray[count] = arr[i][j];
            count++;
        }
        // right wall
        for(int i = maxRow - 1, j = maxCol; i >= minRow; i--)
        {
            shellArray[count] = arr[i][j];
            count++;
        }
        // top wall
        for(int i = minRow, j = maxCol - 1; j >= minCol + 1; j--)
        {
            shellArray[count] = arr[i][j];
            count++;
        }
    }

    private void reverseArray(int[] shellArray, int r, int noOfElements)
    {
        r = r % noOfElements;

        if(r < 0)
        {
            r = r + noOfElements;
        }

        rotate(shellArray, 0, shellArray.length - r - 1);
        rotate(shellArray, shellArray.length - r, shellArray.length - 1);
        rotate(shellArray, 0, shellArray.length - 1);
    }


    private void fillShellFrom1DArray(int[][] arr, int[] shellArray, int minRow, int minCol, int maxRow, int maxCol)
    {
        int count = 0;
        // Left wall
        for(int i = minRow, j = minCol ; i <= maxRow; i++)
        {
            arr[i][j] = shellArray[count];
            count++;
        }

        // Bottom wall
        for(int i = maxRow, j = minCol + 1; j <= maxCol; j++)
        {
            arr[i][j] = shellArray[count];
            count++;
        }
        // right wall
        for(int i = maxRow - 1, j = maxCol; i >= minRow; i--)
        {
            arr[i][j] = shellArray[count];
            count++;
        }
        // top wall
        for(int i = minRow, j = maxCol - 1; j >= minCol + 1; j--)
        {
            arr[i][j] = shellArray[count];
            count++;
        }
    }

    private void rotate(int[] arr, int start, int end)
    {
        while(start < end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
