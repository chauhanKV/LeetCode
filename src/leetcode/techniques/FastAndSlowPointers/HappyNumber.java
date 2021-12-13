package leetcode.techniques.FastAndSlowPointers;

public class HappyNumber {

    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Happy Number.
    //Memory Usage: 36 MB, less than 77.09% of Java online submissions for Happy Number.
    //Next challenges:
    //Add Digits
    //Ugly Number
    //Sum of Digits of String After Convert

    // Time Complexity : O(LogN) #### Need to understand this better ####
    // Space Complexity : O(1)
    public boolean isHappy(int n) {
        int slow = n, fast = n;
        do
        {
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        }
        while(slow != fast);

        return slow == 1;
    }

    private int findSquare(int num)
    {
        int sum = 0, digit;
        while(num > 0)
        {
            digit = num % 10;
            sum += digit * digit;
            num = num / 10;
        }
        return sum;
    }
}
