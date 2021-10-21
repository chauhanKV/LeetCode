package leetcode.techniques.TwoPointers;

public class RemoveDuplicatesfromSortedArray {
    //Runtime: 2 ms, faster than 34.70% of Java online submissions for Remove Duplicates from Sorted Array.
    //Memory Usage: 44.5 MB, less than 40.61% of Java online submissions for Remove Duplicates from Sorted Array.
    //Next challenges:
    //Remove Element
    //Remove Duplicates from Sorted Array II

    //Time Complexity : O(n) - replacing the elements in one pass
    //Space Complexity : O(1) - replacing the elements in existing array
    public int removeDuplicates(int[] nums) {
        int nonDuplicateCount = 1;

        for(int i = 1; i < nums.length; i++)
        {
            if(nums[nonDuplicateCount - 1] != nums[i])
            {
                nums[nonDuplicateCount] = nums[i];
                nonDuplicateCount++;
            }
        }

        return nonDuplicateCount;
    }
}
