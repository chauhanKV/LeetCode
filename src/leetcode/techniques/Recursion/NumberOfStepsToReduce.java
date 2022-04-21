package leetcode.techniques.Recursion;

public class NumberOfStepsToReduce {

    // Runtime: 1 ms, faster than 58.63% of Java online submissions for Number of Steps to Reduce a Number to Zero.
    //Memory Usage: 41.2 MB, less than 38.87% of Java online submissions for Number of Steps to Reduce a Number to Zero.
    //Next challenges:
    //Minimum Moves to Reach Target Score
    //Count Operations to Obtain Zero

    // Need to verify TC & SC
    // Time Complexity : O(length of the recursion tree)
    // Space Complexity : O(length of the recrusion tree)
    public int numberOfSteps(int num) {
        return noOfSteps(num, 1);
    }

    private int noOfSteps(int num , int counter) {
        if (num == 0) {
            return num;
        }

        if (num % 2 == 0) {
            counter += noOfSteps(num / 2, counter);
        } else {
            counter += noOfSteps(num - 1, counter);
        }

        return counter;
    }
}
