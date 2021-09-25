package leetcode.techniques.SlidingWindow;
import java.util.*;

public class FruitsIntoBasket {
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
