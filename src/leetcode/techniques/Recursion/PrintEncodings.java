package leetcode.techniques.Recursion;

public class PrintEncodings {

    public void printAllEncodings(String value)
    {
       print(value, "");
    }

    private void print(String unprocessed, String processed)
    {
        // handle 0
        if(unprocessed.length() == 0)
        {
            System.out.println(processed);
        }
        // handle 1
        else if(unprocessed.length() == 1)
        {
            char ch = unprocessed.charAt(0);
            if(ch == '0')
            {
                return;
            }
            else {
                int chValue = ch - '0';
                char code = (char)('a' + chValue - 1);
                System.out.println(processed + code);
            }
        }
        // handle double digit
        else {
            char ch = unprocessed.charAt(0);
            String restUnprocessed = unprocessed.substring(1);

            if(ch == '0')
            {
                return;
            }
            else {
                int chValue = ch - '0';
                char code = (char)('a' + chValue - 1);
                print(restUnprocessed, processed + code);
            }

            String ch12 = unprocessed.substring(0,2);
            String restUnprocessed12 = unprocessed.substring(2);

            int chValue12 = Integer.parseInt(ch12);

            if(chValue12 <= 26)
            {
                char code12 = (char)('a' + chValue12 - 1);
                print(restUnprocessed12, processed + code12);
            }
        }
    }
}
