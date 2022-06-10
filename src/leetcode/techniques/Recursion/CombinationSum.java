package leetcode.techniques.Recursion;

import java.util.ArrayList;
import java.util.List;
public class CombinationSum {

    // Gives wrong answer. Need to check the bugs in this problem
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> subList = new ArrayList<>();
        combinationSumHelper(candidates, target, 0, 0, list, subList);
        return list;
    }

    public void combinationSumHelper(int[] candidates, int target, int sum, int arrayCounter, List<List<Integer>> result, List<Integer> subList) {
        // base condition
        if (sum == target) {
            result.add(new ArrayList<Integer>(subList));
            return;
        }

        if (arrayCounter >= candidates.length || sum > target) {
            return;
        }

        int value = candidates[arrayCounter];

        // Here we are taking it
        subList.add(value);
        combinationSumHelper(candidates, target, sum + value, arrayCounter + 1, result, subList);

        // Here we are not taking it
        subList.remove(subList.size() - 1);
        combinationSumHelper(candidates, target, sum, arrayCounter + 1, result, subList);
    }
}
