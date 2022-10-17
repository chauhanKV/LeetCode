package leetcode.techniques.Recursion;

import java.util.ArrayList;

public class WinnerOfCircularGame {
    //Runtime: 4 ms, faster than 64.19% of Java online submissions for Find the Winner of the Circular Game.
    //Memory Usage: 41.6 MB, less than 43.66% of Java online submissions for Find the Winner of the Circular Game.
    //Next challenges:
    //Multiply Strings
    //Path with Maximum Gold
    //Minimum Cost to Set Cooking Time

    public int findTheWinner(int n, int k) {
        ArrayList<Integer> persons = new ArrayList();

        for(int i = 0 ; i < n; i++)
        {
            persons.add(i+1);
        }

        int index = 0;
        findTheWinnerHelper(k, persons, index);

        return persons.get(index);
    }

    public void findTheWinnerHelper(int k, ArrayList<Integer> persons, int index)
    {
        // base condition
        if(persons.size() == 1)
        {
            return;
        }

        // Hypothesis
        index = (index + (k - 1)) % persons.size();
        persons.remove(index);

        findTheWinnerHelper(k, persons, index);
    }
}
