package leetcode.techniques.NumberTheory;

public class ConvertToBase7 {
    
    //Runtime: 1 ms, faster than 92.50% of Java online submissions for Base 7.
    //Memory Usage: 42.2 MB, less than 5.49% of Java online submissions for Base 7.
    //Next challenges:
    //Integer Break
    //Valid Perfect Square
    //Calculate Money in Leetcode Bank

    // Time Complexity : ? Need to understand this
    // Space Complexity : O(1)
    
    public String convertToBase7(int num) {
        int val = 0, counter = 0;
        while(num != 0)
        {
            int digit = num % 7;
            val = val + (digit * (int)Math.pow(10, counter));
            num = num / 7;
            counter++;
        }
        return Integer.toString(val);
    }
}
