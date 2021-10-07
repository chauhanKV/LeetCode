package leetcode.techniques.SlidingWindow;

public class LongestSubarrayAfterDeleting1Element {
    //Runtime: 2 ms, faster than 64.91% of Java online submissions for Longest Subarray of 1's After Deleting One Element.
    //Memory Usage: 48 MB, less than 57.39% of Java online submissions for Longest Subarray of 1's After Deleting One Element.
    //Next challenges:
    //Evaluate Reverse Polish Notation
    //Is Subsequence

    // Time Complexity = O(N)
    // Space Compexity = O(1)
    public int longestSubarray(int[] nums) {
        int start = 0;
        int noOfones = 0;
        int noOfZeros = 0;
        int maxLength = Integer.MIN_VALUE;

        for(int end = 0; end < nums.length; end++)
        {
            if(nums[end] == 0)
                noOfZeros++;
            else
                noOfones++;

            while(noOfZeros > 1)
            {
                maxLength = Math.max(maxLength, noOfones);
                if(nums[start] == 0)
                    noOfZeros--;
                else
                    noOfones--;

                start++;
            }

            if(noOfZeros == 1)
            {
                maxLength = Math.max(maxLength, noOfones);
            }
        }

        if(noOfZeros == nums.length) return 0;

        if(noOfones == nums.length) return (nums.length - 1);

        return maxLength == Integer.MIN_VALUE ? 0 : maxLength;
    }
}
