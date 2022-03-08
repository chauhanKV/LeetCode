package leetcode.DataStructuresArrays;

import java.util.ArrayList;
import java.util.List;

public class GreatestCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        List<Boolean> result = new ArrayList<>();

        for(int i = 0 ; i < candies.length; i++)
        {
            if(max < candies[i])
            {
                max = candies[i];
            }
        }

        for(int i = 0 ; i < candies.length; i++)
        {
            if(candies[i] + extraCandies >= max)
            {
                result.add(true);
            }
            else
            {
                result.add(false);
            }
        }

        return result;
    }
}
