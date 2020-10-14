package leetcode.techniques.SlidingWindow;

import javax.print.DocFlavor;
import java.util.HashMap;
import java.util.Set;

public class LongestSubstringWithKDistinctCharacters {

    public String LongestSubstring(String s, int k) {
        HashMap<Character, Integer> distinctCharTable = new HashMap<>();
        int end = 0;
        int start = 0;

        while (end < s.length()) {
            if (distinctCharTable.containsKey(s.charAt(end))) {
                int count = distinctCharTable.get(s.charAt(end));
                distinctCharTable.replace(s.charAt(end), ++count);
            } else {
                distinctCharTable.put(s.charAt(end), 1);

            }
            end++;

            if (distinctCharTable.size() > k) {

                int count = distinctCharTable.get(s.charAt(start));
                distinctCharTable.replace(s.charAt(start), --count);

                if (count <= 0)
                    distinctCharTable.remove(s.charAt(start));

                start++;
            }
        }

        if(k > distinctCharTable.size())
            return "Length of distinct char is less than k";

        StringBuilder longestSubstringValue = new StringBuilder();
        distinctCharTable.forEach((key, value) -> {
            for (int i = 0; i < value; i++) {
                longestSubstringValue.append(key);
            }
        });

        return longestSubstringValue.toString();
    }

}
