package leetcode.DataStructuresArrays;

public class FindEvenNumberOfDigits {

    // Runtime: 1 ms, faster than 98.76% of Java online submissions for Find Numbers with Even Number of Digits.
    //Memory Usage: 43.8 MB, less than 29.46% of Java online submissions for Find Numbers with Even Number of Digits.
    //Next challenges:
    //Finding 3-Digit Even Numbers

    // Time Complexity : O(N * noOfDigits)
    // Space Complexity : O(1)
    public int findNumbers(int[] nums) {
        int isEvenCount = 0;
        for(int i = 0 ; i < nums.length; i++)
        {
            int value = nums[i];
            int counter = 0;
            while(value != 0)
            {
                value = value / 10;
                counter++;
            }

            if(counter % 2 == 0)
            {
                isEvenCount++;
            }
        }

        return isEvenCount;
    }
}
