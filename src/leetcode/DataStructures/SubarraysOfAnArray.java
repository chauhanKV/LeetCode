package leetcode.DataStructures;

public class SubarraysOfAnArray {

    // Time Complexity : O(N^2)
    // Space Complexity : O(1)
    public void findSubArrays(int[] arr)
    {
        int start = 0, end = 0;

        while(start < arr.length && end < arr.length) // O(N)
        {
            for(int j = start ; j <= end; j++) // O(N)
            {
                System.out.print(arr[j] + "     ");
            }

            System.out.println();
            end++;

            if(end == arr.length)
            {
                start++;
                end = start;
            }

        }
    }
}
