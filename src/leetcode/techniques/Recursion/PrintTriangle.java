package leetcode.techniques.Recursion;

public class PrintTriangle {

    public void reverseTriangle(int row, int col)
    {
        // Base Condition
        if(row == 0 && col == 0)
        {
            return;
        }

        if(row > col)
        {
            System.out.print("* ");
            reverseTriangle(row, ++col);
        }
        else
        {
            System.out.println();
            reverseTriangle(--row, 0);
        }
    }

    // Normal Triangle using recursion - just change the place of print statement
    public void normalTriangle(int row, int col)
    {
        // Base Condition
        if(row == 0 && col == 0)
        {
            return;
        }

        if(row > col)
        {
            normalTriangle(row, ++col);
            System.out.print("* ");
        }
        else
        {
            normalTriangle(--row, 0);
            System.out.println();
        }
    }
}
