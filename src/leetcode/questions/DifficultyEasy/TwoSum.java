package leetcode.questions.DifficultyEasy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        if (nums == null || nums.length <= 0) return new int[]{0, 0};

        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                result[0] = i;
                result[1] = map.get(complement);
                return result;
            }

            map.put(nums[i], i);
        }
        return result;
    }
}
