package leetcode.techniques.TwoPointers;

import java.util.*;

public class TwoPointersMain {
    public static void main(String[] args)
    {
        RemoveDuplicatesfromSortedArray removeDuplicates = new RemoveDuplicatesfromSortedArray();
        int nonDuplicates = removeDuplicates.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4});
        System.out.println("Removed duplicates from sorted Array : " + nonDuplicates);

        SquaresOfSortedArray squares = new SquaresOfSortedArray();
        int[] sq = squares.sortedSquares(new int[] {-4,-1,0,3,10});
        System.out.println("Squares of a Sorted Array : " + Arrays.toString(sq));

        TripletSumToZero sumToZero = new TripletSumToZero();
        List<List<Integer>> outputArray = sumToZero.threeSum(new int[] {-1,0,1,2,-1,-4});
        System.out.println("Triplet Sum to Zero are : " + outputArray.toString());

        TripletSumToClosest sumToClosest = new TripletSumToClosest();
        int closest = sumToClosest.threeSumClosest(new int[] {0,2,1,-3}, 1);
        System.out.println("Triplet sum closest to target is : " + closest);

        TripletsWithSmallerSum smallerSum = new TripletsWithSmallerSum();
        int sum = smallerSum.searchTriplets(new int[] {-1, 4, 2, 1, 3}, 5);
        System.out.println("Count of Triplets with smaller sum is : " + sum);

        ReturnTripletsWithSmallerSum returnTriplets = new ReturnTripletsWithSmallerSum();
        List<List<Integer>> outputTriplets = returnTriplets.searchTriplets(new int[] {-1, 4, 2, 1, 3}, 5);
        System.out.println("Triplets with sum smaller are : " + outputTriplets.toString());
    }
}
