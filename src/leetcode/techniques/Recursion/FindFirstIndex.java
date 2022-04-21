package leetcode.techniques.Recursion;

public class FindFirstIndex {
    public int firstIndex(int[] arr, int idx, int x) {

        if (idx == arr.length) {
            return -1;
        }

        if (arr[idx] == x) {
            return idx;
        } else {
            return firstIndex(arr, idx + 1, x);
        }

    }
}
