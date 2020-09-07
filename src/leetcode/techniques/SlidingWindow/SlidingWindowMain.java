package leetcode.techniques.SlidingWindow;

public class SlidingWindowMain {
    public static void main(String[] args) {

        MaximumNoOfVowels maximumNoOfVowels = new MaximumNoOfVowels();

        var maxVowels = maximumNoOfVowels.maxVowels("abciiidef", 3);
        System.out.println("Max vowels in size K is : "+ maxVowels);

        MaximumPointsFromCards maximumPointsFromCards = new MaximumPointsFromCards();
        var maxScore = maximumPointsFromCards.maxScore(new int[] {1,2,3,4,5,6,1}, 3);
        System.out.println("Max score from Cards is : "+ maxScore);

        PermutationInString permutationInString = new PermutationInString();
        var exists = permutationInString.checkInclusion("ab", "eidbaooo");
        System.out.println("Permutation in string : " + exists);
    }
}
