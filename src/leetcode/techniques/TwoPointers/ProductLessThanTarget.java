package leetcode.techniques.TwoPointers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ProductLessThanTarget {

    // Time Complexity : O(N * N * N) => O(N*3)
    // Space Complexity : temp list => O(N) => worst case scenario when all the items needs to be stored in temp
    public List<List<Integer>> findSubarrays(int[] arr, int target)
    {
        List<List<Integer>> subArrays = new ArrayList<>();
        double product = 1;
        int start = 0;
        //int countOfSubarrays = 0;

        // O(N)
        for(int right = 0 ; right < arr.length; right++)
        {
            product *= arr[right];

            // O(N) => for worst case
            while(product > target && start < arr.length)
            {
                product /= arr[start];
                start++;
            }

            // O(N) => for worst case
            List<Integer> tempList = new LinkedList<>();
            for(int i = right; i >= start ; i--)
            {
                // Linkedlist is adding all the possible combinations
                // within left and right index in the first location
                // each for loop is creating one subarray at a time
                // and saving in the subarray

                // Note : Starting from right index to avoid any duplicates in the subarray list

                // Linked List add() function takes O(N) time complexity in worst case scenario
                tempList.add(0,arr[i]);
                subArrays.add(new ArrayList<>(tempList));
            }


            //countOfSubarrays += (right - start) + 1;
        }

        return subArrays;
    }
}
