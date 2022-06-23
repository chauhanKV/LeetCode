package leetcode.DataStructuresStrings;

public class LongestCommonPrefix {

    // Gives wrong answer for below test case. Need to check the correct solution. Come back again.
    // ["dog","racecar","car"]
    public String longestCommonPrefix(String[] strs) {
        int[] occurance = new int[26];

        for (String str : strs) {
            for (int j = 0; j < str.length(); j++) {
                occurance[str.charAt(j) - 'a']++;
            }
        }

        StringBuilder builder = new StringBuilder();
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        for (int i = 0; i < occurance.length; i++) {
            if (occurance[i] == strs.length) {
                builder.append(alphabet[i]);
            }
        }

        return builder.toString();
    }
}
