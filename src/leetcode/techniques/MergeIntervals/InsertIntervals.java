package leetcode.techniques.MergeIntervals;

public class InsertIntervals {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        if(intervals.length <= 0) return intervals;
        if(newInterval.length <= 0) return intervals;

        for(int i = 0; i < intervals.length; i++)
        {
            if(intervals[i][1] > newInterval[0])
            {
                intervals[i][1] = Math.max(intervals[i][1], newInterval[1]);
            }
        }

        return intervals;
    }
}
