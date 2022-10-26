package leetcode.techniques.DynamicProgramming;

public class ZeroOneKnapSack {
    public int knapSack(int W, int wt[], int val[], int n) {
        return knapSackHelper(W, wt, val, n - 1);
    }

    private int knapSackHelper(int W, int wt[], int val[], int n) {
        // Base condition
        if (n < 0) {
            return 0;
        }

        // Choices
        if (wt[n] > W) {
            return knapSackHelper(W, wt, val, n - 1); // we cannot put that item. It's exceeding the weight.
        }

        //Either we take or leave it
        return Math.max((val[n] + knapSackHelper(W - wt[n], wt, val, n - 1)), knapSackHelper(W, wt, val, n - 1));
    }
}
