package leetcode.HashMap;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    //Runtime: 4 ms, faster than 89.83% of Java online submissions for Two Sum.
    //Memory Usage: 46.2 MB, less than 16.33% of Java online submissions for Two Sum.
    //Next challenges:
    //Two Sum III - Data structure design
    //Subarray Sum Equals K
    //Two Sum IV - Input is a BST
    //Two Sum Less Than K
    //Max Number of K-Sum Pairs
    //Count Good Meals
    //Count Number of Pairs With Absolute Difference K
    //Number of Pairs of Strings With Concatenation Equal to Target
    //Find All K-Distant Indices in an Array
    //First Letter to Appear Twice
    //Number of Excellent Pairs
    //Number of Arithmetic Triplets
    //Node With Highest Edge Score
    //Check Distances Between Same Letters
    //Find Subarrays With Equal Sum
    //Largest Positive Integer That Exists With Its Negative

    // Time complexity : O(N)
    // Space Complexity : O(N)
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> complement = new HashMap<>();
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int complementValue = target - nums[i];
            if (complement.containsKey(complementValue)) {
                result[1] = i;
                result[0] = complement.get(complementValue);
                return result;
            }
            complement.put(nums[i], i);
        }
        return result;
    }
}
