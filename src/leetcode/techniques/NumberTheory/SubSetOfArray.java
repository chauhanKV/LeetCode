package leetcode.techniques.NumberTheory;

import java.util.ArrayList;
import java.util.List;

public class SubSetOfArray {

    //Runtime: 1 ms, faster than 82.25% of Java online submissions for Subsets.
    //Memory Usage: 43.3 MB, less than 40.76% of Java online submissions for Subsets.
    //Next challenges:
    //Subsets II
    //Generalized Abbreviation
    //Letter Case Permutation
    //Find Array Given Subset Sums
    //Count Number of Maximum Bitwise-OR Subsets

    // Time Complexity : O(N * (2 ^ M) )
    // Space Complexity : O(2 ^ M)
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> sets = new ArrayList<>();

        int limit = (int)Math.pow(2, nums.length);

        for(int i = 0 ; i < limit; i++) // O(2 ^ number)
        {
            int temp = i;
            List<Integer> subSet = new ArrayList<>();
            for(int j = nums.length - 1; j >= 0; j--) //O(N)
            {
                int remainder = temp % 2;
                temp = temp / 2;

                if(remainder != 0)
                {
                    subSet.add(nums[j]);
                }
            }

            sets.add(subSet);
        }

        return sets;
    }
}
