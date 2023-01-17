package leetcode.DataStructuresArrays;

import java.util.Arrays;

public class MaxChunksII {
    public int maxChunksToSorted(int[] arr) {

        int rmin[] = new int[arr.length + 1];

        rmin[arr.length] = Integer.MAX_VALUE;
        for(int i = arr.length - 1; i >= 0; i--)
        {
            rmin[i] = Math.min(arr[i], rmin[i+1]);
        }

        System.out.println(Arrays.toString(rmin));
        int chunkCount = 0, lmax = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++)
        {
            lmax = Math.max(lmax, arr[i]);
            if(lmax <= rmin[i + 1])
            {
                chunkCount++;
            }
        }

        return chunkCount;
    }
}
