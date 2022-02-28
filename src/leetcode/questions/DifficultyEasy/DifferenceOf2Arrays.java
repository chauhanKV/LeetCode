package leetcode.questions.DifficultyEasy;

public class DifferenceOf2Arrays {
    public int[] differenceOfArrays(int[] arr1, int[] arr2) {
        int[] difference = new int[arr2.length];

        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = difference.length - 1;
        int burrow = 0;

        while(k >= 0)
        {
            int diff = 0;
            int arr1Value = (i >= 0) ? arr1[i] : 0;

            if(arr2[j] + burrow >= arr1Value)
            {
                diff = arr2[j] + burrow - arr1Value;
                burrow = 0;
            }
            else
            {
                diff = arr2[j] + burrow + 10 - arr1Value;
                burrow = -1;
            }

            difference[k] = diff;


            i--;
            j--;
            k--;
        }

        return difference;
    }
}
