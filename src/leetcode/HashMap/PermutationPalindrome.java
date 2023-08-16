package leetcode.HashMap;

import java.util.*;

public class PermutationPalindrome {
    public boolean hasPalindromePermutation(String theString) {

        // Count all the occurances
        Map<Character, Integer> occurances = new HashMap<>();
        int countOnes = 0;
        int characterLength = theString.length();

        for (char ch : theString.toCharArray()) {

            if (occurances.containsKey(ch)) {
                // increment the occurance
                int count = occurances.get(ch);
                occurances.replace(ch, count + 1);
                if (occurances.get(ch) > 2) {
                    return false;
                }
            } else {
                // add occurance
                occurances.put(ch, 1);
            }
        }

        for (Map.Entry<Character, Integer> mapElement : occurances.entrySet()) {
            if (mapElement.getValue() == 1) {
                countOnes++;
            }
        }


        if (countOnes > 1 && characterLength % 2 != 0) {
            return false;
        }

        if (countOnes > 0 && characterLength % 2 == 0) {
            return false;
        }


        return true;
    }


    public boolean hasPalindromePermutationOptimized1(String theString) {

        // Count all the occurances
        Map<Character, Integer> occurances = new HashMap<>();
        int remainingCount = 0;
        int characterLength = theString.length();



        for(char ch : theString.toCharArray())
        {

            if(occurances.containsKey(ch))
            {
                // increment the occurance
                int count = occurances.get(ch);
                occurances.replace(ch, count-1);
                remainingCount--;

            }
            else
            {
                // add occurance
                occurances.put(ch, 1);
                remainingCount++;
            }
        }

        return (remainingCount == 0 || remainingCount == 1);
    }

    public boolean hasPalindromePermutationOptimized2(String theString) {

        Set<Character> occurances = new HashSet<Character>();

        for(char ch : theString.toCharArray())
        {
            if(occurances.contains(ch))
            {
                occurances.remove(ch);
            }
            else
            {
                occurances.add(ch);
            }
        }

        return (occurances.size() <= 1);
    }
}
