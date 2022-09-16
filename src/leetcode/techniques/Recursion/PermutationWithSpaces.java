package leetcode.techniques.Recursion;

public class PermutationWithSpaces {
    public void permutationWithSpaces(String input, String output) {
        permutationHelper(input.substring(1, input.length()), input.charAt(0) + "");
    }
    public void permutationHelper(String input, String output) {
        // Base condition
        if(input.length() == 0)
        {
            System.out.println(output);
            return;
        }

        String output1 = output;
        String output2 = output;

        output1 += " " + input.charAt(0) + "";
        output2 += input.charAt(0) + "";

        input = input.substring(1, input.length());

        permutationHelper(input, output1);
        permutationHelper(input, output2);
        return;
    }
}
