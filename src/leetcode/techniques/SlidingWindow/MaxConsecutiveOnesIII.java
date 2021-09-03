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


// Different solution
//class ReplacingOnes {
//    public static int findLength(int[] arr, int k) {
//        int zeroCount = 0;
//        int start = 0;
//        int maxLength = 0;
//
//        for(int end = 0; end < arr.length; end++)
//        {
//            if(arr[end] == 0)
//            {
//                zeroCount++;
//            }
//
//            if(zeroCount > k)
//            {
//                if(arr[start] == 0)
//                {
//                    zeroCount--;
//                }
//                start++;
//            }
//
//            maxLength = Math.max((end - start) + 1, maxLength);
//        }
//
//        return maxLength;
//    }
//}
