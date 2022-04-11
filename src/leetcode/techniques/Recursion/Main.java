package leetcode.techniques.Recursion;

public class Main {
    public static void main(String[] args) {
        BinarySearchWithRecursion recursionSearch = new BinarySearchWithRecursion();
        System.out.println("Result after binary search using recursion is : " + recursionSearch.search(new int[] {-1,0,3,5,9,12}, 2));

        PowerLinear pow = new PowerLinear();
        System.out.println("Power with normal recursion approach : " + pow.power(2, 9));

        PowerLogarithmic powLog = new PowerLogarithmic();
        System.out.println("Power with logarithmic recursion approach : " + powLog.powerAnotherLogic(3, 6));

        PositiveNegativePower negPosPow = new PositiveNegativePower();
        System.out.println(negPosPow.myPow(8, -3));

        ZigZag zig = new ZigZag();
        zig.printZigZag(3);

        NumberOfStepsToReduce reduce = new NumberOfStepsToReduce();
        System.out.println("Number of steps to reduce to 0 : " +  reduce.numberOfSteps(14));

        PowerOfTwo two = new PowerOfTwo();
        System.out.println("is number power of 2 ? : " + two.isPowerOfTwo(16));

        TowerOfHanoi tower = new TowerOfHanoi();
        tower.printTowerOfHanoiSolution(3, 11, 12, 13);

        MaxOfArray max = new MaxOfArray();
        int maxValue = max.maxOfArray(new int[] {22,33,4,5,78,9}, 0);
        System.out.println("Max of an array is : " + maxValue);
    }
}
