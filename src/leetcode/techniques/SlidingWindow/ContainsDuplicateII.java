package leetcode.techniques.SlidingWindow;
import java.util.*;

public class ContainsDuplicateII {
    //Runtime: 18 ms, faster than 65.51% of Java online submissions for Contains Duplicate II.
    //Memory Usage: 47.8 MB, less than 87.58% of Java online submissions for Contains Duplicate II.
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(k == 0) {return false;}

        HashSet<Integer> occurance = new HashSet<>();
        int start = 0;

        for(int end = 0; end < nums.length; end++)
        {
            if(occurance.contains(nums[end]))
            {
                if((end - start) <= k)
                {
                    return true;
                }
            }

            if(end >= k)
            {
                if(occurance.contains(nums[start]))
                {
                    occurance.remove(nums[start]);
                }
                start++;
            }
            occurance.add(nums[end]);
        }
        return false;
    }
}
