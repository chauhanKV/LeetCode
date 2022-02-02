package leetcode.techniques.TwoPointers;

public class ReverseString {
    //Runtime: 6 ms, faster than 5.91% of Java online submissions for Reverse String.
    //Memory Usage: 57.2 MB, less than 5.37% of Java online submissions for Reverse String.
    //Next challenges:
    //Reverse Vowels of a String
    //Reverse String II

    // Time Complexity : O(Log N)
    // Space Complexity : O(1)
    public void reverseString(char[] s) {
        int start = 0, end = s.length - 1;

        while(start < end && start <= s.length - 1 && end >= 0)
        {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }

        System.out.println(s);
    }
}
