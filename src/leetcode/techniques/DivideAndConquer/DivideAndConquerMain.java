package leetcode.techniques.DivideAndConquer;

public class DivideAndConquerMain {
    public static void main(String[] args) {
        LongestSubstringWithAtLeastKRepeatingCharacters longestString = new LongestSubstringWithAtLeastKRepeatingCharacters();
        int maxString = longestString.longestSubstring("ababbc", 2);
        System.out.println("Longest Substring with At Least K Repeating Characters : " + maxString);

        MaximumSubarray maximumSubarray = new MaximumSubarray();
        int result = maximumSubarray.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4});
        System.out.println("Maximum Subarray : " + result);
    }
}
