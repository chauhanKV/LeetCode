package leetcode.HashMap;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        NumberSmallThanCurrent smaller = new NumberSmallThanCurrent();
        System.out.println(Arrays.toString(smaller.smallerNumbersThanCurrent(new int[] {8,0,2,2,4})));
    }
}
