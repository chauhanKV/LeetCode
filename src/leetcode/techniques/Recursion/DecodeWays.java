package leetcode.techniques.Recursion;

public class DecodeWays {

    // Gives wrong answer, come back with optimized and correct solution.
//    public int numDecodings(String s) {
//        return numDecodingsValue(s);
//    }

    // Wrong answer

//    public int numDecodingsValue(String unprocessed) {
//        // handle 0
//        if (unprocessed.length() == 0) {
//            return 0;
//        }
//        // handle 1
//        else if (unprocessed.length() == 1) {
//            char ch = unprocessed.charAt(0);
//            return ch == '0' ? 0 : 1;
//        }
//        // handle 2 characters
//        else {
//            int count = 0;
//            char ch = unprocessed.charAt(0);
//            String restUnprocessed = unprocessed.substring(1);
//
//            if (ch == '0') {
//                count += numDecodingsValue(restUnprocessed);
//            } else {
//                count += numDecodingsValue(restUnprocessed);
//            }
//
//            String ch12 = unprocessed.substring(0, 2);
//            String restUnprocessed12 = unprocessed.substring(2);
//
//            int ch12Value = Integer.parseInt(ch12);
//
//            if (ch12Value <= 26) {
//                count += numDecodingsValue(restUnprocessed);
//            }
//
//            return count;
//        }
//    }


    // Correct Answer but gives TLE on leetcode. Find optimized version

    public int numDecodings(String s) {
        return numDecodingsValue(s);
    }

    public int numDecodingsValue(String unprocessed) {
        // handle 0
        if (unprocessed.length() == 0) {
            return 1;
        }
        // handle 1
        else if (unprocessed.length() == 1) {
            char ch = unprocessed.charAt(0);
            return ch == '0' ? 0 : 1;
        }
        // handle 2 characters
        else {
            int count = 0;
            char ch = unprocessed.charAt(0);
            String restUnprocessed = unprocessed.substring(1);

            if (ch == '0') {
                return 0;
            } else {
                count += numDecodingsValue(restUnprocessed);
            }

            String ch12 = unprocessed.substring(0, 2);
            String restUnprocessed12 = unprocessed.substring(2);

            int ch12Value = Integer.parseInt(ch12);

            if (ch12Value <= 26) {
                count += numDecodingsValue(restUnprocessed12);
            }

            return count;
        }
    }
}
