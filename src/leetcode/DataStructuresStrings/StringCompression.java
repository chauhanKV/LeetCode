package leetcode.DataStructuresStrings;

public class StringCompression {

    public String compression1(String str){
        if(str.length() == 0) return null;

        char s = str.charAt(0);
        StringBuilder builder = new StringBuilder();
        int i = 0;
        for(i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) != s)
            {
                builder.append(s);
                s = str.charAt(i);
            }
        }

        if(i == str.length())
        {
            builder.append(str.charAt(i - 1));
        }

        return builder.toString();
    }

    public String compression2(String str){
        if(str.length() == 0) return null;

        int left = 0, right = 0, distance = 0;
        char s = str.charAt(left);
        StringBuilder builder = new StringBuilder();

        while(left < str.length() && right < str.length())
        {
            if(str.charAt(right) != s)
            {
                builder.append(s);
                distance = right - left;
                if(distance > 1)
                {
                    builder.append(distance);
                }

                s = str.charAt(right);
                left = right;
            }
            right++;
        }

        if(right == str.length())
        {
            distance = right - left;
            builder.append(str.charAt(right - 1));
            if(distance > 1)
            {
                builder.append(distance);
            }
        }

        return builder.toString();
    }
}
