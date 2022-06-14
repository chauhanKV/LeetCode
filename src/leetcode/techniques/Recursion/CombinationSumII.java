package leetcode.techniques.Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumII {

    // Gives wrong answer
    // The solution should not include duplicate entries.
    // Find better approach of solving this problem .
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        combinationSumHelper(candidates, target, 0, 0, new ArrayList<>(), list);
        return list;
    }

    public void combinationSumHelper(int[] candidates, int target, int sum, int arrayCounter, List<Integer> subList, List<List<Integer>> result) {
        // base condition
        if (sum == target) {
            result.add(new ArrayList<>(subList));
            return;
        }

        if (arrayCounter >= candidates.length || sum > target)
            return;

        int value = candidates[arrayCounter];

        // Here we are taking it
        subList.add(value);
        combinationSumHelper(candidates, target, sum + value, arrayCounter + 1, subList, result);

        // Here we are not taking it
        subList.remove(subList.size() - 1);
        combinationSumHelper(candidates, target, sum, arrayCounter + 1, subList, result);
    }
}
