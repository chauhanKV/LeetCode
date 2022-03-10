package leetcode.DataStructuresArrays;

public class ExitOf2DMatrix {
    public void printExitOf2DMatrix(int[][] arr) {
        int direction = 0;
        int i = 0;
        int j = 0;

        // Directions
        // 0 => east => row , col++
        // 1 => south => row++ , col
        // 2 => west => row, col--
        // 3 => north => row--, col

        while (true) {
            // set directions
            direction = (direction + arr[i][j]) % 4;

            if (direction == 0) {
                j++;
            } else if (direction == 1) {
                i++;
            } else if (direction == 2) {
                j--;
            } else {
                i--;
            }

            // Breaking condition

            if (i < 0) {
                i++;
                break;
            } else if (j < 0) {
                j++;
                break;
            } else if (i == arr.length) {
                i--;
                break;
            } else if (j == arr[0].length) {
                j--;
                break;
            }
        }

        System.out.println(i + " " + j);

    }
}
