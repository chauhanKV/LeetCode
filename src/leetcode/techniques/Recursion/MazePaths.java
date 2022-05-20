package leetcode.techniques.Recursion;

import java.util.ArrayList;

public class MazePaths {
    public ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc)
    {
         if(sr == dr && sc == dc)
         {
             ArrayList<String> baseResult = new ArrayList<>();
             baseResult.add("");
             return baseResult;
         }
         ArrayList<String> horizontalPaths = new ArrayList<>();
         ArrayList<String> verticalPaths = new ArrayList<>();

         if(sc < dc)
         {
             horizontalPaths = getMazePaths(sr, sc + 1, dr, dc);
         }

         if(sr < dr)
         {
             verticalPaths = getMazePaths(sr + 1, sc, dr, dc);
         }

         ArrayList<String> resultPaths = new ArrayList<>();
         for(String hpath : horizontalPaths)
         {
             resultPaths.add("h" + hpath);
         }

         for(String vpath : verticalPaths)
         {
             resultPaths.add("v" + vpath);
         }

         return resultPaths;
    }
}
