package leetcode.techniques.TwoPointers;

public class SquaresOfSortedArray {
    //Runtime: 2 ms, faster than 69.05% of Java online submissions for Squares of a Sorted Array.
    //Memory Usage: 53.6 MB, less than 6.00% of Java online submissions for Squares of a Sorted Array.
    //Next challenges:
    //Merge Sorted Array
    //Sort Transformed Array

    // Time Complexity : O(n) - one pass
    // Space Complexity : O(n) - storing sorted array values after squaring

    // After declaring leftSquare and rightSquare in first line and not inside while loop -
    //Runtime: 1 ms, faster than 100.00% of Java online submissions for Squares of a Sorted Array.
    //Memory Usage: 40.8 MB, less than 77.78% of Java online submissions for Squares of a Sorted Array.

    public int[] sortedSquares(int[] nums) {
        // int sortedIndex = nums.length - 1, left = 0, right = nums.length - 1;
        int sortedIndex = nums.length - 1, left = 0, right = nums.length - 1, leftSquare = 0, rightSquare = 0;
        int[] sortedArray = new int[nums.length];

        while(left <= right)
        {
            // int leftSquare = nums[left] * nums[left];
            // int rightSquare = nums[right] * nums[right];
            leftSquare = nums[left] * nums[left];
            rightSquare = nums[right] * nums[right];

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
