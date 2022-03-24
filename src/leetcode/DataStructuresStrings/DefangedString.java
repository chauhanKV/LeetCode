package leetcode.DataStructuresStrings;

public class DefangedString {

    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Defanging an IP Address.
    //Memory Usage: 40.1 MB, less than 83.46% of Java online submissions for Defanging an IP Address.
    //Next challenges:
    //Dota2 Senate
    //Minimum Deletions to Make String Balanced
    //Adding Spaces to a String

    // Time Complexity : O(N)
    // Space Complexity : O(N)

    public String defangIPaddr(String address) {
        StringBuilder str = new StringBuilder();

        for(int i = 0 ; i < address.length(); i++)
        {
            if(address.charAt(i) == '.')
            {
                str.append("[");
                str.append(address.charAt(i));
                str.append("]");
            }
            else
            {
                str.append(address.charAt(i));
            }
        }
        return str.toString();
    }
}
