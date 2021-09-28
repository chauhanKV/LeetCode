package leetcode.techniques.SlidingWindow;

public class NumberOfSubstringsContainingAll3Characters {
    //Runtime: 8 ms, faster than 90.44% of Java online submissions for Number of Substrings Containing All Three Characters.
    //Memory Usage: 38.6 MB, less than 99.19% of Java online submissions for Number of Substrings Containing All Three Characters.
    //Next challenges:
    //Strong Password Checker
    //Basic Calculator III
    //Thousand Separator

    //Solve more problems like these to understand this technique
    //Time Complexity : O(N)
    //Space Complexity : O(1)

    public int numberOfSubstrings(String s) {
        int count[] = {0, 0, 0};
        int result = 0;
        int start = 0;
        int length = s.length();

        for (int end = 0; end < length; end++) {
            count[s.charAt(end) - 'a']++;
            while (count[0] > 0 && count[1] > 0 && count[2] > 0) {
                count[s.charAt(start) - 'a']--;
                start++;
            }
            result += start;
        }
        return result;
    }
}
