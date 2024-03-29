package leetcode.DataStructuresArrays;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        RotateAnArray rotate = new RotateAnArray();
        int[] rotatedArray = rotate.rotateArray(new int[]{1, 2, 3, 4, 5}, 3);
        System.out.println("Rotated Array : " + Arrays.toString(rotatedArray));

        InverseAnArray inverse = new InverseAnArray();
        int[] invertedArray = inverse.inverseArray(new int[]{3, 2, 1, 4, 0});
        System.out.println("Array after inversion : " + Arrays.toString(invertedArray));

        SubarraysOfAnArray subArrays = new SubarraysOfAnArray();
        subArrays.findSubArrays(new int[]{10, 20, 30, 40});

        SubSetOfArray subSet = new SubSetOfArray();
        subSet.printSubsetOfArray(new int[]{10, 20, 30});

        ShuffleTheArray shuffle = new ShuffleTheArray();
        int[] arr = shuffle.shuffle(new int[]{2, 5, 1, 3, 4, 7}, 3);
        System.out.println("Shuffled array : " + Arrays.toString(arr));

        GreatestCandies candies = new GreatestCandies();
        List<Boolean> result = candies.kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3);
        System.out.println("Kids with greatest number of candies are : " + Arrays.toString(result.toArray()));

        BrokenEconomy broken = new BrokenEconomy();
        broken.findFloorCeil(new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100}, 61);

        CheckPangram pangram = new CheckPangram();
        boolean pan = pangram.checkIfPangram("thequickbrownfoxjumpsoverthelazydog");
        System.out.println("Check if the string is Pangram : " + pan);

        ConcatenationOfArray concat = new ConcatenationOfArray();
        int[] arr1 = concat.getConcatenation(new int[]{1, 2, 1});
        System.out.println("Concatenated array : " + Arrays.toString(arr1));

        FirstLastPositionSortedArray array = new FirstLastPositionSortedArray();
        int[] arr2 = array.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8);
        System.out.println("First and last Position of target value in a sorted array is : " + arr2[0] + " " + arr2[1]);

//        MultiplicationOf2DArray multiply = new MultiplicationOf2DArray();
//        multiply.multiplyMatrix(new int[][]{{10, 0, 0}, {0, 20, 0}}, 2, 3, new int[][]{{1, 0, 1}, {0, 0, 1}, {1, 2, 1}, {1, 0, 0}}, 3, 4);
//
//        WaveTraversalOf2DArray wave = new WaveTraversalOf2DArray();
//        wave.waveTraversal(new int[][]{{11, 12, 13, 14}, {21, 22, 23, 24}, {31, 32, 33, 34}}, 3, 4);

        SpiralMatix2D spiral = new SpiralMatix2D();
        spiral.printSpiralMatixClockWise(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        spiral.printSpiralMatixAntiClockWise(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});

        ExitOf2DMatrix exit = new ExitOf2DMatrix();
        exit.printExitOf2DMatrix(new int[][]{{0, 0, 1, 0}, {1, 0, 0, 0}, {0, 0, 0, 0}, {1, 0, 1, 0}});

        TransposeMatrix transpose = new TransposeMatrix();
        int[][] resultTranspose = transpose.transpose(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        System.out.println("Matrix after transpose : " + Arrays.deepToString(resultTranspose));

        RotateImage img = new RotateImage();
        img.rotate(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});

        RingRotate2DArray ring = new RingRotate2DArray();
        int[][] ringArray = new int[][]{{11, 12, 13, 14, 15, 16, 17}, {21, 22, 23, 24, 25, 26, 27}, {31, 32, 33, 34, 35, 36, 37}, {41, 42, 43, 44, 45, 46, 47}, {51, 52, 53, 54, 55, 56, 57}};
        System.out.println("Before Ring Rotation : ");
        ring.display(ringArray);
        System.out.println("After Ring Rotation by 3 for 2nd ring : ");
        ring.ringRotateArray(ringArray, 2, 3);

        DiagonalTraversal2DEasy diagonal = new DiagonalTraversal2DEasy();
        System.out.println("Array after diagonal traversal : ");
        diagonal.traverseDiagonally(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {10, 11, 12, 13}, {14, 15, 16, 17}});
        System.out.println();

        SaddlePoint saddle = new SaddlePoint();
        List<Integer> saddleAns = saddle.findSaddlePoint(new int[][]{{1, 10, 4, 2}, {9, 3, 8, 7}, {15, 16, 17, 12}});
        System.out.println("Saddle Point / Lucky number in a matrix is : " + saddleAns);

        SearchIn2DMatrix search = new SearchIn2DMatrix();
        boolean found = search.searchMatrixWithReducedTC(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {10, 11, 12, 13}, {14, 15, 16, 17}}, 11);
        System.out.println("Is element available in 2D matrix - (Searched using spiral display method) : " + found);

        DetermineMatrixRotation rotation = new DetermineMatrixRotation();
        boolean similar = rotation.findRotation(new int[][]{{0, 0, 0}, {0, 1, 0}, {1, 1, 1}}, new int[][]{{1, 1, 1}, {0, 1, 0}, {0, 0, 0}});
        System.out.println("Is 2D matrix similar to given matrix after rotation ? :" + similar);

        RemovePrimeFromArrayList remove = new RemovePrimeFromArrayList();
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(3);
        arrList.add(12);
        arrList.add(13);
        arrList.add(15);
        ArrayList<Integer> primeRemoved = remove.removePrime(arrList);
        System.out.println("Array list after prime number removal : " + Arrays.toString(primeRemoved.toArray()));

        FindEvenNumberOfDigits digits = new FindEvenNumberOfDigits();
        System.out.println("Count of digits with even numbers : " + digits.findNumbers(new int[]{12, 345, 2, 6, 7896}));

        FlippingImage flipImg = new FlippingImage();
        System.out.println("Image after flipping looks like : " + Arrays.deepToString(flipImg.flipAndInvertImage(new int[][]{{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}})));

        MatrixDiagonalSum diagonalSum = new MatrixDiagonalSum();
        int sum = diagonalSum.diagonalSum(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {10, 11, 12, 13}, {14, 15, 16, 17}});
        System.out.println("Matrix Diagonal sum is : " + sum);

        AddToArrayFormOfInteger addArray = new AddToArrayFormOfInteger();
        System.out.println("After adding number to array : " + addArray.addToArrayForm(new int[]{2, 1, 3}, 816));

        ReshapeTheMatrix reshape = new ReshapeTheMatrix();
        int[][] reshapedMatrix = reshape.matrixReshape(new int[][]{{1, 2}, {3, 4}}, 4, 1);
        System.out.println("Matrix after reshaping : " + Arrays.deepToString(reshapedMatrix));

        PlusOne one = new PlusOne();
        int[] result1 = one.plusOne(new int[]{1, 2, 3, 4, 5});
        System.out.println("After Plus one : " + Arrays.toString(result1));

        SubSets subsets = new SubSets();
        subsets.printAllSubsets(new int[]{1, 2, 3});
        subsets.printSubsetsWithoutDuplicates(new int[]{1, 2, 2, 3, 4, 4, 5});

        ValidateRowColForAllNumbers validate = new ValidateRowColForAllNumbers();
        boolean isValid = validate.checkValid(new int[][]{{1,2,3},{3,1,2},{2,3,1}});
        System.out.println("Check if Every Row and Column Contains All Numbers : " + isValid);
    }
}
