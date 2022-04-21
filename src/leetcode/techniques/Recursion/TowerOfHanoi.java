package leetcode.techniques.Recursion;

public class TowerOfHanoi {

    public void printTowerOfHanoiSolution(int numberOfDisks, int tower1, int tower2, int tower3) {
        if (numberOfDisks == 0) {
            return;
        }

        printTowerOfHanoiSolution(numberOfDisks - 1, tower1, tower3, tower2);
        System.out.println(numberOfDisks + " [ " + tower1 + " -> " + tower2 + " ] ");
        printTowerOfHanoiSolution(numberOfDisks - 1, tower3, tower2, tower1);
    }
}
