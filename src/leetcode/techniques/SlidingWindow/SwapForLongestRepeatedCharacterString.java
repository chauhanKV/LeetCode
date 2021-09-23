package leetcode.techniques.SlidingWindow;
import java.util.*;

public class SwapForLongestRepeatedCharacterString {
    //Runtime: 3 ms, faster than 94.52% of Java online submissions for Swap For Longest Repeated Character Substring.
    //Memory Usage: 37.1 MB, less than 99.42% of Java online submissions for Swap For Longest Repeated Character Substring.
    //Next challenges:
    //First Unique Character in a String
    //Minimum Remove to Make Valid Parentheses
    //Longest Subsequence Repeated k Times
    public int maxRepOpt1(String text) {
        int[] freq = new int[26];
        int n = text.length();
        for (int i = 0; i < n; i++) {
            freq[text.charAt(i) - 'a']++;
        }
        int s = 0, maxCount = 0, res = 0;
        char maxCountChar = '#';
        int[] count = new int[26];
        for (int f = 0; f < n; f++) {
            if (++count[text.charAt(f) - 'a'] >= maxCount) {
                maxCount = count[text.charAt(f) - 'a'];
                maxCountChar = text.charAt(f);
            }
            while (f - s + 1 - maxCount > 1) {
                count[text.charAt(s++) - 'a']--;
            }
            res = Math.max(res, Math.min(freq[maxCountChar - 'a'], f - s + 1));
        }
        return res;
    }
}
