package leetcode.techniques.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        subsetsHelperFormat2(nums, 0, new ArrayList<>(), result);
        return result;
    }

    public void subsetsHelperFormat1(int[] nums, int start, List<Integer> subSet, List<List<Integer>> result)
    {
        if(start >= nums.length)
        {
            result.add(new ArrayList<>(subSet));
            return;
        }

        // Take it
        subSet.add(nums[start]);
        subsetsHelperFormat1(nums, start + 1, subSet, result);

        // leave it
        subSet.remove(subSet.size() - 1);
        subsetsHelperFormat1(nums, start + 1, subSet, result);
    }

    //Runtime: 1 ms, faster than 85.37% of Java online submissions for Subsets.
    //Memory Usage: 44.1 MB, less than 7.16% of Java online submissions for Subsets.
    //Next challenges:
    //Subsets II
    //Generalized Abbreviation
    //Letter Case Permutation
    //Find Array Given Subset Sums
    //Count Number of Maximum Bitwise-OR Subsets
    public void subsetsHelperFormat2(int[] nums, int start, List<Integer> subSet, List<List<Integer>> result) {
        result.add(new ArrayList<>(subSet));

        for (int i = start; i < nums.length; i++) {
            // Take it
            subSet.add(nums[i]);
            subsetsHelperFormat2(nums, i + 1, subSet, result);

            // Leave it
            subSet.remove(subSet.size() - 1);
        }
    }
}
