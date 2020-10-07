package leetcode.techniques.SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;

        char[] characters = s.toCharArray();
        Set<Character> charCount = new HashSet<>();

        int start = 0;
        int end = 0;
        int maxNonRepeatingChars = Integer.MIN_VALUE;

       while(end < characters.length){
            if (!charCount.contains(characters[end])) {
                charCount.add(characters[end++]);
                maxNonRepeatingChars = Math.max(charCount.size(), maxNonRepeatingChars);
            } else {
                charCount.remove(characters[start++]);
            }
        }
        return maxNonRepeatingChars;
    }
}
