package leetcode.techniques.SlidingWindow;
import java.util.*;

public class MinimumWindowSubstring {

    public int minWindow(String s, String t) {
        HashMap<Character, Integer> charOccurance = new HashMap<>();
        int start = 0;
        int end = 0;
        int matchCount = 0;
        int minLength = Integer.MAX_VALUE;

        for(int i = 0 ; i < t.length(); i++)
        {
            charOccurance.put(t.charAt(i), charOccurance.getOrDefault(t.charAt(i), 0) + 1);
        }

        while(end < s.length())
        {
            if(charOccurance.containsKey(t.charAt(end)))
            {
                charOccurance.put(t.charAt(end), charOccurance.getOrDefault(t.charAt(end), 0) + 1);
                if(charOccurance.get(t.charAt(end)) >= 0)
                {
                    matchCount++;
                }
            }

            while(matchCount == t.length())
            {
                if(charOccurance.containsKey(t.charAt(start)))
                {
                    if(charOccurance.get(t.charAt(start)) == 0)
                    {
                        matchCount--;
                    }
                    charOccurance.put(t.charAt(end), charOccurance.getOrDefault(t.charAt(start), 0) + 1);
                }

                minLength = Math.min(minLength, (end - start) + 1);
                start++;
            }
        }

        return minLength;
    }
}
