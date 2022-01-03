package leetcode.techniques.MergeIntervals;

import java.util.Arrays;

public class MaxNoOfAppointmentsAttended {
    public int maxEvents(int[][] events) {
        if(events.length <= 0) return 0;
        int maxEvents = 0;
        int noOfConflicts = 0;
        Arrays.sort(events, (a, b) -> Integer.compare(a[0], b[0]));
        for(int i = 1; i < events.length; i++)
        {
            if(events[i-1][1] > events[i][0]) {
                noOfConflicts++;
            }
            else
            {
                maxEvents++;
            }
        }
        return noOfConflicts > 0 ? maxEvents + noOfConflicts : maxEvents + 1;
    }
}
