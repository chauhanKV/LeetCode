package leetcode.techniques.SlidingWindow;

import java.util.Set;

public class MaximumNoOfVowels {
    public int maxVowels(String s, int k) {
        int maxVowels = Integer.MIN_VALUE;
        int currentRunningSum = 0;
        //var vowels = Set.of('a', 'e', 'i', 'o', 'u');
        char[] inputCharArray = s.toCharArray();

        for(int i = 0 ; i < inputCharArray.length; i++)
        {
            if(isVowel(inputCharArray[i]))
            {
                currentRunningSum += 1;
            }

            if(i >= (k - 1))
            {
                maxVowels = Math.max(currentRunningSum, maxVowels);

                if(isVowel(inputCharArray[i - (k-1)]))
                {
                    currentRunningSum -= 1;
                }

            }
        }
        return maxVowels;
    }

    private boolean isVowel( char ch ) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
