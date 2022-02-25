package leetcode.questions.DifficultyEasy;

public class DifferenceOf2Arrays {
    public int[] differenceOfArrays(int[] arr1, int[] arr2) {
        int[] sum = new int[arr1.length > arr2.length ? arr1.length : arr2.length];

        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = sum.length - 1;
        int burrow = 0;

        while(k >= 0)
        {
            int digit = burrow;

            if(i >= 0)
            {
                digit -= arr1[i];
            }

            if(j >= 0)
            {
                digit -= arr2[j];
            }

            burrow = digit / 10;
            sum[k] = digit % 10;

            i--;
            j--;
            k--;
        }

        if(burrow != 0)
        {
            sum[k] =  burrow;
        }

        return sum;
    }
}
