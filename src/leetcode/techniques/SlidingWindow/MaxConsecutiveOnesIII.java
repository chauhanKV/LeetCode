package leetcode.techniques.SlidingWindow;

public class MaxConsecutiveOnesIII {
    public int longestOnes(int[] A, int K) {
        int start = 0;
        int longestSubArray = Integer.MIN_VALUE;
        int maxChange = K;

        for(int end = 0 ; end < A.length; end++)
        {
            if(A[end] == 0) {
                maxChange--;
            }

            if(maxChange == -1)
            {
                while(A[start] != 0)
                {
                    start++;
                }
                if(A[start] == 0)
                    start++;
                maxChange++;
            }

            longestSubArray = Math.max((end - start + 1), longestSubArray);
        }

        return longestSubArray;
    }
}
