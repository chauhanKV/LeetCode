package leetcode.techniques.MergeIntervals;

import java.util.Arrays;

public class ConflictingAppointments {
    public boolean AreAppointmentsConflicting(int[][] appointments)
    {
        Arrays.sort(appointments, (a,b) -> Integer.compare(a[0], b[0]));
        for(int i = 1; i < appointments.length; i++)
        {
            if(appointments[i-1][1] > appointments[i][0]) {
                return true;
            }
        }
        return false;
    }
}
