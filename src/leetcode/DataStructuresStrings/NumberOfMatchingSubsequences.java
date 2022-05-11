package leetcode.DataStructuresStrings;

public class NumberOfMatchingSubsequences {

    // This solutions works best for small test cases but gives TLE for bigger ones.
    // Optimize this solution

    public int numMatchingSubseq(String s, String[] words) {
        int subSequenceCount = 0;
        for (int i = 0; i < words.length; i++) {
            int matchCount = 0;
            for (int k = 0; k < s.length() && matchCount < words[i].length(); k++) {
                if (s.charAt(k) == words[i].charAt(matchCount)) {
                    matchCount++;
                }
            }

            if (matchCount == words[i].length()) {
                subSequenceCount++;
            }
        }
        return subSequenceCount;
    }
}
