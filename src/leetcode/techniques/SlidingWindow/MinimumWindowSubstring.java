package leetcode.techniques.SlidingWindow;
import java.util.*;

public class MinimumWindowSubstring {

    public String minWindow(String s, String t) {
        if(s.length() == 0 && t.length() == 0) return "";
        if(s.length() < t.length()) return "";

        HashMap<Character, Integer> charOccurance = new HashMap<>();
        int start = 0;
        int end = 0;
        int matchCount = 0;
        int minLength = Integer.MAX_VALUE;
        String window = "";

        for(int i = 0 ; i < t.length(); i++)
        {
            charOccurance.put(t.charAt(i), charOccurance.getOrDefault(t.charAt(i), 0) + 1);
        }

        while(end < s.length())
        {
            if(charOccurance.containsKey(s.charAt(end)))
            {
                charOccurance.put(s.charAt(end), charOccurance.getOrDefault(s.charAt(end), 0) - 1);
                if(charOccurance.get(s.charAt(end)) >= 0)
                {
                    matchCount++;
                }
            }

            while(matchCount == t.length())
            {
                if(charOccurance.containsKey(s.charAt(start)))
                {
                    if(charOccurance.get(s.charAt(start)) == 0)
                    {
                        matchCount--;
                    }
                    charOccurance.put(s.charAt(start), charOccurance.getOrDefault(s.charAt(start), 0) + 1);

                    if(minLength > ((end - start) + 1))
                    {
                        minLength = (end - start) + 1;
                        window = s.substring(start, end + 1);
                    }
                }
                start++;
            }
            end++;
        }

        return window;
    }
}
