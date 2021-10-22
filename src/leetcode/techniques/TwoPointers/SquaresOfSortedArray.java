package leetcode.techniques.TwoPointers;

public class SquaresOfSortedArray {
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
