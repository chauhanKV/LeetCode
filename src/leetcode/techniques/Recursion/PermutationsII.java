package leetcode.techniques.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsII {

    //Runtime: 3 ms, faster than 88.93% of Java online submissions for Permutations II.
    //Memory Usage: 48.4 MB, less than 45.95% of Java online submissions for Permutations II.
    //Next challenges:
    //Next Permutation
    //Palindrome Permutation II
    //Number of Squareful Arrays

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        permuteUniqueHelper(nums, 0, new ArrayList<>(), result, new boolean[nums.length]);
        return result;
    }

    public void permuteUniqueHelper(int[] nums, int arrayCounter, List<Integer> subSets, List<List<Integer>> result, boolean[] used) {
        // base condition
        if (subSets.size() == nums.length) {
            result.add(new ArrayList<>(subSets));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i] || i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) continue;

            used[i] = true;
            subSets.add(nums[i]);
            permuteUniqueHelper(nums, i + 1, subSets, result, used);

            used[i] = false;
            subSets.remove(subSets.size() - 1);
        }
    }
}
