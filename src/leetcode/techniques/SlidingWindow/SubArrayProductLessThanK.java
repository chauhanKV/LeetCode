package leetcode.techniques.SlidingWindow;

public class SubArrayProductLessThanK {
    //Runtime: 5 ms, faster than 99.78% of Java online submissions for Subarray Product Less Than K.
    //Memory Usage: 46.2 MB, less than 56.82% of Java online submissions for Subarray Product Less Than K.
    //Next challenges:
    //Maximum Product Subarray
    //Maximum Size Subarray Sum Equals k
    //Subarray Sum Equals K
    //Two Sum Less Than K
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k <= 1)  return 0;
        int product = 1;
        int subArrayCount = 0;
        int start = 0;

        for(int end = 0; end < nums.length; end++)
        {
            product *= nums[end];
            while(product >= k)
            {
                product /= nums[start];
                start++;
            }
            subArrayCount += (end - start) + 1;
        }
        return subArrayCount;
    }
}
