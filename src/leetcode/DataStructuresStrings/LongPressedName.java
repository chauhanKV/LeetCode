package leetcode.DataStructuresStrings;

import java.util.Arrays;

public class LongPressedName {
    // Does not work for below test case :
    // name : 'rick' , typed : 'kric' , when alphabets are interchanged.

    // Work on optimized solution for this which runs for all test cases.
    public boolean isLongPressedName(String name, String typed) {
        int[] namedChars = new int[26];
        int[] typedChars = new int[26];

        for (int i = 0; i < name.length(); i++) {
            namedChars[name.charAt(i) - 'a']++;
        }

        for (int i = 0; i < typed.length(); i++) {
            typedChars[typed.charAt(i) - 'a']++;
        }

        System.out.println(Arrays.toString(namedChars));
        System.out.println(Arrays.toString(typedChars));

        for (int i = 0; i < name.length(); i++) {
            if (typedChars[name.charAt(i) - 'a'] < namedChars[name.charAt(i) - 'a'])
                return false;
        }

        return true;

    }
}
