package leetcode.techniques.Recursion;

import java.util.ArrayList;
import java.util.List;

public class PalindromicPartitioning {

    //Runtime: 15 ms, faster than 79.93% of Java online submissions for Palindrome Partitioning.
    //Memory Usage: 192.7 MB, less than 53.40% of Java online submissions for Palindrome Partitioning.
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();

        partitionHelper(0, s, new ArrayList<String>(), result);

        return result;
    }

    public void partitionHelper(int index, String s, List<String> subList, List<List<String>> result) {
        // base condition
        if (index == s.length()) {
            result.add(new ArrayList<String>(subList));
            return;
        }

        for (int i = index; i < s.length(); i++) {
            if (isPalindrome(s, index, i)) {
                subList.add(s.substring(index, i + 1));
                partitionHelper(i + 1, s, subList, result);

                subList.remove(subList.size() - 1);
            }
        }
    }

    public boolean isPalindrome(String s, int start, int end) {
        while (start <= end) {
            if (s.charAt(start) != s.charAt(end))
                return false;

            start++;
            end--;
        }

        return true;

    }
}
