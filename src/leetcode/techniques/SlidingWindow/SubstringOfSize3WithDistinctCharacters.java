package leetcode.techniques.SlidingWindow;
import java.util.*;

public class SubstringOfSize3WithDistinctCharacters {
    //Runtime: 2 ms, faster than 49.43% of Java online submissions for Substrings of Size Three with Distinct Characters.
    //Memory Usage: 37.2 MB, less than 72.25% of Java online submissions for Substrings of Size Three with Distinct Characters.
    public int countGoodSubstrings(String s) {
        HashMap<Character, Integer> valueOccurance = new HashMap<>();
        int start = 0;
        int matchCount = 0;

        for(int end = 0; end < s.length(); end++)
        {
            valueOccurance.put(s.charAt(end), valueOccurance.getOrDefault(s.charAt(end), 0) + 1);

            if(end - start == 2) // 3
            {
                if(valueOccurance.size() == 3)
                {
                    matchCount++;
                }

                valueOccurance.put(s.charAt(start), valueOccurance.getOrDefault(s.charAt(start), 0) - 1);
                if(valueOccurance.get(s.charAt(start)) <= 0)
                {
                    valueOccurance.remove(s.charAt(start));
                }
                start++;
            }
        }

        return matchCount;
    }
}
