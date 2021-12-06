package leetcode.techniques.TwoPointers;

public class BackSpaceStringCompare {
    public boolean backspaceCompare(String s, String t) {
        int index1 = s.length() - 1;
        int index2 = t.length() - 1;

        while(index1 >= 0 || index2 >= 0)
        {
            int validIndex1 = getNextValidIndex(s, index1);
            int validIndex2 = getNextValidIndex(t, index2);

            if(validIndex1 < 0 && validIndex2 < 0)
                return true;

            if(validIndex1 < 0 || validIndex2 < 0)
                return false;

            if(s.charAt(validIndex1) != t.charAt(validIndex2))
                return false;

            index1 = validIndex1 - 1;
            index2 = validIndex2 - 1;
        }
        return true;
    }

    private int getNextValidIndex(String text, int index)
    {
        int backSpaceCounter = 0;

        while(index >= 0)
        {
            if(text.charAt(index) == '#')
                backSpaceCounter++;
            else if(backSpaceCounter > 0)
                backSpaceCounter--;
            else
                break;

            index--;
        }
        return index;
    }
}
