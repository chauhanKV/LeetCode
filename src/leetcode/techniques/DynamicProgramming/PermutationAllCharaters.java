package leetcode.techniques.DynamicProgramming;

import java.util.HashSet;
import java.util.Set;

public class PermutationAllCharaters {

    public static Set<String> getPermutations(String inputString) {

        // generate all permutations of the input string

        Set<String> result = new HashSet<>();

        printPermutations(inputString, "", result);

        return result;
    }


    public static void printPermutations(String inputString, String resultSoFar, Set<String> result)
    {
        if(inputString.length() == 0)
        {
            result.add(resultSoFar);
        }

        for(int i = 0 ; i < inputString.length(); i++)
        {
            String currentChar = inputString.charAt(i) + "";  // c
            String leftString = inputString.substring(0, i);  // ""
            String rightString = inputString.substring(i+1);  // ats
            String newString = leftString + rightString;  // "" + ats

            printPermutations(newString, resultSoFar + currentChar, result);
            //("ats",  "" + c , <>)
            //("cts", "" + a, <>)
        }

    }




// cats
// output       inputString
// ""           cats


// "c"          ats  ->
    //"ca"       ts  ->
    // "cat"    s    -> "cats"  ""
    // "cas"    t    -> "cast"  ""
    //"ct"       as
    //"cs"       at
// "a"          cts  ->
// "t"          cas
// "s"          cat


}
