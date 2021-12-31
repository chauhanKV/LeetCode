package leetcode.questions.DifficultyEasy;

import java.util.Arrays;

public class ContainsDuplicate {
    //Runtime: 16 ms, faster than 10.46% of Java online submissions for Contains Duplicate.
    //Memory Usage: 51.4 MB, less than 34.68% of Java online submissions for Contains Duplicate.
    //Next challenges:
    //Contains Duplicate III

    // Time Complexity : O(N Log N)
    // Space Complexity : O(1)

    public boolean containsDuplicate(int[] nums) {
        if(nums.length <= 0) return false;

        Arrays.sort(nums);

        for(int i = 1 ; i < nums.length; i++)
        {
            if(nums[i] == nums[i-1])
            {
                return true;
            }
        }
        return false;
    }
}
