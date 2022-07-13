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


    // ----------------------------------Using For loop-----------------------------------------------------

    //Runtime: 8 ms, faster than 40.39% of Java online submissions for Combination Sum.
    //Memory Usage: 44.7 MB, less than 65.03% of Java online submissions for Combination Sum.
    //Next challenges:
    //Combinations
    //Combination Sum III
    //Factor Combinations
    //Combination Sum IV
    public List<List<Integer>> combinationSumForLoop(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        combinationSumForLoopHelper(candidates, target, 0, new ArrayList<>(), list);
        return list;
    }

    public void combinationSumForLoopHelper(int[] candidates, int target, int arrayCounter, List<Integer> subList, List<List<Integer>> result) {
        if (target < 0) {
            return;
        }

        // base condition
        if (target == 0) {
            result.add(new ArrayList<>(subList));
            return;
        }

        for (int i = arrayCounter; i < candidates.length; i++) {
            subList.add(candidates[i]);

            combinationSumForLoopHelper(candidates, target - candidates[i], i, subList, result);

            subList.remove(subList.size() - 1);
        }
    }


    // Runtime: 2 ms, faster than 99.99% of Java online submissions for Combination Sum.
    //Memory Usage: 42.6 MB, less than 91.77% of Java online submissions for Combination Sum.
    //Next challenges:
    //Combinations
    //Combination Sum III
    //Factor Combinations
    //Combination Sum IV

    // TC : O(2^k * N)
    // SC : O(N)
    public void combinationSumHelperFasterSolution(int[] candidates, int target, int arrayCounter, List<Integer> subList, List<List<Integer>> result)
    {
        if(arrayCounter == candidates.length)
        {
            // base condition
            if (target == 0) {
                result.add(new ArrayList<>(subList));
            }

            return;
        }

        if(candidates[arrayCounter] <= target)
        {
            subList.add(candidates[arrayCounter]);

            combinationSumHelperFasterSolution(candidates, target - candidates[arrayCounter], arrayCounter, subList, result);

            subList.remove(subList.size() - 1);
        }

        combinationSumHelperFasterSolution(candidates, target, arrayCounter + 1, subList, result);

    }

}
