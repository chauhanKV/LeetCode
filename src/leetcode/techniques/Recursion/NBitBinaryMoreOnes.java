package leetcode.techniques.Recursion;

import java.util.ArrayList;
import java.util.List;

public class NBitBinaryMoreOnes {
    public List<String> printBinaryMoreOnes(int n)
    {
        List<String> binaryNumbers = new ArrayList<>();
        printBinaryMoreOnesHelper(0, 0, n, "", binaryNumbers);
        return binaryNumbers;
    }

    private void printBinaryMoreOnesHelper(int ones, int zeros, int n, String output, List<String> binaryNumbers) {
        // base condition
        if(n == 0)
        {
            binaryNumbers.add(output);
            return;
        }

        if(ones == zeros)
        {
            String output1 = output;
            output1 += "1";
            printBinaryMoreOnesHelper(ones + 1, zeros, n - 1, output1, binaryNumbers);
        }

        if(ones > zeros)
        {
            String output2 = output;
            output2 += "0";
            printBinaryMoreOnesHelper(ones, zeros + 1, n - 1, output2, binaryNumbers);
        }

        return;
    }
}
