package leetcode.questions.DifficultyEasy;

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
}
