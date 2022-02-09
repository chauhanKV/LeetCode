package leetcode.techniques.NumberTheory;

public class BulbSwitcher {
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Bulb Switcher.
    //Memory Usage: 40.8 MB, less than 8.57% of Java online submissions for Bulb Switcher.
    //Next challenges:
    //Bulb Switcher II
    //Minimum Number of K Consecutive Bit Flips
    //Number of Times Binary String Is Prefix-Aligned

    // Time Complexity : ? (Need to understand how to calculate)
    // Space Complexity : O(1)
    public int bulbSwitch(int n) {
        int count = 0;
        for(int i = 1; i * i <= n; i++)
        {
            count++;
        }

        return count;
    }
}
