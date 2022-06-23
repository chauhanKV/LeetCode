package leetcode.DataStructuresStrings;

public class Main {
    public static void main(String[] args) {
        StringCompression compression = new StringCompression();
        System.out.println(compression.compression1("wwwwaaadexxxxxx"));
        System.out.println(compression.compression2("wwwwaaadexxxxxx"));

        ToggleCase toggle = new ToggleCase();
        System.out.println("String after toggling to lowercase : " + toggle.toLowerCaseOptimized("HeLLo"));
        System.out.println("String after toggling : " + toggle.toggleCase("pepCODinG"));

        DifferenceOfTwoConsecutiveCharacter difference = new DifferenceOfTwoConsecutiveCharacter();
        String str = difference.differenceOfTwoConsecutiveCharacters("abcde");
        System.out.println("Difference between two consecutive string is : " + str);

        LongestPalindromicSubstring longest = new LongestPalindromicSubstring();
        String longPalindrome = longest.longestPalindrome("dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd");
        System.out.println("Longest Palindromic String : " + longPalindrome);

        DetermineIfStringHalvesAreEqual halvesAreEqual = new DetermineIfStringHalvesAreEqual();
        System.out.println("Determine if string halves are equal : " + halvesAreEqual.halvesAreAlike("textbook"));

        DecryptString decryptString = new DecryptString();
        System.out.println("String after decryption : " + decryptString.freqAlphabets("10#20#12"));

        ReversePrefixOfWord prefixOfWord = new ReversePrefixOfWord();
        System.out.println("Reversed Prefix of a word : " + prefixOfWord.reversePrefix("abcdefd", 'd'));

        LongPressedName pressedName = new LongPressedName();
        System.out.println("Is name correctly typed ? : " + pressedName.isLongPressedName("alex", "aaleex"));

        MergeStringAlternately alternately = new MergeStringAlternately();
        System.out.println("String after merging alternately looks like : " + alternately.mergeAlternately("abc", "pqrstw"));

        NumberOfMatchingSubsequences matchingSubsequences = new NumberOfMatchingSubsequences();
        System.out.println("Number of matching Subsequences are : " + matchingSubsequences.numMatchingSubseq("abcde", new String[]{"a", "bb", "acd", "ace"}));

        AddingSpacesToAString spaces = new AddingSpacesToAString();
        System.out.println("String after adding spaces is : " + spaces.addSpaces("LeetcodeHelpsMeLearn", new int[]{8, 13, 15}));

        LongestCommonPrefix prefix = new LongestCommonPrefix();
        System.out.println("Longest Common Prefix : " + prefix.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));

    }

}
