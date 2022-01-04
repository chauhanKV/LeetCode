package leetcode.questions.DifficultyEasy;

import java.util.Arrays;
import java.util.HashSet;

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

    //Runtime: 6 ms, faster than 68.25% of Java online submissions for Contains Duplicate.
    //Memory Usage: 52.1 MB, less than 28.07% of Java online submissions for Contains Duplicate.
    //Next challenges:
    //Contains Duplicate III

    // Time complexity : O(N)
    // Space Complexity : O(N)

//    public boolean containsDuplicate(int[] nums) {
//        HashSet<Integer> set = new HashSet<>();
//
//        for(int i = 0 ; i < nums.length; i++)
//        {
//            if(set.contains(nums[i]))
//            {
//                return true;
//            }
//            else
//            {
//                set.add(nums[i]);
//            }
//        }
//        return false;
//    }
}
