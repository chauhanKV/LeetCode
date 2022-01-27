package leetcode.techniques.NumberTheory;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    //Runtime: 2 ms, faster than 60.46% of Java online submissions for Fizz Buzz.
    //Memory Usage: 48.6 MB, less than 6.67% of Java online submissions for Fizz Buzz.
    //Next challenges:
    //Fizz Buzz Multithreaded

    // Time Complexity : O(N)
    // Space Complexity : O(1)

    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>();

        for(int i = 1; i <= n; i++)
        {
            if(i % 3 == 0 && i % 5 == 0)
            {
                answer.add("FizzBuzz");
            }
            else if(i % 3 == 0)
            {
                answer.add("Fizz");
            }
            else if(i % 5 == 0)
            {
                answer.add("Buzz");
            }
            else
            {
                String val = String.valueOf(i);
                answer.add(val);
            }
        }

        return answer;
    }
}
