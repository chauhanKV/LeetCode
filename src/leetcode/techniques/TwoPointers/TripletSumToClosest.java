package leetcode.techniques.TwoPointers;

import java.util.Arrays;

public class TripletSumToClosest {
    //Runtime: 3 ms, faster than 98.90% of Java online submissions for 3Sum Closest.
    //Memory Usage: 38.6 MB, less than 81.05% of Java online submissions for 3Sum Closest.
    //Next challenges:
    //3Sum Smaller

    // Time Complexity :
    // Sorting => O(N * logN)
    // Searching => O(N*2)
    // Final => O(N * logN + N*2) => O(N*2)

    // Space Complexity :
    // Sorting : O(N)
    // Searching : O(1)
    // Final => O(N + 1) => O(N)
    public int threeSumClosest(int[] nums, int target) {
        int difference = Integer.MAX_VALUE;
        int result = 0;
        Arrays.sort(nums);

        for(int i = 0; i < nums.length-2; i++)
        {
            if(i == 0 || i > 0 && nums[i] != nums[i-1]) {
                int left = i + 1;
                int right = nums.length - 1;

                while (left < right) {
                    int sum = nums[i] + nums[left] + nums[right];
                    if (sum == target) {
                        return sum;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }

                    if (Math.abs(sum - target) < difference) {
                        difference = Math.abs(target - sum);
                        result = sum;
                    }
                }
            }

        }
        return result;
    }
}
