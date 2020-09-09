package leetcode.techniques.SlidingWindow;

public class GrumpyBookStore {
    public int maxSatisfied(int[] customers, int[] grumpy, int X) {

        if(X > customers.length) return 0;

        if(customers.length != grumpy.length) return 0;

        int satisfiedCustomers = 0;
        int unsatisfiedCustomers = Integer.MIN_VALUE;
        int currentRunningSumOfUnsatisfiedCustomers = 0;

        for(int i = 0 ; i < grumpy.length; i++)
        {
            if(grumpy[i] == 0) satisfiedCustomers += customers[i];
            else currentRunningSumOfUnsatisfiedCustomers += customers[i];

            if(i >= X)
            {
                currentRunningSumOfUnsatisfiedCustomers -= grumpy[i - X] * customers[i - X];
            }

            unsatisfiedCustomers = Math.max(unsatisfiedCustomers, currentRunningSumOfUnsatisfiedCustomers);

        }

        return satisfiedCustomers + unsatisfiedCustomers;
    }
}
