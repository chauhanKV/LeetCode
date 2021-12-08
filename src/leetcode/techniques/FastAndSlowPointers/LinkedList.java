package leetcode.techniques.FastAndSlowPointers;

public class LinkedList<T> {
    private class Node<T> {
        private T value;
        private Node<T> next;

        public Node(T value) {
            this.value = value;
        }
    }

    private Node<T> first;
    private Node<T> last;
    private int size = 0;

    // Time Complexity -> O(1)
    public void addFirst(T element) {
        var node = new Node(element);

        //First check if the list is empty
        if (isEmpty()) {
            first = last = node;
        } else {
            node.next = first;
            first = node;
        }
        size++;
    }

    //Time Complexity -> O(1)
    public void addLast(T element) {
        var node = new Node(element);

        // First check if the list is empty
        if (isEmpty()) {
            first = last = node;
        } else {
            //append the node to last node's next and update the last node
            last.next = node;
            last = node;
        }
        size++;
    }

    private boolean isEmpty() {
        return first == null;
    }

    // Time complexity -> O(1)
    public void removeFirst() {
        if(isEmpty())
            throw new IndexOutOfBoundsException();

        var second = first.next;
        first.next = null;
        first = second;
        size--;
    }

    // Time Complexity -> O(N)
    public void removeLast() {
        if (isEmpty())
            throw new IndexOutOfBoundsException();

        var current = first;
        while (current.next != last) {
            current = current.next;
        }
        last = current;
        last.next = null;
        size--;
    }

    // Time Complexity -> O(N)
    public boolean contains(T element) {
        if (isEmpty()) return false;
        var current = first;

        while (current != last) {
            if (current.value == element) {
                return true;
            } else {
                current = current.next;
            }
        }
        return false;
    }

    //Time Complexity -> O(N)
    public int indexOf(T element) {
        if(isEmpty()) return -1;
        var current = first;
        var counter = 0;
        while (current != last) {
            if (current.value == element)
                return counter;
            else
            {
                current = current.next;
                counter++;
            }
        }
        return -1;
    }

    private int size()
    {
        return size;
    }


    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Linked List Cycle.
    //Memory Usage: 43.3 MB, less than 6.54% of Java online submissions for Linked List Cycle.
    //Next challenges:
    //Linked List Cycle II
    //Happy Number

    // Time complexity : O(N)
    // - Once the slow pointer enters the cycle, fast pointer will reach slow pointer in one iteration so its O(N)
    // Space Complexity : O(1)
    public boolean hasCycle() {
        var fast = first;
        var slow = first;

        while(fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow)
                return true;
        }
        return false;
    }

    public void createCycleAtPosition(int position)
    {
        if(position > size)
        {
            throw new IndexOutOfBoundsException();
        }

        var index = 0;
        var current = first;
        while(current != null && current.next != null)
        {
            current = current.next;
            index++;
            if(index == position)
            {
                last.next = current;
                break;
            }
        }
    }

    public void add(int index, T element)
    {}

//    // Need to create generic array -> refer ->  https://www.baeldung.com/java-generic-array
//      public String[] printList() {
//          String[]
//
//
//          return array;
//      }

}
