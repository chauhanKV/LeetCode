package leetcode.techniques.Recursion;

import java.util.ArrayList;

public class Permutation {
    public void printPermutations(String processed, String unprocessed)
    {
        // base case
        if(unprocessed.isEmpty())
        {
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);

        for(int i = 0 ; i <= processed.length(); i++)
        {
            String first = processed.substring(0, i);
            String second = processed.substring(i);
            printPermutations(first + ch + second, unprocessed.substring(1));
        }
    }


    public ArrayList<String> printPermutationList(String processed, String unprocessed)
    {
        // base condition
        if(unprocessed.isEmpty())
        {
            ArrayList<String> baseCaseResult = new ArrayList<>();
            baseCaseResult.add(processed);
            return baseCaseResult;
        }

        ArrayList<String> result = new ArrayList<>();
        char ch = unprocessed.charAt(0);

        for(int i = 0 ; i <= processed.length(); i++)
        {
            String first = processed.substring(0, i);
            String second = processed.substring(i);
            result.addAll(printPermutationList(first + ch + second, unprocessed.substring(1)));
        }

        return result;
    }

    public int printPermutationCount(String processed, String unprocessed)
    {
        // base Condition
        if(unprocessed.isEmpty())
        {
            return 1;
        }

        char ch = unprocessed.charAt(0);
        int count = 0;

        for(int i = 0 ; i <= processed.length(); i++)
        {
            String first = processed.substring(0, i);
            String second = processed.substring(i);
            count += printPermutationCount(first + ch + second, unprocessed.substring(1));
        }

        return count;
    }
}
