package leetcode.questions.DifficultyEasy;

public class AddDigits {

    //Runtime: 1 ms, faster than 100.00% of Java online submissions for Add Digits.
    //Memory Usage: 36.1 MB, less than 60.20% of Java online submissions for Add Digits.
    //Next challenges:
    //Sum of Digits in the Minimum Number
    //Sum of Digits of String After Convert

    // Time Complexity : O(N)
    // Space Complexity : O(1)
    public int addDigits(int num) {

        if(num < 10) return num;

        int digit = 0;
        int sum = 0;
        while(num >= 10)
        {
            digit = num % 10;
            num = num / 10;
            sum = digit + num;
            num = sum;
        }

        return num;
    }
}
