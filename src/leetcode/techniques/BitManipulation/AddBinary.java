package leetcode.techniques.BitManipulation;

public class AddBinary {

    //Runtime: 3 ms, faster than 59.84% of Java online submissions for Add Binary.
    //Memory Usage: 39.5 MB, less than 32.10% of Java online submissions for Add Binary.
    //Next challenges:
    //Add Two Numbers
    //Multiply Strings
    //Plus One
    //Add to Array-Form of Integer

    // Time Complexity : O(A.length() + B.length())
    // Space Complexity : O(result.length())
    public String addBinary(String a, String b) {
        int i = a.length() - 1, j = b.length() - 1;
        int carry = 0;
        StringBuilder result = new StringBuilder();

        while(i >= 0 || j >= 0)
        {
            int sum = carry;
            if(i >= 0) sum = sum + a.charAt(i--) - '0'; // To convert string '0' / '1' to integer 0 / 1
            if(j >= 0) sum = sum + b.charAt(j--) - '0';
            carry = sum > 1 ? 1 : 0;  // carry will be 1 when sum > 1 , in other cases when sum is 0/1 , there is no carry
            result.append(sum%2); // to get the binary representation of the number
        }
        if(carry == 1)
        {
            result.append(carry);
        }

        return result.reverse().toString();
    }
}
