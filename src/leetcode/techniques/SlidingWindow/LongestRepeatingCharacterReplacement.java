package leetcode.techniques.SlidingWindow;

public class LongestRepeatingCharacterReplacement {

    public int characterReplacement(String s, int k) {

        int start = 0;
        int mostFrequentChar = 0;
        int max = 0;
        int[] maxCharCount = new int[26];

        for(int end = 0; end < s.length(); end++)
        {
            maxCharCount[s.charAt(end) - 'A']++;

            mostFrequentChar = Math.max(maxCharCount[s.charAt(end) - 'A'], mostFrequentChar);

            int nonRepeatingChar = (end - start + 1) - mostFrequentChar;

            if(nonRepeatingChar > k)
            {
                maxCharCount[s.charAt(start) - 'A']--;
                start++;
            }

            max = Math.max((end - start + 1), max);

        }

        return max;

    }

}
