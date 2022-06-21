package leetcode.techniques.Recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
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
}