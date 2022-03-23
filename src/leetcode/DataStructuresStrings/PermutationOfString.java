package leetcode.DataStructuresStrings;

public class PermutationOfString {

    // Tricky logic : (Revise)
    // Time Complexity :
    // Space Complexity : O(N) - Verify this by understanding recursion tree
    public void printAllPermutationOfString(String str)
    {
        // Step 1 : Factorial
        int combinations = factorial(str.length());
        // Step 2 : print permutations
        for(int i = 0 ; i < combinations; i++)
        {
            int dividend = i;
            StringBuilder builder = new StringBuilder(str);

            for(int divisor = str.length(); divisor >= 1; divisor--)
            {
                int remainder = dividend % divisor;
                int quotient = dividend / divisor;
                System.out.print(builder.charAt(remainder));
                dividend = quotient;
                builder.deleteCharAt(remainder);
            }
            System.out.println();
        }
    }

    public static int factorial(int number)
    {
        int val = 1;
        for(int i = 2 ; i <= number; i++)
        {
            val *= i;
        }
        return val;
    }
}
