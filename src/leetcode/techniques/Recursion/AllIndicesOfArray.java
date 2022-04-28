package leetcode.techniques.Recursion;

public class AllIndicesOfArray {
    public int[] returnAllIndicesInArray(int[] arr, int target) {
        return allIndices(arr, target, 0, 0);
    }

    public static int[] allIndices(int[] arr, int x, int idx, int fsf) {
        if (idx == arr.length) {
            return new int[fsf];
        }

        int[] elements;

        if (arr[idx] == x) {
            elements = allIndices(arr, x, idx + 1, fsf + 1);
            elements[fsf] = idx;
        } else {
            elements = allIndices(arr, x, idx + 1, fsf);
        }
        return elements;

    }
}
