package leetcode.techniques.SlidingWindow;

import java.util.HashMap;

public class LongestSubstringWithTwoDistinctCharacters {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        HashMap<Character, Integer> distinctCharTable = new HashMap<>();
        int start = 0;
        int maxSubstringLength = Integer.MIN_VALUE;


        for(int end = 0 ; end < s.length(); end++)
        {
            if (distinctCharTable.containsKey(s.charAt(end))) {
                int count = distinctCharTable.get(s.charAt(end));
                distinctCharTable.replace(s.charAt(end), ++count);
            } else {
                distinctCharTable.put(s.charAt(end), 1);
            }

            if (distinctCharTable.size() > 2) {

                int count = distinctCharTable.get(s.charAt(start));
                distinctCharTable.replace(s.charAt(start), --count);

                if (count <= 0)
                    distinctCharTable.remove(s.charAt(start));

                start++;
            }
            int currentRunningSum = 0;
            for(Integer val : distinctCharTable.values()) {
                currentRunningSum += val;
            }

            maxSubstringLength = Math.max(currentRunningSum, maxSubstringLength);

        }

        return maxSubstringLength;
    }

}
