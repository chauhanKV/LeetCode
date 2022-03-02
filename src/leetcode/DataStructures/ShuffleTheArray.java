package leetcode.DataStructures;

public class ShuffleTheArray {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];

        int start = 0, end = n, counter = 0;

        while(end < nums.length)
        {
            arr[counter] = nums[start];
            arr[counter + 1] = nums[end];
            counter++;
            counter++;
            start++;
            end++;
        }

        return arr;
    }
}
