package leetcode.techniques.SlidingWindow;

import java.util.*;

public class SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {

        if(nums.length == 0 || nums.length < k) return new int[0];

        int[] results = new int[nums.length - k + 1];

        for(int i = 0 ; i < nums.length - k + 1; i++)
        {
            int end = i + k;

            int maxValue = nums[i];
            for(int j = i ; j < end ; j++)
            {
                if(nums[j] > maxValue)
                    maxValue = nums[j];
            }

            results[i] = maxValue;

        }

        return results;
    }
}
