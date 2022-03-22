package leetcode.DataStructuresArrays;

import java.util.ArrayList;

public class RemovePrimeFromArrayList {
    private boolean isPrime(int val) {
        for (int div = 2; div * div <= val; div++) {
            if (val % div == 0) {
                return false;
            }
        }
        return true;
    }

    public ArrayList<Integer> removePrime(ArrayList<Integer> al) {
        for (int i = al.size() - 1; i >= 0; i--) {
            int val = al.get(i);
            if (isPrime(val)) {
                al.remove(i);
            }
        }
        return al;
    }
}
