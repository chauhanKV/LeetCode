package leetcode.techniques.DynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class PacificAtlanticWaterFlow {

    // Gives wrong answer but I attempted it.
    // Approach 1 : Brute Force

    public List<List<Integer>> pacificAtlantic(int[][] heights) {

        // Brute force
        List<List<Integer>> result = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < heights.length; i++) {
            List<Integer> subList = new ArrayList<>();
            for (int j = 0; j < heights[0].length; j++) {
                boolean isRowFlowPossible = checkRow(i, j, heights);
                boolean isColFlowPossible = checkCol(i, j, heights);

                if (isRowFlowPossible || isColFlowPossible) {
                    // We found one answer
                    count++;
                    subList.add(i);
                    subList.add(j);
                    result.add(new ArrayList(subList));

                    System.out.print(heights[i][j]);
                }
                System.out.println();
            }
        }

        return (count == heights.length) ? result : new ArrayList(new ArrayList<Integer>());
    }

    private boolean checkRow(int row, int col, int[][] heights) {
        for (int i = 0; i < heights[0].length; i++) {
            if (heights[row][col] < heights[row][i]) {
                return false;
            }
        }

        return true;
    }

    private boolean checkCol(int row, int col, int[][] heights) {
        for (int i = 0; i < heights.length; i++) {
            if (heights[row][col] < heights[i][col]) {
                return false;
            }
        }

        return true;
    }
}
