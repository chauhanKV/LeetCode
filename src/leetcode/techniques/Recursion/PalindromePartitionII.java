package leetcode.techniques.Recursion;

public class PalindromePartitionII {

    // This solution give TLE. Will have to use DP to store the result so that my logic doesn't have to compute. Come to this problem once you learn DP.
    // TC :
    // SC :

    public int minCut(String s) {
        return minCutHelper(s, 0, 0, Integer.MAX_VALUE);
    }

    public int minCutHelper(String s, int index, int cutCount, int minCut) {
        // base condition
        if (index == s.length()) {
            return cutCount - 1;
        }

        for (int i = index; i < s.length(); i++) {
            if (isPalindrome(s, index, i)) {
                minCut = Math.min(minCutHelper(s, i + 1, cutCount + 1, minCut), minCut);
            }
        }

        return minCut;
    }

    public boolean isPalindrome(String s, int start, int end) {
        while (start <= end) {
            if (s.charAt(start) != s.charAt(end))
                return false;

            start++;
            end--;
        }

        return true;
    }
}
