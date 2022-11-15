package leetcode.HashMap;

import java.util.HashMap;


//Next question
//561. Array Partition
//More challenges
//523. Continuous Subarray Sum
//724. Find Pivot Index
//974. Subarray Sums Divisible by K
public class SubArraySumEqualK {
    public int subarraySum(int[] nums, int k) {
        return subArraySumHelper(nums, k);
    }
    // -1, -1, 1 target = 0
    public int subArraySumHelper(int[] nums, int target) {
        int count = 0, sum = 0;

        HashMap<Integer, Integer> occurance = new HashMap<>();
        occurance.put(0, 1);

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i]; // -1

            // complement
            if (occurance.containsKey(sum - target)) // 2 - 2 = 0   // false
            {
                int occuranceCount = occurance.get(sum - target);
                count += occuranceCount;
            }

            // increment occurance
            // target + prefixSum  = sum
            // prefixSum = sum - target
            if (occurance.containsKey(sum)) // false
            {
                int occuranceCount = occurance.get(sum);
                occurance.put(sum, occuranceCount + 1);   // -1 => 2
            } else {
                occurance.put(sum, 1);
            }

            //....|....
            // index [0,7] + [0,7] = [0,7]  0,1,2,3,4,5,6,7
        }
        return count;

    }
}
