package leetcode.techniques.TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuadrupletsSumToTarget {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();

        if(nums.length <= 0) return list;

        Arrays.sort(nums);

        for(int i = 0 ; i < nums.length - 3 ; i++)
        {
            if(i == 0 || (i > 0 && nums[i] != nums[i-1]))
            {
                for(int j = i+1; j < nums.length - 2 ; j++)
                {
                    if(j == i+1 || (j > i+1 && nums[j] != nums[j-1]))
                    {
                        int first = nums[i];
                        int second = nums[j];
                        int left = nums[j+1];
                        int right = nums[nums.length - 1];


                        while(left < right)
                        {
                            int sum = first + second + left + right;
                            if(sum == target)
                            {
                                list.add(Arrays.asList(first, second, left, right));
                                left++;
                                right--;
                                while(left < right && nums[left] == nums[left - 1])
                                {
                                    left++;
                                }
                                while(left < right && nums[right] == nums[right + 1])
                                {
                                    right--;
                                }

                            }
                            else if(sum < target)
                            {
                                left--;
                            }
                            else
                            {
                                right++;
                            }
                        }
                    }
                }
            }
        }
        return list;
    }
}
