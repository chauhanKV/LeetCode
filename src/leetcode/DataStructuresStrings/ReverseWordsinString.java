package leetcode.DataStructuresStrings;

public class ReverseWordsinString {
    // Brute Force : Not Optimized
    public String reverseWords(String s) {
        StringBuilder str = new StringBuilder();
        String[] stringArr = s.split(" ");


        for(int i = 0 ; i < stringArr.length; i++)
        {
            for(int j = stringArr[i].length() - 1; j >= 0; j--)
            {
                str.append(stringArr[i].charAt(j));
            }

            if(i < stringArr.length - 1)
            {
                str.append(" ");
            }
        }

        return str.toString();
    }
}
