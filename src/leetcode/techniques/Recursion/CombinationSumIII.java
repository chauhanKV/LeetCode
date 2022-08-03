package leetcode.techniques.Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII {

    //Runtime: 1 ms, faster than 85.65% of Java online submissions for Combination Sum III.
    //Memory Usage: 41.7 MB, less than 43.20% of Java online submissions for Combination Sum III.

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList();
        combinationSum3Helper(k, n, n, 1, new ArrayList<>(), result);
        return result;
    }

    public void combinationSum3Helper(int k, int target, int n, int index, List<Integer> subList, List<List<Integer>> result) {
        // base condition
        if (subList.size() == k && target == 0) {
            result.add(new ArrayList(subList));
            return;
        }

        // base condition
        if (subList.size() == k && target != 0) {
            return;
        }

        for (int i = index; i <= 9; i++) {
            // This if condition reduces the extra recursion call that add up to increased time complexity.
            // This if condition reduced time complexity from 2ms to 1ms.
            if (target <= n) {
                subList.add(i);

                combinationSum3Helper(k, target - i, n, i + 1, subList, result);

                subList.remove(subList.size() - 1);
            }
        }
    }
}
