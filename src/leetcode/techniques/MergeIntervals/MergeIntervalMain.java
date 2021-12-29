package leetcode.techniques.MergeIntervals;

import java.util.Arrays;

public class MergeIntervalMain {
    public static void main(String[] args) {
        MergeIntervals mergeIntervals = new MergeIntervals();
        int[][] array = mergeIntervals.merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}});
        System.out.println("Merged Intervals are : " + Arrays.deepToString(array));

        InsertIntervals insertIntervals = new InsertIntervals();
        int[][] insert = insertIntervals.insert(new int[][] {{1,3},{6,9}}, new int[] {2,5});
        System.out.println("Intervals after merging are : " + Arrays.deepToString(insert));
    }
}
