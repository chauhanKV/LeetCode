package leetcode.techniques.NumberTheory;

public class RotateANumber {
    public int rotateNumber(int n, int k) {
        int originalNo = n;
        int nod = getNoOfDigits(originalNo);

        // Need to understand this.
        // To handle k bigger than nod.
        k = k % nod;

        // for negative k
        // This one is brilliant logic to work with negative rotations
        if(k < 0)
        {
            k = nod + k;
        }

        int digit = n % (int)Math.pow(10, k);
        n = n / (int)Math.pow(10, k);
        int updatedNo = n;
        nod = getNoOfDigits(updatedNo);
        int additionValue = digit * (int)Math.pow(10, nod);
        int updatedValue = additionValue + n;

        return updatedValue;
    }

    private int getNoOfDigits(int temp)
    {
        int digits = 0;
        while(temp != 0)
        {
            temp = temp / 10;
            digits++;
        }
        return digits;
    }
}
