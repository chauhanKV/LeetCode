package leetcode.CTCI;

public class IsUnique {
    public boolean isUnique(String value)
    {
        if(value.length() > 128)
            return false;
        // Space of 128 is used
        boolean[] arr = new boolean[128]; // boolean declares to false by default
        for(int i = 0 ; i < value.length(); i++)
        {
            boolean charStatus = arr[value.charAt(i) - 'a'];
            if(charStatus)
            {
                return !charStatus;
            }
            arr[value.charAt(i) - 'a'] = true;
        }
        return true;
    }



//
//public boolean isUnique(String value) {
//    System.out.println("a" + );
//return false;
//}



}
