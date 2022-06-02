package leetcode.techniques.Recursion;

import java.util.ArrayList;

public class MazePathsWithJumps {

    // Come back for Intuition. This problem contains lot of cues to understand why certain logic is applied. Go through the comments.
    public ArrayList<String> getMazePathWithJumps(int row, int col)
    {
        return getMazePathsWithJumps(1,1, row, col );
    }

    private ArrayList<String> getMazePathsWithJumps(int sourceRow, int sourceCol, int destinationRow, int destinationCol) {
        // base condition
        if(sourceRow == destinationRow && sourceCol == destinationCol)
        {
            ArrayList<String> baseResult = new ArrayList<>();
            baseResult.add("");
            return baseResult;
        }

        ArrayList<String> paths = new ArrayList<>();

        // vertical Hop
        // destinationRow - sourceRow -> this is important because we want to start from the current position of row in a particular recursion call.
        for(int moves = 1; moves <= (destinationRow - sourceRow); moves++)
        {
            ArrayList<String> verticalHops = getMazePathsWithJumps(sourceRow + moves, sourceCol, destinationRow, destinationCol);

            // move starts from 1 because we want the path name to show as 1,2,3 and not 0,1,2
            for(String vpath : verticalHops) {
                paths.add("V" + moves + vpath);
            }
        }

        // horizontal Hop
        for(int moves = 1; moves <= (destinationCol - sourceCol); moves++)
        {
            // We do move < and EQUALS so that when (dc - sc) = 0 it does not go in this for loop because move is starting from 1 and
            // SC has already reached DC.
            ArrayList<String> horizontalHops = getMazePathsWithJumps(sourceRow, sourceCol + moves, destinationRow, destinationCol);

            for(String hpath : horizontalHops)
            {
                paths.add("H" + moves + hpath);
            }
        }

        // diagonal Hops
        for(int moves = 1; moves <= (destinationRow - sourceRow) && moves <= (destinationCol - sourceCol); moves++)
        {
            ArrayList<String> diagonalHops = getMazePathsWithJumps(sourceRow + moves, sourceCol + moves, destinationRow, destinationCol);

            for(String dpath : diagonalHops)
            {
                paths.add("D" + moves + dpath);
            }
        }
        return paths;
    }
}
