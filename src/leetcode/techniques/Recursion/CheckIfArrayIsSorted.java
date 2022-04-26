package leetcode.techniques.Recursion;

public class CheckIfArrayIsSorted {
    public boolean checkIfArraySorted(int[] arr) {
        return checkIfSorted(arr, 0);
    }

    private boolean checkIfSorted(int[] arr, int index) {
        // base Condition
        if(index == arr.length - 1)
            return true;

        // Recurrence Relation
        return arr[index] < arr[index + 1] && checkIfSorted(arr, index + 1);
    }
}
