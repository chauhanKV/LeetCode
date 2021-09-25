package leetcode.techniques.SlidingWindow;
import java.util.*;

public class FruitsIntoBasket {
    //Runtime: 115 ms, faster than 10.35% of Java online submissions for Fruit Into Baskets.
    //Memory Usage: 116.4 MB, less than 6.75% of Java online submissions for Fruit Into Baskets.
    //Next challenges:
    //Longest Uncommon Subsequence II
    //Previous Permutation With One Swap
    //Can You Eat Your Favorite Candy on Your Favorite Day?

    //Optimize this solution

    public int totalFruit(int[] fruits) {

        HashMap<Integer, Integer> distinctNumbers = new HashMap<>();
        int maxLength = Integer.MIN_VALUE;
        int start = 0;

        for(int end = 0; end < fruits.length; end++)
        {
            distinctNumbers.put(fruits[end], distinctNumbers.getOrDefault(fruits[end], 0) + 1);

            while(distinctNumbers.size() > 2)
            {
                distinctNumbers.put(fruits[start], distinctNumbers.getOrDefault(fruits[start], 0) - 1);
                if(distinctNumbers.get(fruits[start]) <= 0)
                {
                    distinctNumbers.remove(fruits[start]);
                }
                start++;
            }

            if(distinctNumbers.size() <= 2)
            {
                maxLength = Math.max(maxLength, (end - start) + 1);
            }


        }
        return maxLength < 0 ? 0 : maxLength;
    }
}
