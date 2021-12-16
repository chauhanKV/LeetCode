package leetcode.techniques.FastAndSlowPointers;

import java.sql.SQLOutput;

public class FastAndSlowPointerMain {

  public static void main(String[] args)
  {
      LinkedList<Integer> list = new LinkedList<>();
      list.addFirst( 1);
      list.addFirst( 2);
      list.addFirst(3);
      list.addFirst( 4);
      list.addFirst(5);
      list.createCycleAtPosition(2);

      System.out.println("Does LinkedList has cycle ? : " + list.hasCycle());
      int value = list.getStartValueOfCycle();
      System.out.println("Get Start Value of the Cycle : " + value);

      HappyNumber happyNumber = new HappyNumber();
      boolean isHappy = happyNumber.isHappy(19);
      System.out.println("Is number HAPPY ? : " + isHappy);

      LinkedList<Integer> middle = new LinkedList<>();
      middle.addFirst(1);
      middle.addFirst(2);
      middle.addFirst(3);
      middle.addFirst(4);
      middle.addFirst(5);
      middle.addFirst(6);
      middle.addFirst(7);
      middle.addFirst(8);
      middle.addFirst(9);
      middle.addFirst(10);
      middle.addFirst(11);

      int middleOfList = middle.getMiddleOfList();
      System.out.println("Middle of the list is : " + middleOfList);

      LinkedList<Integer> newList = new LinkedList<>();
      newList.addFirst(1);
      newList.addFirst(2);
      newList.addFirst(3);
      newList.addFirst(2);
      newList.addFirst(1);
      boolean isPalindrome = newList.isListPalindrome();
      System.out.println("Does List have Palindrome ? : " + isPalindrome);

      LinkedList<Integer> newList1 = new LinkedList<>();
      newList1.addFirst(1);
      newList1.addFirst(2);
      newList1.addFirst(3);
      newList1.addFirst(4);
      newList1.addFirst(5);
      newList1.addFirst(6);

      newList1.reorderList();
      // Work on showing the list in console.

  }


}
