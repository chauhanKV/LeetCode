package leetcode.techniques.Recursion;

public class SubsetInputOutPutMethod {
    public void printAllSubsets(String input, String output)
    {
        solve(input, output);
    }

    public void solve(String input, String output)
    {
        // base condition
        if(input.length() == 0)
        {
            System.out.println(output);
            return;
        }

        String output1 = output;
        String output2 = output + input.charAt(0) + "";

        input = input.substring(1,input.length());

        solve(input, output1);
        solve(input, output2);
        return;
    }
}
