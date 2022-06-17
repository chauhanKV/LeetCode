package leetcode.techniques.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSetsII {
    //Runtime: 2 ms, faster than 81.27% of Java online submissions for Subsets II.
    //Memory Usage: 44.4 MB, less than 22.84% of Java online submissions for Subsets II.
    //Next challenges:
    //Find Array Given Subset Sums
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        subsetsHelper(nums, 0, new ArrayList<>(), result);
        return result;
    }

    public void subsetsHelper(int[] nums, int start, List<Integer> subSet, List<List<Integer>> result) {
        result.add(new ArrayList<>(subSet));

        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1]) continue; // ignore duplicates

            // Take it
            subSet.add(nums[i]);
            subsetsHelper(nums, i + 1, subSet, result);

            // Leave it
            subSet.remove(subSet.size() - 1);
        }
    }
}
