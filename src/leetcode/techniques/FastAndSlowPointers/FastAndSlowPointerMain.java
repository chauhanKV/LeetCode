package leetcode.techniques.FastAndSlowPointers;

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
  }


}
