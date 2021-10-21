package leetcode.techniques.TwoPointers;

public class TwoPointersMain {
    public static void main(String[] args)
    {
        RemoveDuplicatesfromSortedArray removeDuplicates = new RemoveDuplicatesfromSortedArray();
        int nonDuplicates = removeDuplicates.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4});
        System.out.println("Removed duplicates from sorted Array : " + nonDuplicates);
    }
}
