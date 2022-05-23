package leetcode.techniques.Recursion;

public class NumberOfDiceRolls {
    // Gives wrong answer on leetcode because the expectation is different.
    // We are returning count of every possible combination but the ask is different on leetcode
    // Come to solve this correctly.
    public int numRollsToTarget(int n, int k, int target) {
        int count = numRolls(k, target);
        return n * count;
    }

    private int numRolls(int k , int target) {
        // base condition
        if (target == 0) {
            return 1;
        }

        int count = 0;

        for (int i = 1; i <= k && i <= target; i++) {
            count = count + numRolls(k, target - i);
        }

        return count;
    }
}
