package leetcode.techniques.Recursion;

public class FindLastIndex {
    public int lastIndex(int[] arr, int idx, int x){
        if(idx == arr.length - 1)
        {
            return idx;
        }

        int maxValue = lastIndex(arr, idx + 1, x);

        if(arr[maxValue] == x)
        {
            return maxValue;
        }
        else
        {
            return idx;
        }
    }
}
