package leetcode.techniques.TwoPointers;

import java.util.Arrays;

public class TwoPointersMain {
    public static void main(String[] args)
    {
        RemoveDuplicatesfromSortedArray removeDuplicates = new RemoveDuplicatesfromSortedArray();
        int nonDuplicates = removeDuplicates.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4});
        System.out.println("Removed duplicates from sorted Array : " + nonDuplicates);

        SquaresOfSortedArray squares = new SquaresOfSortedArray();
        int[] sq = squares.sortedSquares(new int[] {-4,-1,0,3,10});
        System.out.println("Squares of a Sorted Array : " + Arrays.toString(sq));
    }
}
