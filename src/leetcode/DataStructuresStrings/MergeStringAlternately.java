package leetcode.DataStructuresStrings;

public class MergeStringAlternately {

    //Runtime: 2 ms, faster than 43.19% of Java online submissions for Merge Strings Alternately.
    //Memory Usage: 42.8 MB, less than 27.98% of Java online submissions for Merge Strings Alternately.
    //Next challenges:
    //Zigzag Iterator

    // TC : O(max(m,n))
    // SC : O(max(m,n))

    // Not an optimised solution. This is brute force.
    // Work on optimised solution
    public String mergeAlternately(String word1, String word2) {

        int i = 0, j = 0;
        int max = Math.max(word1.length(), word2.length());
        StringBuilder builder = new StringBuilder();

        while (max > 0) {
            if (i < word1.length()) {
                builder.append(word1.charAt(i));
            }

            if (j < word2.length()) {
                builder.append(word2.charAt(j));
            }

            i++;
            j++;
            max--;
        }

        return builder.toString();
    }
}
