package leetcode.techniques.Recursion;

import java.util.ArrayList;
import java.util.List;

public class PermutationSequence {

    //Runtime: 3 ms, faster than 69.74% of Java online submissions for Permutation Sequence.
    //Memory Usage: 42.4 MB, less than 10.71% of Java online submissions for Permutation Sequence.
    //Next challenges:
    //Next Permutation

    // This is a mathematical solution - come back to understand the intuition.

    public String getPermutation(int n, int k) {
        int fact = 1;
        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i < n; i++) {
            fact = fact * i;
            numbers.add(i);
        }

        numbers.add(n);
        String ans = "";
        k = k - 1;

        while (true) {
            ans = ans + numbers.get(k / fact);
            numbers.remove(k / fact);

            if (numbers.size() == 0) {
                break;
            }

            k = k % fact;
            fact = fact / numbers.size();
        }

        return ans;
    }
}
