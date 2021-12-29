package leetcode.techniques.MergeIntervals;

import java.util.ArrayList;
import java.util.List;

public class InsertIntervals {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        if(intervals.length <= 0) return intervals;
        if(newInterval.length <= 0) return intervals;

        List<int[]> result = new ArrayList<>();
        int i = 0, n = intervals.length;

        // First case
        // when end of current interval is less than start of new Interval
        while(i < n && intervals[i][1] < newInterval[0])
        {
            result.add(intervals[i]);
            i++;
        }

        // Second case
        // 1. when end of the current is greater than start of new interval -> above while loop will break at this point (This condition is already checked in the negative case of above while loop.)
        // 2. when start of current is less than end of new Interval
        int[] mergedInterval = new int[2];
        while(i < n && intervals[i][0] < newInterval[1])
        {
            mergedInterval[0] = Math.min(intervals[i][0], newInterval[0]);
            mergedInterval[1] = Math.max(intervals[i][1], newInterval[1]);
            i++;
        }
        result.add(mergedInterval);


        // Third case
        // Add all non overlapping elements
        while(i < n)
        {
            result.add(intervals[i]);
            i++;
        }

        return result.toArray(new int[result.size()][2]);
    }
}
