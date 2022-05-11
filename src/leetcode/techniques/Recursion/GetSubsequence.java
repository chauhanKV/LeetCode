package leetcode.techniques.Recursion;
import java.util.ArrayList;

public class GetSubsequence {
    // Draw Recursion tree for this
    public ArrayList<String> getAllSubsequences(String str)
    {
        // Base Condition
        if(str.length() <= 0)
        {
            ArrayList<String> bResult = new ArrayList<>();
            bResult.add("");
            return bResult;
        }

        Character ch = str.charAt(0);
        String newStr = str.substring(1);
        // Go deep into recursion until no value is left in the given string
        ArrayList<String> sub = getAllSubsequences(newStr);

        // While returning from base condition - start creating substring result.
        ArrayList<String> result = new ArrayList<>();
        for(String val : sub)
        {
            result.add("" + val);
        }

        for(String val : sub)
        {
            result.add(ch + val);
        }

        return result;
    }

    // Kunal's subset pattern

    public void getAllSubsequencesUsingSubsetPattern(String content)
    {
        System.out.println("Subsequences using Subset Pattern taught by Kunal : ");
        subsequences("", content);
        System.out.println();
    }

    private void subsequences(String p, String up)
    {
        // base condition
        if(up.isEmpty())
        {
            System.out.print(p + " ");
            return;
        }

        char ch = up.charAt(0);

        subsequences(p + ch , up.substring(1));
        subsequences(p , up.substring(1));
    }
}
