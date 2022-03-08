package leetcode.DataStructuresArrays;

import java.util.List;

public class MatchingRule {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for (List<String> products : items) {
            int rule = 0;
            for (String val : products) {

                if (ruleKey.equals("type") && rule == 0) {
                    if (ruleValue.equals(val)) {
                        count++;
                    }
                }
                if (ruleKey.equals("color") && rule == 1) {
                    if (ruleValue.equals(val)) {
                        count++;
                    }
                }
                if (ruleKey.equals("name") && rule == 2) {
                    if (ruleValue.equals(val)) {
                        count++;
                    }
                }
                rule++;

            }
        }
        return count;
    }
}
