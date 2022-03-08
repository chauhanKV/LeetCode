package leetcode.DataStructuresArrays;

public class CheckPangram {

    //Runtime: 83 ms, faster than 6.19% of Java online submissions for Check if the Sentence Is Pangram.
    //Memory Usage: 73.2 MB, less than 6.69% of Java online submissions for Check if the Sentence Is Pangram.
    //Next challenges:
    //Find Common Characters
    //Sort Features by Popularity
    //Step-By-Step Directions From a Binary Tree Node to Another

    // Time Complexity : O(N)
    // Space Complexity : O(26) => O(1)
    public boolean checkIfPangram(String sentence) {
        int[] arr = new int[26];

        for(int i = 0 ; i < sentence.toCharArray().length; i++)
        {
            arr[sentence.charAt(i) - 'a']++;
        }

        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] == 0)
            {
                return false;
            }
        }
        return true;
    }
}
