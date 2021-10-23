package leetcode.techniques.TwoPointers;
import java.util.*;

public class TripletSumToZero {
    //Runtime: 27 ms, faster than 63.40% of Java online submissions for 3Sum.
    //Memory Usage: 56.4 MB, less than 38.42% of Java online submissions for 3Sum.
    //Next challenges:
    //3Sum Closest
    //4Sum
    //3Sum Smaller

    // Time Complexity :
    // Sorting => O(N * log N)
    // Searching => worst case scenario => O(N^2) => for each iteration we are again iterating the rest of the array to find sum
    // Final => O(N * log N + N^2) => O(N^2)

    // Space Complexity :
    // Sorting => O(N)
    // Searching => O(-1 + 3) => O(1)
    // Final => O(N) worst case
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> outputArray = new ArrayList();

        if(nums.length == 0 || nums.length < 3) return outputArray;
        Arrays.sort(nums);

        for(int i = 0 ; i < nums.length - 2; i++)
        {
            if(i == 0 || (i > 0 && nums[i] != nums[i-1]))
            {
                int left = i + 1;
                int right = nums.length - 1;
                int sum = 0 - nums[i];

                while(left < right)
                {
                    if(nums[left] + nums[right] == sum)
                    {
                        // we found the right match, store in outputArray
                        outputArray.add(Arrays.asList(nums[left], nums[right], nums[i]));
                        while(left < right && nums[left] == nums[left + 1]) left++;
                        while(left < right && nums[right] == nums[right - 1]) right--;
                        left++;
                        right--;
                    }
                    else if(nums[left] + nums[right] > sum)
                    {
                        right--;
                    }
                    else
                    {
                        left++;
                    }
                }
            }

        }
        return outputArray;

    }
}
