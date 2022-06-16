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
        // If we find the possibility where the subset values are equal to the target we add them to the result.
        if (sum == target) {
            result.add(new ArrayList<>(subList));
            return;
        }

        // Otherwise, we return that function as is.
        // there are two possibilities of base condition - found the list or no - we have to return in both the cases.
        if (arrayCounter >= candidates.length || sum > target)
            return;
        // ------------------------------------------------

        int value = candidates[arrayCounter];

        // Here we are taking it
        subList.add(value);
        // The reason why array Counter is not incremented in this call is because we need to check if current value when duplicated in sublist can
        // sum up to the target.
        combinationSumHelper(candidates, target, sum + value, arrayCounter, subList, result);

        // Here we are not taking it
        subList.remove(subList.size() - 1);
        // Here we are incrementing the arrayCounter to check the possibility of next value if summed to be equal to the target.
        combinationSumHelper(candidates, target, sum, arrayCounter + 1, subList, result);
    }
}