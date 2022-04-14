package leetcode.DataStructuresStrings;

import java.util.HashSet;
import java.util.Set;

public class DetermineIfStringHalvesAreEqual {

    // Time complexity : O(N)
    // Space Complexity : O(V + 2S) => V => number of vowels in small and upper case | S => the strings separated to 2 halves. => Total SC : O(1)
    public boolean halvesAreAlike(String s) {
        if(s.length() % 2 != 0)
        {
            return false;
        }

        int halfLength = s.length() / 2;

        String s1 = s.substring(0, halfLength);
        String s2 = s.substring(halfLength);

        HashSet<Character> vowels = new HashSet();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        int s1Counter = 0;

        for(int i = 0; i < s1.length(); i++)
        {
            if(vowels.contains(s1.charAt(i)))
            {
                s1Counter++;
            }
        }

        int s2Counter = 0;

        for(int i = 0; i < s2.length(); i++)
        {
            if(vowels.contains(s2.charAt(i)))
            {
                s2Counter++;
            }
        }

        return s1Counter == s2Counter;
    }

    // Optimized approach
    // Time complexity : O(N)
    // Space Complexity : O(V) => V = vowels
    public boolean halvesAreAlikeOptimized(String s) {
        int left = 0, right = s.length() - 1, counter = 0;

        var vowels = Set.of('a','e','i','o','u','A','E','I','O','U');

        while(left < right)
        {
            if(vowels.contains(s.charAt(left)))
            {
                counter++;
            }

            if(vowels.contains(s.charAt(right)))
            {
                counter--;
            }

            left++;
            right--;
        }

        return counter == 0;
    }


}
