package leetcode.techniques.SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsInString {

    public List<Integer> findAnagrams(String s, String p) {
        int[] map = new int[26];
        List<Integer> result = new ArrayList<>();

        for(int i=0;i<p.length();i++){
            map[p.charAt(i) - 'a']++;
        }

        int windowStart = 0;
        int windowEnd = 0;
        while(windowEnd<s.length()){
            // valid anagram
            if(map[s.charAt(windowEnd) - 'a'] > 0){
                map[s.charAt(windowEnd++) - 'a']--;
                // window size equal to size of P
                if(windowEnd-windowStart ==  p.length()){
                    result.add(windowStart);
                }
            }
            // window is of size 0
            else if(windowStart == windowEnd){
                windowStart ++;
                windowEnd ++;
            }
            // decrease window size
            else{
                map[s.charAt(windowStart++) - 'a']++;
            }
        }
        return result;
    }


    // Different solution
//    public List<Integer> findAnagrams(String s, String p) {
//
//        if(p.length() < s.length() || s.length() == 0) return null;
//        List<Integer> result = new ArrayList<>();
//
//        int[] subStringArray = new int[26];
//        int[] actualStringArray = new int[26];
//
//        for(int i = 0; i < s.length(); i++)
//        {
//            subStringArray[s.charAt(i) - 'a']++;
//        }
//
//        for(int i = 0; i < p.length(); i++)
//        {
//            actualStringArray[p.charAt(i) - 'a']++;
//
//            if(i >= s.length())
//            {
//                actualStringArray[p.charAt(i - s.length()) - 'a']--;
//            }
//
//            if(Arrays.equals(subStringArray, actualStringArray))
//            {
//                result.add(i - s.length() + 1);
//            }
//        }
//
//        return result;
//    }

}
