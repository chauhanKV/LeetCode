package leetcode.techniques.NumberTheory;

public class DetermineColorOfaChessBoardSquare {

    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Determine Color of a Chessboard Square.
    //Memory Usage: 40.1 MB, less than 90.25% of Java online submissions for Determine Color of a Chessboard Square.
    //Next challenges:
    //Water and Jug Problem
    //Palindrome Partitioning III
    //Find Kth Bit in Nth Binary String

    // TC : O(1)
    // SC : O(1)
    public boolean squareIsWhite(String coordinates) {
        int row = coordinates.charAt(1), col = coordinates.charAt(0);

        if (row % 2 == 0 && col % 2 == 0) {
            return false;
        }

        return row % 2 == 0 || col % 2 == 0;
    }

    // TC : O(1)
    // SC : O(1)
    public boolean squareIsWhite1(String coordinates) {
        int row = coordinates.charAt(1), col = coordinates.charAt(0);
        return (row % 2 != 0 && col % 2 == 0) || (row % 2 == 0 && col % 2 != 0);
    }

    // TC : O(1)
    // SC : O(1)
    public boolean squareIsWhite2(String coordinates) {
        return (coordinates.charAt(0) + coordinates.charAt(1)) % 2 != 0;
    }
}
