package leetcode.techniques.TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuadrupletsSumToTarget {

    //------------------- Solution one -------------------------------//
    //Runtime: 15 ms, faster than 69.05% of Java online submissions for 4Sum.
    //Memory Usage: 39.7 MB, less than 66.50% of Java online submissions for 4Sum.
    //Next challenges:
    //4Sum II
    //Count Special Quadruplets

    //Time Complexity :
    // Sorting -> NLogN
    // Searching -> N^3
    // Final => N^3

    // Space Complexity :
    // Sorting -> O(N)

//    public List<List<Integer>> fourSum(int[] nums, int target) {
//        List<List<Integer>> list = new ArrayList<>();
//
//        if(nums.length <= 0) return list;
//
//        Arrays.sort(nums);
//
//        for(int i = 0 ; i < nums.length - 3 ; i++)
//        {
//            if(i == 0 || (i > 0 && nums[i] != nums[i-1]))
//            {
//                for(int j = i+1; j < nums.length - 2 ; j++)
//                {
//                    if(j == i+1 || (j > i+1 && nums[j] != nums[j-1]))
//                    {
//                        int first = i;
//                        int second = j;
//                        int left = j+1;
//                        int right = nums.length - 1;
//
//
//                        while(left >= 0 && right <= nums.length - 1 && left < right)
//                        {
//                            int sum = nums[first] + nums[second] + nums[left] + nums[right];
//                            if(sum == target)
//                            {
//                                list.add(Arrays.asList(nums[first], nums[second], nums[left], nums[right]));
//                                left++;
//                                right--;
//                                while(left < right && nums[left] == nums[left - 1])
//                                {
//                                    left++;
//                                }
//                                while(left < right && nums[right] == nums[right + 1])
//                                {
//                                    right--;
//                                }
//
//                            }
//                            else if(sum < target)
//                            {
//                                left++;
//                            }
//                            else
//                            {
//                                right--;
//                            }
//                        }
//                    }
//                }
//            }
//        }
//        return list;
//    }

    //------------------- Solution two -------------------------------//

    //Runtime: 16 ms, faster than 61.40% of Java online submissions for 4Sum.
    //Memory Usage: 39.3 MB, less than 93.19% of Java online submissions for 4Sum.
    //Next challenges:
    //4Sum II
    //Count Special Quadruplets

    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();

        if(nums.length <= 0) return list;

        for(int i = 0; i < nums.length - 3; i++)
        {
            if(i > 0 && nums[i] == nums[i-1])
                continue;
            for(int j = i + 1; j < nums.length - 2; j++)
            {
                if(j > i + 1 && nums[j] == nums[j - 1])
                    continue;
                searchPair(nums, target, i , j, list);
            }
        }

        return list;
    }

    private List<List<Integer>> searchPair(int[] nums, int target, int first, int second, List<List<Integer>> list)
    {
        int left = first + 1;
        int right = nums.length - 1;

        while(left < right)
        {
            int sum = nums[first] + nums[second] + nums[left] + nums[right];

            if(target == sum)
            {
                list.add(Arrays.asList(nums[first], nums[second] , nums[left] , nums[right]));
                left++;
                right--;

                while(left < right && nums[left] == nums[left - 1]) left++;
                while(left < right && nums[right] == nums[right + 1]) right--;
            }
            else if(sum < target)
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return list;
    }
}
