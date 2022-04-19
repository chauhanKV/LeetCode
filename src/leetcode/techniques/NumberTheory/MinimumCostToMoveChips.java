package leetcode.techniques.NumberTheory;

public class MinimumCostToMoveChips {

    //Runtime: 1 ms, faster than 9.47% of Java online submissions for Minimum Cost to Move Chips to The Same Position.
    //Memory Usage: 42.1 MB, less than 20.74% of Java online submissions for Minimum Cost to Move Chips to The Same Position.
    //Next challenges:
    //Minimum Number of Operations to Move All Balls to Each Box

    // Time Complexity : O(N)
    // Space Complexity : O(1)

    // Come back to remember intuition.
    public int minCostToMoveChips(int[] position) {
        int evenCount = 0, oddCount = 0;

        for(int i : position)
        {
            if(i % 2 == 0)
            {
                evenCount++;
            }
            else
            {
                oddCount++;
            }
        }

        return Math.min(oddCount, evenCount);
    }
}
