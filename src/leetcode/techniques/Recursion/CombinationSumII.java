package leetcode.techniques.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {


    //Runtime: 7 ms, faster than 46.34% of Java online submissions for Combination Sum II.
    //Memory Usage: 44.7 MB, less than 12.23% of Java online submissions for Combination Sum II.
    //Next challenges:
    //Cherry Pickup II
    //Maximum Number of Eaten Apples
    //GCD Sort of an Array
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(candidates);
        combinationSum2Helper(candidates, target, new ArrayList<>(), list, 0);
        return list;
    }

    private void combinationSum2Helper(int[] candidates, int remainder, ArrayList<Integer> subList, List<List<Integer>> result, int start) {
        // Base condition
        if (remainder < 0) {
            return;
        }

        if (remainder == 0) {
            result.add(new ArrayList<>(subList));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i - 1]) continue;

            // Here we take the value
            subList.add(candidates[i]);
            combinationSum2Helper(candidates, remainder - candidates[i], subList, result, i + 1);

            // Here we do not take the value
            subList.remove(subList.size() - 1);
        }

    }

    // This is more optimized where we are not making recursion calls when the value becomes greater than target. We are breaking the loop
    // From TakeUForward

    private void combinationSum2HelperOptimized(int[] candidates, int remainder, ArrayList<Integer> subList, List<List<Integer>> result, int start) {
        // Base condition
        if (remainder == 0) {
            result.add(new ArrayList<>(subList));
            return;
        }


        for(int i = start; i < candidates.length; i++)
        {
            // Check for duplicates
            if (i > start && candidates[i] == candidates[i - 1]) continue;
            // Break if value is greater than target, no need to go ahead in sorted array as
            // all the values after this are going to be greater
            if(candidates[i] > remainder) break;

            // Here we take the value
            subList.add(candidates[i]);
            combinationSum2HelperOptimized(candidates, remainder - candidates[i], subList, result, i + 1);

            // Here we do not take the value
            subList.remove(subList.size() - 1);
        }

    }


    // Gives wrong answer
    // The solution should not include duplicate entries.
    // Find better approach of solving this problem .

//    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
//        List<List<Integer>> list = new ArrayList<>();
//        combinationSumHelper(candidates, target, 0, 0, new ArrayList<>(), list);
//        return list;
//    }
//
//    public void combinationSumHelper(int[] candidates, int target, int sum, int arrayCounter, List<Integer> subList, List<List<Integer>> result) {
//        // base condition
//        if (sum == target) {
//            result.add(new ArrayList<>(subList));
//            return;
//        }
//
//        if (arrayCounter >= candidates.length || sum > target)
//            return;
//
//        int value = candidates[arrayCounter];
//
//        // Here we are taking it
//        subList.add(value);
//        combinationSumHelper(candidates, target, sum + value, arrayCounter + 1, subList, result);
//
//        // Here we are not taking it
//        subList.remove(subList.size() - 1);
//        combinationSumHelper(candidates, target, sum, arrayCounter + 1, subList, result);
//    }
}
