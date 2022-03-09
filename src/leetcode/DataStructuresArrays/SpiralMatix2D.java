package leetcode.DataStructuresArrays;

public class SpiralMatix2D {
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Spiral Matrix.
    //Memory Usage: 42.9 MB, less than 5.42% of Java online submissions for Spiral Matrix.
    //Next challenges:
    //Spiral Matrix II
    //Spiral Matrix III

    // TC : O(No of Elements)
    // SC : O(1)

    // ClockWise
    public void printSpiralMatixClockWise(int[][] arr)
    {
        int minRow = 0;
        int minCol = 0;
        int maxRow = arr.length - 1;
        int maxCol = arr[0].length - 1;

        int r = arr.length;
        int c = arr[0].length;

        int noOfElements = r * c;
        int counter = 0;

        while(counter < noOfElements)
        {

            // Move downward

            for(int i = minRow,j = minCol; i <= maxRow && counter < noOfElements;  i++)
            {
                System.out.print(arr[i][j]);
                counter++;
            }
            minCol++;

            // Move forward

            for(int i = maxRow,j = minCol; j <= maxCol && counter < noOfElements; j++)
            {
                System.out.print(arr[i][j]);
                counter++;
            }
            maxRow--;

            // Move upward

            for(int i = maxRow, j = maxCol; i >= minRow && counter < noOfElements; i--)
            {
                System.out.print(arr[i][j]);
                counter++;
            }
            maxCol--;


            // Move backwards

            for(int i = minRow, j = maxCol; j >= minCol && counter < noOfElements; j--)
            {
                System.out.print(arr[i][j]);
                counter++;
            }
            minRow++;
        }
        System.out.println();
    }

    // Anti - Clockwise
    public void printSpiralMatixAntiClockWise(int[][] matrix) {

        int minRow = 0;
        int minCol = 0;
        int maxRow = matrix.length - 1;
        int maxCol = matrix[0].length - 1;
        int r = matrix.length;
        int c = matrix[0].length;
        int noOfElements = r * c;
        int counter = 0;

        while (counter < noOfElements) {

            // Move forward

            for (int i = minRow, j = minCol; j <= maxCol && counter < noOfElements; j++) {
                System.out.print(matrix[i][j]);
                counter++;
            }
            minRow++;

            // Move downwards

            for (int i = minRow, j = maxCol; i <= maxRow && counter < noOfElements; i++) {
                System.out.print(matrix[i][j]);
                counter++;
            }
            maxCol--;

            // Move backward

            for (int i = maxRow, j = maxCol; j >= minCol && counter < noOfElements; j--) {
                System.out.print(matrix[i][j]);
                counter++;
            }
            maxRow--;


            // Move forward

            for (int i = maxRow, j = minCol; i >= minRow && counter < noOfElements; i--) {
                System.out.print(matrix[i][j]);
                counter++;
            }
            minCol++;
        }
        System.out.println();
    }

}
