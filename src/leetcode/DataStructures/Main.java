package leetcode.DataStructures;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        RotateAnArray rotate = new RotateAnArray();
        int[] rotatedArray = rotate.rotateArray(new int[] {1,2,3,4,5}, 3);
        System.out.println("Rotated Array : " + Arrays.toString(rotatedArray));

        InverseAnArray inverse = new InverseAnArray();
        int[] invertedArray = inverse.inverseArray(new int[] {3,2,1,4,0});
        System.out.println("Array after inversion : " + Arrays.toString(invertedArray));

        SubarraysOfAnArray subArrays = new SubarraysOfAnArray();
        subArrays.findSubArrays(new int[] {10, 20, 30, 40});

        SubSetOfArray subSet = new SubSetOfArray();
        subSet.printSubsetOfArray(new int[] {10, 20, 30});

        ShuffleTheArray shuffle = new ShuffleTheArray();
        int[] arr = shuffle.shuffle(new int[] {2,5,1,3,4,7}, 3);
        System.out.println("Shuffled array : " + Arrays.toString(arr));

        GreatestCandies candies = new GreatestCandies();
        List<Boolean> result = candies.kidsWithCandies(new int[] {2,3,5,1,3}, 3);
        System.out.println("Kids with greatest number of candies are : " + Arrays.toString(result.toArray()));

        BrokenEconomy broken = new BrokenEconomy();
        broken.findFloorCeil(new int[] {10,20,30,40,50,60,70,80,90,100}, 61);

        CheckPangram pangram = new CheckPangram();
        boolean pan = pangram.checkIfPangram("thequickbrownfoxjumpsoverthelazydog");
        System.out.println("Check if the string is Pangram : " + pan);

        ConcatenationOfArray concat = new ConcatenationOfArray();
        int[] arr1 = concat.getConcatenation(new int[] {1,2,1});
        System.out.println("Concatenated array : " + Arrays.toString(arr1));
    }
}
