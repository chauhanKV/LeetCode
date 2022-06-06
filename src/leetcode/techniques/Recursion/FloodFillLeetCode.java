package leetcode.techniques.Recursion;

public class FloodFillLeetCode {


    //Runtime: 2 ms, faster than 31.18% of Java online submissions for Flood Fill.
    //Memory Usage: 48.2 MB, less than 27.79% of Java online submissions for Flood Fill.
    //Next challenges:
    //Island Perimeter

    // TC : ??
    // SC : ??
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        // Understand why boolean array is not required
        // boolean[][] visited = new boolean[image.length][image[0].length];
        if (image[sr][sc] == newColor) return image;

        // Why need for color variable ?
        floodFillHelper(image, sr, sc, image[sr][sc], newColor);

        return image;
    }

    private void floodFillHelper(int[][] image, int sr, int sc, int color, int newColor) {
        // base condition

        // Why no need for this base condition.
        // if(movingRow == image.length - 1 && movingCol == image[0].length - 1)
        // {
        //     return image;
        // }

        if (sr < 0 || sc < 0 || sr == image.length || sc == image[0].length || image[sr][sc] != color) {
            return;
        }

        // Main logic
        image[sr][sc] = newColor;

        // Moving up
        floodFillHelper(image, sr - 1, sc, color, newColor);

        // Moving left
        floodFillHelper(image, sr, sc - 1, color, newColor);

        // Moving down
        floodFillHelper(image, sr + 1, sc, color, newColor);

        // Moving right
        floodFillHelper(image, sr, sc + 1, color, newColor);
    }
}
