package leetcode.techniques.Recursion;

public class CombinationSumIV {
    public int combinationSum4(int[] nums, int target) {
        return combinationSum4Helper(nums, target, 0, 0);
    }

    public int combinationSum4Helper(int[] nums, int target, int index, int combinationCount) {
        if (target == 0) {
            combinationCount = combinationCount + 1;
            return combinationCount;
        }

        if (target < 0) {
            combinationCount = combinationCount + 0;
            return combinationCount;
        }

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            target = target - nums[i];
            if (target >= 0) {
                count += combinationSum4Helper(nums, target, i, combinationCount);
            }
            target = target + nums[i];
        }
        return count;
    }
}
