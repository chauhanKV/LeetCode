package leetcode.techniques.Recursion;

import java.util.ArrayList;

public class LinearSearchUsingRecursion {
        public int SearchIndex(int[] arr, int target) {
            return searchIndexInArray(arr, target, 0);
        }

        private int searchIndexInArray(int[] arr, int target, int index) {
            // Base Condition
            if (index == arr.length) {
                return -1;
            }

            // Recurrence Relation
            if (arr[index] == target)
                return index;
            else
                return searchIndexInArray(arr, target, index + 1);
        }

        public ArrayList<Integer> SearchMultipleOccurnances(int[] arr, int target) {
            ArrayList<Integer> list = new ArrayList<>();
            return searchMultipleOccuranceInList(arr, target, 0, list);
        }

        private ArrayList<Integer> searchMultipleOccuranceInList(int[] arr, int target, int index, ArrayList<Integer> list) {
            // Base Condition
            if (index == arr.length) {
                return list;
            }

            if (arr[index] == target)
                list.add(index);

            return searchMultipleOccuranceInList(arr, target, index + 1, list);
        }
}
