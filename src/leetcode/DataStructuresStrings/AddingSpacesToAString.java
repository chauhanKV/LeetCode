package leetcode.DataStructuresStrings;

public class AddingSpacesToAString {

    //Runtime: 34 ms, faster than 63.76% of Java online submissions for Adding Spaces to a String.
    //Memory Usage: 90.9 MB, less than 62.64% of Java online submissions for Adding Spaces to a String.
    //Next challenges:
    //Shortest Completing Word
    //Number of Submatrices That Sum to Target
    //Counting Words With a Given Prefix

    // Not a good solution. Optimize this.
    public String addSpaces(String s, int[] spaces) {
        StringBuilder str = new StringBuilder();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (count < spaces.length && i == spaces[count]) {
                str.append(" ");
                count += 1;
            }
            str.append(s.charAt(i));
        }

        return str.toString();
    }
}
