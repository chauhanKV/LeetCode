package leetcode.techniques.Recursion;

import java.util.ArrayList;
import java.util.List;
public class CombinationSum {

    //Runtime: 10 ms, faster than 23.39% of Java online submissions for Combination Sum.
    //Memory Usage: 45.9 MB, less than 20.12% of Java online submissions for Combination Sum.
    //Next challenges:
    //Combination Sum II
    //Combinations
    //Combination Sum III
    //Factor Combinations
    //Combination Sum IV

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        combinationSumHelper(candidates, target, 0, 0, new ArrayList<>(), list);
        return list;
    }

    public void combinationSumHelper(int[] candidates, int target, int sum, int arrayCounter, List<Integer> subList, List<List<Integer>> result) {
        // base condition

        // - ----------------------------------------------
        // Why this base condition is different than target sum subset question of Nados ?
        if (sum == target) {
            result.add(new ArrayList<>(subList));
            return;
        }

        if (arrayCounter >= candidates.length || sum > target)
            return;
        // ------------------------------------------------

        int value = candidates[arrayCounter];

        // Here we are taking it
        subList.add(value);
        // Understand this -> why arrayCounter is not incremented ?
        combinationSumHelper(candidates, target, sum + value, arrayCounter, subList, result);

        // Here we are not taking it
        subList.remove(subList.size() - 1);
        combinationSumHelper(candidates, target, sum, arrayCounter + 1, subList, result);
    }
}
