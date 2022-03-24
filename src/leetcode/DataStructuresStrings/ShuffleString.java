package leetcode.DataStructuresStrings;

public class ShuffleString {

    //Runtime: 2 ms, faster than 57.86% of Java online submissions for Shuffle String.
    //Memory Usage: 44.6 MB, less than 60.33% of Java online submissions for Shuffle String.
    //Next challenges:
    //132 Pattern
    //Tag Validator
    //Buildings With an Ocean View

    // Time Complexity : O(N)
    // Space Complexity : O(N)

    // Brute force
    // NExt : Optimize this solution.
    public String restoreString(String s, int[] indices) {
        StringBuilder str = new StringBuilder(s);

        for(int i = 0 ; i < indices.length; i++)
        {
            str.setCharAt(indices[i], s.charAt(i));
        }

        return str.toString();
    }
}
