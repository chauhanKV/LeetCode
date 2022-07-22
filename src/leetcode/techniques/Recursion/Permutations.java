package leetcode.techniques.Recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    // Brute force approach
    // Use external DS to store visits

    //Runtime: 3 ms, faster than 46.05% of Java online submissions for Permutations.
    //Memory Usage: 44.4 MB, less than 67.86% of Java online submissions for Permutations.
    //Next challenges:
    //Next Permutation
    //Permutation Sequence
    //Combinations

    public List<List<Integer>> permuteBruteForce(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] frequency = new boolean[nums.length];
        permuteHelperBruteForce(nums, 0, new ArrayList<Integer>(), result, frequency);
        return result;
    }

    public void permuteHelperBruteForce(int[] nums, int arrayCounter, List<Integer> subSets, List<List<Integer>> result, boolean[] frequency)
    {
        if(subSets.size() == nums.length)
        {
            result.add(new ArrayList<>(subSets));
            return;
        }

        for(int i = 0; i < nums.length; i++)
        {
            if(!frequency[i])
            {
                subSets.add(nums[i]);
                frequency[i] = true;
                permuteHelperBruteForce(nums, i+1, subSets, result, frequency);

                // while coming back we get back to old state
                subSets.remove(subSets.size() - 1);
                frequency[i] = false;
            }
        }
    }

    //Runtime: 2 ms, faster than 72.37% of Java online submissions for Permutations.
    //Memory Usage: 45.2 MB, less than 18.02% of Java online submissions for Permutations.
    //Next challenges:
    //Next Permutation
    //Permutations II
    //Permutation Sequence
    //Combinations

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        permuteHelper(nums, 0, new ArrayList<>(), result);
        return result;
    }

    public void permuteHelper(int[] nums, int arrayCounter, List<Integer> subSets, List<List<Integer>> result) {
        if (subSets.size() == nums.length) {
            result.add(new ArrayList<>(subSets));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (subSets.contains(nums[i])) continue;

            subSets.add(nums[i]);
            permuteHelper(nums, i + 1, subSets, result);

            subSets.remove(subSets.size() - 1);
        }
    }


    //Super Optimized approach
    //Runtime: 1 ms, faster than 98.16% of Java online submissions for Permutations.
    //Memory Usage: 42.6 MB, less than 87.45% of Java online submissions for Permutations.
    //Next challenges:
    //Next Permutation
    //Permutation Sequence
    //Combinations

    // Using the same array store the change in combination and store it in result.
    // while coming we are changing it to old state for new combinations to come.
    public List<List<Integer>> permuteSuperOptimized(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        permuteHelperSuperOptimized(nums, 0, result);

        return result;
    }

    public void permuteHelperSuperOptimized(int[] nums, int index, List<List<Integer>> result)
    {
        // base condition
        if(index == nums.length)
        {
            List<Integer> subList = new ArrayList<>();
            for(int i = 0 ; i < nums.length; i++)
            {
                subList.add(nums[i]);
            }

            result.add(new ArrayList<>(subList));
            return;
        }

        for(int i = index; i < nums.length; i++)
        {
            swap(index, i, nums);
            permuteHelperSuperOptimized(nums, index+1, result);

            // while coming back we get back to old state
            swap(index, i, nums);
        }
    }

    public void swap(int index, int i, int[] nums)
    {
        int temp = nums[index];
        nums[index] = nums[i];
        nums[i] = temp;
    }
}
