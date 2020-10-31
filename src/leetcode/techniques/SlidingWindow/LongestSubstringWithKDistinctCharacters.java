package leetcode.techniques.SlidingWindow;

import java.util.HashMap;

public class LongestSubstringWithKDistinctCharacters {

    public String LongestSubstring(String s, int k) {
        HashMap<Character, Integer> distinctCharTable = new HashMap<>();
        int start = 0;

       for(int end = 0 ; end < s.length(); end++)
       {
            if (distinctCharTable.containsKey(s.charAt(end))) {
                int count = distinctCharTable.get(s.charAt(end));
                distinctCharTable.replace(s.charAt(end), ++count);
            } else {
                distinctCharTable.put(s.charAt(end), 1);
            }

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
        distinctCharTable.forEach((key, value) -> longestSubstringValue.append(String.valueOf(key).repeat(Math.max(0, value))));

        return longestSubstringValue.toString();
    }

}
