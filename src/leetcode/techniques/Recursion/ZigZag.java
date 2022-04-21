package leetcode.techniques.Recursion;

public class ZigZag {
    public void printZigZag(int n) {
        if (n == 0) {
            return;
        }

        System.out.println(n);
        printZigZag(n - 1);
        System.out.println(n);
        printZigZag(n - 1);
        System.out.println(n);
    }
}
