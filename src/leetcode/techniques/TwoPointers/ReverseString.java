package leetcode.techniques.TwoPointers;

public class ReverseString {
    public void reverseString(char[] s) {
        int start = 0, end = s.length - 1;

        while(start != end && start <= s.length - 1 && end >= 0)
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
