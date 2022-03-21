package leetcode.DataStructuresStrings;

public class ToggleCase {

    //Runtime: 0 ms, faster than 100.00% of Java online submissions for To Lower Case.
    //Memory Usage: 42.5 MB, less than 18.32% of Java online submissions for To Lower Case.
    //Next challenges:
    //Capitalize the Title

    // Time Complexity : O(N)
    // Space Complexity : O(N)
    public String toLowerCase(String s) {

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                builder.append((char) (ch - 'A' + 'a') + "");
            } else {
                builder.append(ch);
            }
        }

        return builder.toString();
    }


    public String toLowerCaseOptimized(String s) {

        char[] newChar = s.toCharArray();

        for (int i = 0; i < newChar.length; i++) {
            if (newChar[i] >= 'A' && newChar[i] <= 'Z') {
                newChar[i] = (char) (newChar[i] - 'A' + 'a');
            }
        }

        return new String(newChar);
    }

    public String toggleCase(String str){
        StringBuilder ans = new StringBuilder();
        for(int i = 0 ; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                ans.append((char)(ch - 'a' + 'A') + "");
            }else{
                ans.append((char)(ch - 'A' +'a') + "");
            }
        }
        return ans.toString();
    }
}
