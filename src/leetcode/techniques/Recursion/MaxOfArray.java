package leetcode.techniques.Recursion;

public class MaxOfArray {
    public int maxOfArray(int[] arr, int idx){

        if(idx == arr.length - 1)
        {
            return arr[idx];
        }

        int misa = maxOfArray(arr, idx + 1);

        if(misa > arr[idx])
        {
            return misa;
        }
        else
        {
            return arr[idx];
        }
    }
}
