package leetcode.techniques.TwoPointers;

public class SquaresOfSortedArray {
    //Runtime: 2 ms, faster than 69.05% of Java online submissions for Squares of a Sorted Array.
    //Memory Usage: 53.6 MB, less than 6.00% of Java online submissions for Squares of a Sorted Array.
    //Next challenges:
    //Merge Sorted Array
    //Sort Transformed Array

    // Time Complexity : O(n) - one pass
    // Space Complexity : O(n) - storing sorted array values after squaring
    public int[] sortedSquares(int[] nums) {
        int sortedIndex = nums.length - 1, left = 0, right = nums.length - 1;
        int[] sortedArray = new int[nums.length];

        while(left <= right)
        {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if(leftSquare > rightSquare)
            {
                sortedArray[sortedIndex] = leftSquare;
                left++;
            }
            else
            {
                sortedArray[sortedIndex] = rightSquare;
                right--;
            }
            sortedIndex--;
        }
        return sortedArray;
    }
}
