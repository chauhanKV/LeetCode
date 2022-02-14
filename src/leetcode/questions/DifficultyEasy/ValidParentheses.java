package leetcode.questions.DifficultyEasy;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ValidParentheses {
    //Runtime: 3 ms, faster than 53.68% of Java online submissions for Valid Parentheses.
    //Memory Usage: 42.3 MB, less than 6.72% of Java online submissions for Valid Parentheses.
    //Next challenges:
    //Generate Parentheses
    //Longest Valid Parentheses
    //Remove Invalid Parentheses
    //Check If Word Is Valid After Substitutions
    //Check if a Parentheses String Can Be Valid

    // Time Complexity - O(N) - length of string
    // Space Complexity - (1);

    public boolean isValid(String s) {
        if(s.length() <= 1) return false;

        Stack<Character> parentheses = new Stack<>();
        List<Character> leftParentheses = Arrays.asList('(', '{', '[');
        List<Character> rightParentheses = Arrays.asList(')', '}', ']');

        for(Character ch : s.toCharArray())
        {
            if(leftParentheses.contains(ch))
            {
                parentheses.push(ch);
            }

            if(rightParentheses.contains(ch))
            {
                if(parentheses.isEmpty())
                {
                    return false;
                }

                Character top = parentheses.pop();

                if(leftParentheses.indexOf(top) != rightParentheses.indexOf(ch))
                {
                    return false;
                }
            }
        }

        return parentheses.isEmpty();
    }
}
