package leetcode.techniques.Recursion;

public class Main {
    public static void main(String[] args) {
        BinarySearchWithRecursion recursionSearch = new BinarySearchWithRecursion();
        System.out.println("Result after binary search using recursion is : " + recursionSearch.search(new int[] {-1,0,3,5,9,12}, 2));

        PowerLinear pow = new PowerLinear();
        System.out.println("Power function : " + pow.power(2, 9));
    }
}
