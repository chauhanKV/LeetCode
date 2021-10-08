package leetcode.techniques.SlidingWindow;

public class ReplaceSubstringforBalancedString {
    //Runtime: 7 ms, faster than 77.25% of Java online submissions for Replace the Substring for Balanced String.
    //Memory Usage: 39 MB, less than 84.36% of Java online submissions for Replace the Substring for Balanced String.
    //Next challenges:
    //Vowel Spellchecker
    //Generate a String With Characters That Have Odd Counts
    //Number of Distinct Substrings in a String

    //Complexity Analysis:
    // Time : O(n+m) => O(n)
    // Space : O(128) => O(1) ; constant
    public int balancedString(String s) {
        if(s.length() <= 0) return 0;
        int[] charOccurances = new int[128];
        int start = 0;
        int k = s.length()/4;
        int minLength = s.length();

        for(int i = 0; i < s.length(); i++)
        {
            charOccurances[s.charAt(i)]++;
        }

        for(int end = 0; end < s.length(); end++)
        {
            charOccurances[s.charAt(end)]--;

            while(start < s.length() && charOccurances['Q'] <= k && charOccurances['W'] <= k && charOccurances['E'] <= k && charOccurances['R'] <= k)
            {
                minLength = Math.min(minLength, (end - start) + 1);
                charOccurances[s.charAt(start)]++;
                start++;
            }
        }

        return minLength;
    }
}
