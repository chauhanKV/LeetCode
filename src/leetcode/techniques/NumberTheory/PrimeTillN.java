package leetcode.techniques.NumberTheory;

public class PrimeTillN {
        public void printPrimeTillN(int low, int high)
        {
            for(int i = low; i <= high ; i ++)
            {
                int count = 0;
                for(int div = 2; div * div <= high; div++)
                {
                    if(i % div == 0)
                    {
                        count++;
                        break;
                    }
                }
                if(count == 0)
                {
                    System.out.println(i + " is a Prime Number");
                }
            }
        }
}
