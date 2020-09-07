package leetcode.techniques.SlidingWindow;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PermutationInString {

    public boolean checkInclusion(String s1, String s2) {

        if(s2.length() < s1.length() || s1.length() == 0) return false;

        int[] subStringArray = new int[26];
        int[] actualStringArray = new int[26];

        for(int i = 0; i < s1.length(); i++)
        {
            subStringArray[s1.charAt(i) - 'a']++;
        }

        for(int i = 0; i < s2.length(); i++)
        {
            actualStringArray[s2.charAt(i) - 'a']++;

            if(i >= s1.length())
            {
                actualStringArray[s2.charAt(i - s1.length()) - 'a']--;
            }

            if(Arrays.equals(subStringArray, actualStringArray)) return true;
        }

        return false;
    }
}
