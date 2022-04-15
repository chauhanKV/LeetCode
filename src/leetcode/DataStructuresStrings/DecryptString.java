package leetcode.DataStructuresStrings;

import java.util.HashMap;

public class DecryptString {

    // Does not work for all test cases - OPTIMIZE this solution
    public String freqAlphabets(String s) {
        HashMap<String, String> pairs = new HashMap<>();
        pairs.put("1","a");
        pairs.put("2","b");
        pairs.put("3","c");
        pairs.put("4","d");
        pairs.put("5","e");
        pairs.put("6","f");
        pairs.put("7","g");
        pairs.put("8","h");
        pairs.put("9","i");
        pairs.put("10#","j");
        pairs.put("11#","k");
        pairs.put("12#","l");
        pairs.put("13#","m");
        pairs.put("14#","n");
        pairs.put("15#","o");
        pairs.put("16#","p");
        pairs.put("17#","q");
        pairs.put("18#","r");
        pairs.put("19#","s");
        pairs.put("20#","t");
        pairs.put("21#","u");
        pairs.put("22#","v");
        pairs.put("23#","w");
        pairs.put("24#","x");
        pairs.put("25#","y");
        pairs.put("26#","z");

        int left = 0, right = 0, k = 2;
        StringBuilder builder = new StringBuilder();

        while(k < s.length() && left < s.length() && right < s.length())
        {
            while(right < k)
            {
                right += 1;
            }

            if(s.charAt(right) == '#')
            {
                String newString = s.substring(left, k+1);
                builder.append(pairs.get(newString));
                left = right + 1;
                right += 1;
                k += 3;
            }
            else
            {
                builder.append(pairs.get(s.charAt(left)));
                builder.append(pairs.get(s.charAt(right - 1)));
                left = right;
                k += 2;
            }
        }

        if(left < s.length() && right < s.length())
        {
            builder.append(pairs.get(s.charAt(left)+""));
            builder.append(pairs.get(s.charAt(right + 1)+""));
        }

        return builder.toString();
    }
}
