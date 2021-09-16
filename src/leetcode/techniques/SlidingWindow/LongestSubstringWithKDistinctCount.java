package leetcode.techniques.SlidingWindow;

import java.util.HashMap;

public class LongestSubstringWithKDistinctCount {

    // Time Complexity = O(N+K) => O(N)
    // Space Complexity = O(K)
    public static int findLength(String str, int k) {

        if(str.length() <= 0 || k == 0) return 0;

        HashMap<Character, Integer> distinctCharTable = new HashMap<>();

        int windowStart = 0;
        int maxLength = 0;

        for(int windowEnd = 0; windowEnd < str.length(); windowEnd++)
        {
            if(!distinctCharTable.containsKey(str.charAt(windowEnd)))
            {
                distinctCharTable.put(str.charAt(windowEnd), 1);
            }
            else {
                int count = distinctCharTable.get(str.charAt(windowStart));
                distinctCharTable.replace(str.charAt(windowStart) , ++count);
            }

            while(distinctCharTable.size() > k)
            {
                maxLength = Math.max(maxLength, (windowEnd - windowStart));

                int count = distinctCharTable.get(str.charAt(windowStart));
                distinctCharTable.replace(str.charAt(windowStart) , --count);

                if(count <= 0)
                {
                    distinctCharTable.remove(str.charAt(windowStart));
                }
                windowStart++;
            }

        }

        return maxLength;
    }
}
