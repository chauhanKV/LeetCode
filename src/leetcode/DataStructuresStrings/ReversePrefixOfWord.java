package leetcode.DataStructuresStrings;

public class ReversePrefixOfWord {

    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Reverse Prefix of Word.
    //Memory Usage: 40.6 MB, less than 85.32% of Java online submissions for Reverse Prefix of Word.
    //Next challenges:
    //License Key Formatting
    //Uncommon Words from Two Sentences
    //Longest Palindrome by Concatenating Two Letter Words


    // TC : O(M) => M is the length of string till the first occurence of ch is found
    // SC : O(N) => StringBuilder storing entire given string.
    public String reversePrefix(String word, char ch) {
        int left = 0, right = 0;

        for(int i = 0 ; i < word.length(); i++)
        {
            if(word.charAt(i) == ch)
            {
                right = i;
                break;
            }
        }

        StringBuilder reversedString = new StringBuilder(word);

        while(left < right)
        {
            char rightChar = word.charAt(right);
            char leftChar = word.charAt(left);
            reversedString.setCharAt(right, leftChar);
            reversedString.setCharAt(left, rightChar);
            left++;
            right--;
        }

        return reversedString.toString();
    }
}
