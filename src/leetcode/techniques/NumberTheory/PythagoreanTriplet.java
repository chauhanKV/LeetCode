package leetcode.techniques.NumberTheory;

public class PythagoreanTriplet {
    public boolean isPythagoreanTriplet(int a, int b, int c)
    {
        int max = a;
        if(max < b)
        {
            max = b;
        }
        if(max < c)
        {
            max = c;
        }

        if(max == a)
        {
            return (b * b) + (c * c) == (a * a) ? true : false;
        }
        else if(max == b)
        {
            return (a * a) + (c * c) == (b * b) ? true : false;
        }
        else
        {
            return (a * a) + (b * b) == (c * c) ? true : false;
        }

    }
}
