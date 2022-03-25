package leetcode.DataStructuresStrings;

public class GoalParser {

    // Runtime: 1 ms, faster than 84.71% of Java online submissions for Goal Parser Interpretation.
    //Memory Usage: 42.5 MB, less than 18.92% of Java online submissions for Goal Parser Interpretation.
    //Next challenges:
    //Bold Words in String
    //Minimum Swaps to Make Strings Equal
    //Check If a Word Occurs As a Prefix of Any Word in a Sentence

    // public String interpret(String command) {
    //     return command.replace("()","o").replace("(al)", "al");
    // }

    // Time Complexity : O(N)
    // Space Complexity : O(N)
    public String interpret(String command) {

        int i = 0;
        StringBuilder str = new StringBuilder();

        while(i < command.length())
        {
            if(command.charAt(i) == 'G')
            {
                str.append(command.charAt(i));
            }
            else if(i + 1 < command.length() && command.charAt(i+1) == ')')
            {
                str.append("o");
                i++;
            }
            else
            {
                str.append("al");
                i = i+3;
            }
            i++;
        }
        return str.toString();
    }
}
