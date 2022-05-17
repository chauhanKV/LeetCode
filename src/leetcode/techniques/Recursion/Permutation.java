package leetcode.techniques.Recursion;

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
}
