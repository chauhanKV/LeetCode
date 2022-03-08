package leetcode.DataStructuresArrays;

public class RotateAnArray {

    //Runtime: 10 ms, faster than 5.39% of Java online submissions for Rotate Array.
    //Memory Usage: 60.4 MB, less than 77.24% of Java online submissions for Rotate Array.
    //Next challenges:
    //Rotate List
    //Reverse Words in a String II

    // Time Complexity : O(N)
    // Space Complexity : O(1)
    public int[] rotateArray(int[] arr, int k)
    {
        k = k % arr.length;
        if(k < 0)
        {
            k = k + arr.length;
        }

        // Rotate part 1
        rotate(arr, 0, arr.length - k - 1);

        // Rotate part 2
        rotate(arr, arr.length - k, arr.length - 1);

        // Rotate all
        rotate(arr, 0 , arr.length - 1);

        return arr;
    }

    private void rotate(int[] arr, int i , int j)
    {
        while(i < j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }
}

