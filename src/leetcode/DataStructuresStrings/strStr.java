package leetcode.DataStructuresStrings;

public class strStr {
    // Gives wrong answer - come back with proper solution for bigger test cases.
    public int strStrValue(String haystack, String needle) {

        int left = 0;
        int right = 0;

        while (left < haystack.length() && right < haystack.length()) {
            if (needle.charAt(0) == haystack.charAt(right)) {
                return right;
            } else {
                right++;
            }
        }
        return -1;
    }
}
