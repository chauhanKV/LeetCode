package leetcode.techniques.DivideAndConquer;

public class DivideAndConquerMain {
    public static void main(String[] args) {
        LongestSubstringWithAtLeastKRepeatingCharacters longestString = new LongestSubstringWithAtLeastKRepeatingCharacters();
        int maxString = longestString.longestSubstring("ababbc", 2);
        System.out.println("Longest Substring with At Least K Repeating Characters : " + maxString);
    }
}
