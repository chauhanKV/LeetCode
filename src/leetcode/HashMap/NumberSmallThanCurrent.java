package leetcode.HashMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NumberSmallThanCurrent {
    // Runtime: 9 ms, faster than 71.08% of Java online submissions for How Many Numbers Are Smaller Than the Current Number.
    //Memory Usage: 44.6 MB, less than 53.08% of Java online submissions for How Many Numbers Are Smaller Than the Current Number.
    //Next challenges:
    //Count of Smaller Numbers After Self
    public int[] smallerNumbersThanCurrent(int[] nums) {
        Map<Integer, Integer> hashmap = new HashMap<>();
        int[] clonedNums = nums.clone();

        Arrays.sort(clonedNums);

        for (int i = 0; i < clonedNums.length; i++) {
            hashmap.putIfAbsent(clonedNums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            clonedNums[i] = hashmap.get(nums[i]);
        }

        return clonedNums;
    }
}
