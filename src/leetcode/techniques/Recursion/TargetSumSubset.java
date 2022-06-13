package leetcode.techniques.Recursion;

public class TargetSumSubset {
    public void printTargetSumSubsets(int[] arr, int idx, String set, int sos, int tar) {
        // base condition
        if (idx >= arr.length) {
            if (tar == sos) {
                System.out.println(set);
                return;
            }
            return;
        }

        printTargetSumSubsets(arr, idx + 1, set + arr[idx] + ", ", sos + arr[idx], tar);
        printTargetSumSubsets(arr, idx + 1, set, sos, tar);
    }
}
