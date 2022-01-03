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

        ConflictingAppointments appointments = new ConflictingAppointments();
        boolean isConflict = appointments.AreAppointmentsConflicting(new int[][] {{6,8}, {2,7}, {8,9}});
        System.out.println("Are appointments conflicting ? " + isConflict);

        MaxNoOfAppointmentsAttended maxEvents = new MaxNoOfAppointmentsAttended();
        int maxEventsAttended = maxEvents.maxEvents(new int[][] {{1,2}, {2,3}, {3,4}});
        System.out.println("Max event that can be attended are : " + maxEventsAttended);
    }
}
