package leetcode.techniques.FastAndSlowPointers;

public class CircularArrayLoop {

    // Need to work on efficient solution.
    // This solution gives error.
    public boolean circularArrayLoop(int[] nums) {

        if (nums.length == 0) return false;

        int fastPointer = 0, fastValue = nums[fastPointer];
        int slowPointer = 1, slowValue = nums[slowPointer];


        while (fastValue != slowValue && fastPointer < nums.length && slowPointer < nums.length && fastPointer >= 0 && slowPointer >= 0) {

            while (fastValue != 0) {
                if (fastValue > 0) {
                    fastValue--;
                    fastPointer--;
                } else {
                    fastValue++;
                    fastPointer++;
                }

            }

            while (slowValue != 0) {
                if (slowValue > 0) {
                    slowValue--;
                    slowPointer--;
                } else {
                    slowValue++;
                    slowPointer++;
                }
            }

            fastValue = nums[fastPointer];
            slowValue = nums[slowPointer];
        }

        if (fastValue == slowValue)
            return true;
        else
            return false;
    }
}
