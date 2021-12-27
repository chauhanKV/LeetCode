package leetcode.techniques.MergeIntervals;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class MergeIntervals {

    //Runtime: 5 ms, faster than 95.33% of Java online submissions for Merge Intervals.
    //Memory Usage: 41.4 MB, less than 83.33% of Java online submissions for Merge Intervals.
    //Next challenges:
    //Insert Interval
    //Meeting Rooms
    //Meeting Rooms II
    //Teemo Attacking
    //Add Bold Tag in String
    //Range Module
    //Employee Free Time
    //Partition Labels
    //Interval List Intersections

    // Time Complexity : O(N * LogN)
    // Space Complexity : O(N)

    public int[][] merge(int[][] intervals){
        if (intervals == null || intervals.length <= 1)
            return intervals;

        // Sort in ascending order
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> result = new ArrayList<>();
        int[] newInterval = intervals[0];
        result.add(newInterval);

        for (int[] interval : intervals) {
            if (interval[0] <= newInterval[1])
                newInterval[1] = Math.max(newInterval[1], interval[1]);
            else {
                newInterval = interval; // to save the previous element
                result.add(newInterval);
            }
        }
        return result.toArray(new int[result.size()][]);
    }



}
