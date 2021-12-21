package leetcode.techniques.FastAndSlowPointers;

public class CircularArrayLoop {

    // Revisit again to understand all edges cases
    public boolean circularArrayLoop(int[] nums) {
        if(nums.length <= 1) return false;

        for(int i = 0; i < nums.length; i++)
        {
            int slow = 0, fast = 0;
            boolean isForward = nums[i] >= 0;

            while(true)
            {
                slow = getNextPosition(nums, isForward, slow);
                if(slow == -1)
                    break;

                fast = getNextPosition(nums, isForward, fast);
                if(fast == -1)
                    break;

                fast = getNextPosition(nums, isForward, fast);
                if(fast == -1)
                    break;

                if(slow == fast)
                    return true;
            }


        }
        return false;
    }

    private int getNextPosition(int[] nums, boolean isForward, int pointer)
    {
        boolean direction = nums[pointer] >= 0;
        // Edge case 1
        if(direction != isForward)
            return -1;

        int nextIndex = (pointer + nums[pointer]) % nums.length;

        if(nextIndex < 0)
        {
            nextIndex = nextIndex + nums.length;
        }

        // Edge case 2
        if(nextIndex == pointer)
            return -1;

        return nextIndex;
    }
}
