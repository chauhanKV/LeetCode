package leetcode.DataStructuresArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSets {
    public void printAllSubsets(int[] nums)
    {
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for(int num : nums)
        {
            int n = outer.size();
            for(int i = 0 ; i < n; i++)
            {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }

        System.out.println("Subsets of given integer array are : ");
        for(List<Integer> list : outer)
        {
            System.out.println(list);
        }
        System.out.println();
    }

    public void printSubsetsWithoutDuplicates(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        int start = 0, end = 0;

        // Iterate through all the elements of the given array
        for (int i = 0; i < nums.length; i++) {
            start = 0;  // Always initialize to 0 and change it only when we find duplicate.
            // what this means is that create combinations skipping the start + end elements in the outer array
            // when we find duplicate.
            if (i > 0 && nums[i] == nums[i - 1]) {
                start = end + 1;
            }
            end = outer.size() - 1; // End is dynamic based on newly added array in outer list.

            int n = outer.size();
            for (int j = start; j < n; j++) // start from start to avoid creating duplicate arrays
            {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(nums[i]);
                outer.add(internal);
            }
        }

        System.out.println("Subsets of given integer array after removing duplicates are : ");
        for (List<Integer> list : outer) {
            System.out.println(list);
        }
        System.out.println();
    }
}
