package leetcode.techniques.Recursion;

import java.util.ArrayList;
import java.util.List;

//Runtime: 0 ms, faster than 100.00% of Java online submissions for Reverse Linked List.
//Memory Usage: 42.7 MB, less than 70.80% of Java online submissions for Reverse Linked List.
//Next challenges:
//Reverse Linked List II
//Binary Tree Upside Down
//Reverse Nodes in Even Length Groups
//Maximum Twin Sum of a Linked List

public class LetterCasePermutation {
    public List<String> letterCasePermutation(String s) {
        List<String> subList = new ArrayList<>();
        letterCasePermutationHelper(subList, s, "");
        return subList;
    }

    public void letterCasePermutationHelper(List<String> subList, String input, String output) {
        // base condition
        if (input.length() == 0) {
            subList.add(output);
            return;
        }

        // Induction
        if (Character.isDigit(input.charAt(0))) {
            output += input.charAt(0) + "";
            input = input.substring(1, input.length());
            letterCasePermutationHelper(subList, input, output);
        } else {

            String output1 = output;
            String output2 = output;

            output1 += (input.charAt(0) + "").toLowerCase();
            output2 += (input.charAt(0) + "").toUpperCase();

            input = input.substring(1, input.length());

            letterCasePermutationHelper(subList, input, output1);
            letterCasePermutationHelper(subList, input, output2);

        }

        return;
    }
}
