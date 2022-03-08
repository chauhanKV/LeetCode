package leetcode.DataStructuresArrays;

public class SubSetOfArray {
    public void printSubsetOfArray(int[] arr)
    {
        int limit = (int)Math.pow(2, arr.length);
        for(int i = 0 ; i < limit; i++)
        {
            int temp = i;
            String set = "";
            for(int j = arr.length - 1; j >= 0; j--)
            {
                int remainder = temp % 2;
                temp = temp / 2;

                if(remainder == 0)
                {
                    set = "-" + "\t" + set;
                }
                else
                {
                    set = arr[j] + "\t" + set;
                }
            }
            System.out.println(set);
        }
    }
}
