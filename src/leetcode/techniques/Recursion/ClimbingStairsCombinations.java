package leetcode.techniques.Recursion;

import java.util.ArrayList;

public class ClimbingStairsCombinations {
    public ArrayList<String> climbingStairsCombination(int n) {
        // Base Case
        if (n == 0)
        {
            ArrayList<String> baseResult = new ArrayList<>();
            baseResult.add("");
            return baseResult;
        }
        if(n < 0)
        {
            return new ArrayList<>();
        }

        ArrayList<String> path1 = climbingStairsCombination(n-1);
        ArrayList<String> path2 = climbingStairsCombination(n-2);
        ArrayList<String> path3 = climbingStairsCombination(n-3);

        ArrayList<String> result = new ArrayList<>();
        for(String val : path1)
        {
            result.add(1 + val);
        }

        for(String val : path2)
        {
            result.add(2 + val);
        }

        for(String val : path3)
        {
            result.add(3 + val);
        }

        return result;
    }
}
