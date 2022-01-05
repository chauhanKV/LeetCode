package leetcode.CTCI;

public class PermutationInString {

    public boolean checkInclusion(String s1, String s2) {

        if(s1.length() != s2.length()) return false;

        int[] charOccurrance = new int[128];
        int count = 0;

        for(int i = 0 ; i < s1.length(); i++)
        {
            charOccurrance[s1.charAt(i) - 'a']++;
        }

        for(int i = 0 ; i < s2.length(); i++)
        {
            charOccurrance[s2.charAt(i) - 'a']--;

            if(charOccurrance[s2.charAt(i) - 'a'] == 0)
            {
                count++;
            }

        }

        return count == s1.length();
    }

}
