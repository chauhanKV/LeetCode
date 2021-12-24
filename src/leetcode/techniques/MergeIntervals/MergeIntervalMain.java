package leetcode.techniques.MergeIntervals;

import java.util.Arrays;

public class MergeIntervalMain {
    public static void main(String[] args) {
        MergeIntervals mergeIntervals = new MergeIntervals();
        int[][] array = mergeIntervals.merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}});
        System.out.println("Merged Intervals are : " + Arrays.toString(array));
    }
}
