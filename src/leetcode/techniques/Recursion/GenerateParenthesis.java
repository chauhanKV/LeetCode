package leetcode.techniques.Recursion;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {

    //Runtime: 3 ms, faster than 52.38% of Java online submissions for Generate Parentheses.
    //Memory Usage: 44.3 MB, less than 22.50% of Java online submissions for Generate Parentheses.
    //Next challenges:
    //Check if a Parentheses String Can Be Valid
    public List<String> generateParenthesis(int n) {
        List<String> parenthesis = new ArrayList();
        generateParenthesisHelper(n, n, "", parenthesis);
        return parenthesis;
    }

    public void generateParenthesisHelper(int open, int close, String output, List<String> parenthesis) {
        // base condition
        if (open == 0 && close == 0) {
            parenthesis.add(output);
            return;
        }

        if (open > 0) {
            String output1 = output;
            output1 += "(";
            generateParenthesisHelper(open - 1, close, output1, parenthesis);
        }

        if (close > open) {
            String output2 = output;
            output2 += ")";
            generateParenthesisHelper(open, close - 1, output2, parenthesis);
        }
        return;
    }
}
