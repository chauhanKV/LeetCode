package leetcode.techniques.DivideAndConquer;
import java.util.*;

public class LongestSubstringWithAtLeastKRepeatingCharacters {
        //Runtime: 1 ms, faster than 79.98% of Java online submissions for Longest Substring with At Least K Repeating Characters.
        //Memory Usage: 37.4 MB, less than 61.94% of Java online submissions for Longest Substring with At Least K Repeating Characters.
        //Next challenges:
        //Longest Subsequence Repeated k Times

    //Time Complexity : O(26 + n + n) => O(n)
    //Space Complexity : O(26) => O(1)

    public int longestSubstring(String s, int k) {
        // Edge cases
        if (s == null || s.length() <= 0) return 0;
        if (k == 0) return s.length();
        if (k > s.length()) return 0;

        int leftStringLength = 0;

        // Store the occurance in the HashMap
        HashMap<Character, Integer> charOccurance = new HashMap<>();
        for (char c : s.toCharArray()) {
            charOccurance.put(c, charOccurance.getOrDefault(c, 0) + 1);
        }

        while (leftStringLength < s.length() && charOccurance.get(s.charAt(leftStringLength)) >= k) {
            leftStringLength++;
        }

        if (leftStringLength >= s.length()) return leftStringLength;

        int leftString = longestSubstring(s.substring(0, leftStringLength), k);

        while (leftStringLength < s.length() && charOccurance.get(s.charAt(leftStringLength)) < k) {
            leftStringLength++;
        }

        int rightString = longestSubstring(s.substring(leftStringLength), k);

        return Math.max(leftString, rightString);

    }
}
