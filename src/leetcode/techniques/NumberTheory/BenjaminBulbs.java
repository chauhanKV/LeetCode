package leetcode.techniques.NumberTheory;

public class BenjaminBulbs {

    // Brute Force
    // Time Complexity : O(N^2)
    // Space Complexity : O(N)
    public void findOnBenjaminBulbs(int n) {
        boolean[] arr = new boolean[n];
        for(int i = 1; i <= n; i++)
        {
            for(int j = i - 1; j < n; j = i + j)
            {
                arr[j] = !arr[j];
            }
        }

        for(int i = 0 ; i < arr.length - 1; i++)
        {
            if(arr[i])
            {
                System.out.print(i+1);
                System.out.println(" ");
            }
        }
    }


    // Optimized approach
    // Find all perfect squares
    public void findOnBenjaminBulbsOptimized(int n) {

        for(int i = 1; i * i <= n; i++)
        {
            System.out.print(i * i);
            System.out.print(" ");
        }

    }
}
