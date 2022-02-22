package leetcode.Learnings;

public class BarChart {
    public void printBarChartFromArray(int[] arr)
    {
        int max = 0;
        for(int i = 0 ; i < arr.length; i++)
        {
            if(max < arr[i])
            {
                max = arr[i];
            }
        }

        for(int floor = max ; floor >= 1 ; floor--)
        {
            for(int i = 0; i < arr.length; i++)
            {
                if(arr[i] >= floor)
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
