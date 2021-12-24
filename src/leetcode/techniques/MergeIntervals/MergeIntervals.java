package leetcode.techniques.MergeIntervals;
import java.util.Arrays;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 1) return intervals;
        int[][] newInterval = new int[intervals.length][];
        int index = 0;

        // sort
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        // Merge

        for (int i = 1; i < intervals.length; i++) {
            int previousStart = intervals[i - 1][0], previousEnd = intervals[i - 1][1], currentStart = intervals[i][0], currentEnd = intervals[i][1];

            if (currentStart < previousEnd) {
                currentEnd = Math.max(currentEnd, previousEnd);
                newInterval[i-1] = new int[]{previousStart, currentEnd};
            } else {
                newInterval[i-1] = new int[]{currentStart, currentEnd};
            }
        }

        return newInterval;
    }
}
