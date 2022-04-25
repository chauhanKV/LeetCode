package leetcode.techniques.Recursion;

public class CountOperationsToZero {

    //Runtime: 9 ms, faster than 14.70% of Java online submissions for Count Operations to Obtain Zero.
    //Memory Usage: 44.5 MB, less than 13.69% of Java online submissions for Count Operations to Obtain Zero.
    //Next challenges:
    //Get Maximum in Generated Array
    //Concatenation of Consecutive Binary Numbers
    //Cyclically Rotating a Grid

    // Space Complexity : O(M) = M is the number of operations took to reduce it to zero
    // Time Complexity : O(M) = M is the number of steps took to reduce it to zero
    public int countOperations(int num1, int num2) {
        return counter(num1, num2, 0);
    }

    private int counter(int num1, int num2, int count) {
        if (num1 == 0 || num2 == 0) {
            return count;
        }

        if (num1 > num2) {
            num1 = num1 - num2;
            return counter(num1, num2, ++count);
        } else {
            num2 = num2 - num1;
            return counter(num1, num2, ++count);
        }
    }
}
