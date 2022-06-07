package leetcode.techniques.Recursion;

public class SquareRoot {
    public double findSquareRootUsingNewtonRaphson(int number)
    {
        return findSquareRoot(0.00001, number, 999999999, number);
    }
    private double findSquareRoot(double error, double guess, double diff, int num)
    {
        // base condition
        if(diff < error)
        {
            return guess;
        }

        // Newton Raphson formula
        double newGuess = guess - (((guess * guess) - num) / (2 * guess));

        diff = newGuess - guess;
        if(diff < 0)
        {
            diff *= -1;
        }

        return findSquareRoot(error, newGuess, diff, num);
    }
}
