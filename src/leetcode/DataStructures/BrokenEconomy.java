package leetcode.DataStructures;

public class BrokenEconomy {

    // Time Complexity : O(logN)
    // Space Complexity : O(1)
    public void findFloorCeil(int[] arr, int givenNumber)
    {
        int left = 0, right = arr.length - 1, mid = 0, ceil = 0, floor = 0;

        while(left <= right)
        {
            mid = (left + right) / 2;
            if(arr[mid] > givenNumber)
            {
                right = mid - 1;
                ceil = arr[mid];
            }
            else if(arr[mid] < givenNumber)
            {
                left = mid + 1;
                floor = arr[mid];
            }
            else
            {
                ceil = arr[mid];
                floor = arr[mid];
                break;
            }

        }
        System.out.println(ceil);
        System.out.println(floor);
    }
}
