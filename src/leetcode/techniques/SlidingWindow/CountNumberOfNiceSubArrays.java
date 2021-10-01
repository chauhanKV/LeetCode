package leetcode.techniques.SlidingWindow;

public class CountNumberOfNiceSubArrays {
    //Runtime: 26 ms, faster than 29.49% of Java online submissions for Count Number of Nice Subarrays.
    //Memory Usage: 92.3 MB, less than 24.13% of Java online submissions for Count Number of Nice Subarrays.
    //Next challenges:
    //Super Ugly Number
    //Split Array Largest Sum
    //Minimum Value to Get Positive Step by Step Sum

    //after replacing line 19 with 24
    //Runtime: 18 ms, faster than 43.71% of Java online submissions for Count Number of Nice Subarrays.
    //Memory Usage: 47.6 MB, less than 74.82% of Java online submissions for Count Number of Nice Subarrays.

    //Time complexity - O(n+(n-1)) => O(n)
    //Space Complexity - O(1)
    private int getPrefixSum(int[] A, int k)
    {
//        int end = 0;
//        int start = 0;
//        int countodd = 0;
//        int result = 0;

        int end = 0, start = 0, countodd = 0, result = 0;

        while(end < A.length)
        {
            countodd += (A[end] % 2 == 1 ? 1 : 0);
            while(countodd > k)
            {
                countodd -= (A[start] % 2 == 1 ? 1 : 0);
                start++;
            }
            result += end - start + 1;
            end++;
        }
        return result;
    }

    public int numberOfSubarrays(int[] A, int k) {
        if(k <= 0) return 0;
        if(A.length == 0) return 0;
        return getPrefixSum(A, k) - getPrefixSum(A, (k-1));
    }
}
