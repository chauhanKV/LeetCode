package leetcode.techniques.Recursion;

public class KthSymbolGrammar {
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for K-th Symbol in Grammar.
    //Memory Usage: 41 MB, less than 34.04% of Java online submissions for K-th Symbol in Grammar.
    //Next challenges:
    //Best Meeting Point
    //Nth Digit
    //Max Difference You Can Get From Changing an Integer
    public int kthGrammar(int n, int k) {
        // base condition
        if (n == 1 && k == 1) {
            return 0;
        }

        // Hypothesis
        int mid = (int) (Math.pow(2, n - 1)) / 2;

        if (k <= mid) {
            return kthGrammar(n - 1, k);
        } else {
            return kthGrammar(n - 1, k - mid) == 1 ? 0 : 1;
        }
    }
}
