package leetcode.CTCI;

public class Main {

    public static void main(String[] args)
    {
        IsUnique isUnique = new IsUnique();
        System.out.println("Is unique character ? : " + isUnique.isUnique("character"));

        PermutationInString permutationInString = new PermutationInString();
        boolean inclusion = permutationInString.checkInclusion("ab", "abcd");
        System.out.println("Is there a permutation in string ? : " + inclusion);
    }
}
