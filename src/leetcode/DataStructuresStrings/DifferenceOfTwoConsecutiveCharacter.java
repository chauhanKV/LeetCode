package leetcode.DataStructuresStrings;

public class DifferenceOfTwoConsecutiveCharacter {
    public String differenceOfTwoConsecutiveCharacters(String str){

        StringBuilder builder = new StringBuilder();

        for(int i = 1 ; i < str.length(); i++)
        {
            char firstCharacter = str.charAt(i);
            char secondCharacter = str.charAt(i-1);
            int distance = firstCharacter - secondCharacter;
            builder.append(secondCharacter);
            builder.append(distance);
        }
        builder.append(str.charAt(str.length() - 1));

        return builder.toString();
    }
}
