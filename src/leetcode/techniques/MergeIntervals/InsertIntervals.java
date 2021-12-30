package leetcode.techniques.MergeIntervals;

import java.util.ArrayList;
import java.util.List;

public class InsertIntervals {

    // Runtime: 1 ms, faster than 98.54% of Java online submissions for Insert Interval.
    // Memory Usage: 41.5 MB, less than 29.44% of Java online submissions for Insert Interval.
    // Next challenges:
    // Range Module

    // Space Complexity : O(N)
    // Time Complexity : O(N)
    public int[][] insert(int[][] intervals, int[] newInterval) {

        if(intervals.length <= 0 && newInterval.length <= 0) return intervals;

        List<int[]> result = new ArrayList<>();
        if(intervals.length <= 0 && newInterval.length > 0)
        {
            result.add(newInterval);
            return result.toArray(new int[result.size()][2] );
        }


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

        int[] mergeIntervals = newInterval;
        while(i < n && intervals[i][0] <= newInterval[1])
        {
            mergeIntervals[0] = Math.min(intervals[i][0], newInterval[0]);
            mergeIntervals[1] = Math.max(intervals[i][1], newInterval[1]);
            i++;
        }
        result.add(mergeIntervals);


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
