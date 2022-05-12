package leetcode.techniques.Recursion;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationOfPhoneNumber {

    // (Not a good solution)
    //Runtime: 9 ms, faster than 19.97% of Java online submissions for Letter Combinations of a Phone Number.
    //Memory Usage: 42.5 MB, less than 64.12% of Java online submissions for Letter Combinations of a Phone Number.
    //Next challenges:
    //Generate Parentheses
    //Combination Sum
    //Binary Watch
    //Count Number of Texts

    // TC : ?
    // SC : ?
    public List<String> letterCombinations(String digits) {
        String[] codes = {"", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        return letterCombinationOfPhoneNumber(digits, codes);
    }

    private List<String> letterCombinationOfPhoneNumber(String digits, String[] codes) {
        // Base Condition
        if (digits.isEmpty()) {
            List<String> bresult = new ArrayList<String>();
            bresult.add("");
            return bresult;
        }

        char ch = digits.charAt(0);
        String remaining = digits.substring(1);

        List<String> recursionResult = letterCombinationOfPhoneNumber(remaining, codes);
        List<String> mainResult = new ArrayList<String>();

        String codeValue = codes[ch - '0'];
        for (int i = 0; i < codeValue.length(); i++) {
            for (String res : recursionResult) {
                mainResult.add(codeValue.charAt(i) + res);
            }
        }

        return mainResult;
    }
}
