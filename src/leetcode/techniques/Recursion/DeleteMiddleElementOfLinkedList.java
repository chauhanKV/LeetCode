package leetcode.techniques.Recursion;

public class DeleteMiddleElementOfLinkedList {

    //Runtime: 18 ms, faster than 6.30% of Java online submissions for Delete the Middle Node of a Linked List.
    //Memory Usage: 67.6 MB, less than 85.63% of Java online submissions for Delete the Middle Node of a Linked List.
    //Next challenges:
    //Remove Nth Node From End of List
    //Remove Linked List Elements
    public ListNode deleteMiddle(ListNode head) {
        int listSize = size(head);
        int k = listSize / 2;
        return deleteMiddleHelper(head, k);

    }

    public int size(ListNode head) {
        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }

    public ListNode deleteMiddleHelper(ListNode head, int k) {
        if (k == 0) {
            return head.next;
        }

        ListNode temp = head;
        head = head.next;
        temp.next = null;

        ListNode newHead = deleteMiddleHelper(head, k - 1);

        temp.next = newHead;
        newHead = temp;

        return newHead;
    }

}
