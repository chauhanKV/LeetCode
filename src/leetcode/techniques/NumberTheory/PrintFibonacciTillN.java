package leetcode.techniques.NumberTheory;

public class PrintFibonacciTillN {
    public void Printfib(int n) {

        for (int i = 0; i < 2; i++) {
            System.out.println(i);
        }

        int temp = 0, a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            temp = a + b;
            System.out.println(temp);
            a = b;
            b = temp;
        }
    }
}
