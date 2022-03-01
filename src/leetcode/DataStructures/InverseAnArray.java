package leetcode.DataStructures;

public class InverseAnArray {

    // Time Complexity : O(N)
    // Space Complexity : O(N)
    public int[] inverseArray(int[] arr)
    {
        int[] invertedArray = new int[arr.length];

        for(int i = 0 ; i < arr.length; i++)
        {
            int value = arr[i];
            invertedArray[value] = i;
        }

        return invertedArray;
    }
}
