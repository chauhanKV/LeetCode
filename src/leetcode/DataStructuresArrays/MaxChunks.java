package leetcode.DataStructuresArrays;

public class MaxChunks {
    public int maxChunksToSorted(int[] arr) {
        int chunkCount = 0, maxValue = 0;
        for(int i = 0 ; i < arr.length; i++)
        {
            maxValue = Math.max(arr[i], maxValue);
            if(maxValue == i)
            {
                chunkCount++;
            }
        }
        return chunkCount;
    }
}
