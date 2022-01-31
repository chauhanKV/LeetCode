package leetcode.questions.DifficultyEasy;

import java.util.Arrays;

public class ValidAnagrams {
    public boolean isAnagram(String s, String t) {
        int[] map = new int[26];

        for(int i = 0 ; i < s.length(); i++)
        {
            map[s.charAt(i) - 'a']++;
        }

        for(int i = 0 ; i < t.length(); i++) {
            map[t.charAt(i) - 'a']--;
        }

        for (int j : map) {
            if (j != 0)
                return false;
        }

        return true;
    }

    //Runtime: 2 ms, faster than 97.17% of Java online submissions for Valid Anagram.
    //Memory Usage: 42.4 MB, less than 18.79% of Java online submissions for Valid Anagram.
    //Next challenges:
    //Group Anagrams
    //Palindrome Permutation

    // Time Complexity : O(log n)
    // Space Complexity : O(N)
    public boolean isAnagramOptimized(String s, String t) {
        if(s.length() <= 0 || t.length() <= 0) return false;
        if(s.length() != t.length()) return false;

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return Arrays.equals(sArray, tArray);
    }
}
