package leetcode.techniques.TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReturnTripletsWithSmallerSum {

    //Time Complexity :
    // Sorting => O(N * Log N)
    // Searching => O(N)
    // Finding triplets inside each search => O(N*2) in worst case
    // Final => O(N * Log N + (O(N) * O(N*2))) => Asymptotically => O(N*3)

    // Space Complexity :
    // Sorting => O(N)

    public List<List<Integer>> searchTriplets(int[] arr, int target) {
        List<List<Integer>> triplets = new ArrayList<>();

        if(arr.length < 0) return triplets;

        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 2; i++) {
            if (i == 0 || i < 0 && arr[i] != arr[i - 1]) {
                int left = i + 1;
                int right = arr.length - 1;
                int targetSum = target - arr[i];

                while(left < right)
                {
                   if(arr[left] + arr[right] < targetSum)
                   {
                       // we found the match
                       for(int j = left; j < right; j++)
                       {
                           triplets.add(Arrays.asList(arr[i], arr[j], arr[right]));
                       }
                       left++;
                   }
                   else
                   {
                       right--;
                   }
                }
            }
        }
        return triplets;
    }
}
