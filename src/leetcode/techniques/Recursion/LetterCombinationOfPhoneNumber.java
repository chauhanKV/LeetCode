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
            List<String> bresult = new ArrayList<>();
            bresult.add("");
            return bresult;
        }

        char ch = digits.charAt(0);
        String remaining = digits.substring(1);

        List<String> recursionResult = letterCombinationOfPhoneNumber(remaining, codes);
        List<String> mainResult = new ArrayList<>();

        String codeValue = codes[ch - '0'];
        for (int i = 0; i < codeValue.length(); i++) {
            for (String res : recursionResult) {
                mainResult.add(codeValue.charAt(i) + res);
            }
        }

        return mainResult;
    }

    public List<String> letterCombinationsUsingKunalApproach(String digits) {
        return letterCombUsingKunalApproach("", digits);
    }

    // Do it considering 1 does not have any letters, this solution works when 1 has 2 letters starting from a
    private List<String> letterCombUsingKunalApproach(String processed, String unprocessed)
    {
        // base condition
        if(unprocessed.isEmpty())
        {
            ArrayList<String> baseResult = new ArrayList<>();
            baseResult.add(processed);
            return baseResult;
        }

        ArrayList<String> result = new ArrayList<>();

        int digit = unprocessed.charAt(0) - '0';

        for(int i = (digit - 1) * 3 ; i < digit * 3; i++)
        {
            char ch = (char) ('a' + i);
            result.addAll(letterCombUsingKunalApproach(processed + ch , unprocessed.substring(1)));
        }
        return result;
    }
}
