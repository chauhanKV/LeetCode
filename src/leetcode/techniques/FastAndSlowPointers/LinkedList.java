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

    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Linked List Cycle II.
    //Memory Usage: 39.1 MB, less than 73.39% of Java online submissions for Linked List Cycle II.
    //Next challenges:
    //Find the Duplicate Number

    //Time Complexity : O(N)
    //Space Complexity : O(1) constant space

    // Floyds cycle detection algorithm

    public int getStartValueOfCycle()
    {
        var fast = first;
        var slow = first;
        var headNodeValue = first;
        boolean foundCycle = false;

        while(fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;

            if(slow == fast)
            {
                // Found the cycle
                // Find head node
                foundCycle = true;
                headNodeValue = findHeadNodeValue(fast, first);
                break;

            }
        }
        return foundCycle ?  (int)headNodeValue.value : 0;
    }

    private Node findHeadNodeValue(Node fast, Node first)
    {
        var slow = first;

        while(fast != slow)
        {
            fast = fast.next;
            slow = slow.next;
        }

        return fast;
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


    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Middle of the Linked List.
    //Memory Usage: 36.7 MB, less than 33.97% of Java online submissions for Middle of the Linked List.
    //Next challenges:
    //Delete the Middle Node of a Linked List

    // Time Complexity : O(N)
    // Space Complexity : O(1)

    // fast pointer is moving twice as that of slow pointer, so when slow pointer reaches middle, fast pointer reach end of the list.
    public T getMiddleOfList()
    {
        var slow = first;
        var fast = first;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.value;
    }

    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Reverse Linked List.
    //Memory Usage: 38.4 MB, less than 94.27% of Java online submissions for Reverse Linked List.
    //Next challenges:
    //Reverse Linked List II
    //Binary Tree Upside Down
    //Palindrome Linked List
    //Reverse Nodes in Even Length Groups

    // Time Complexity : O(N)
    // Space Complexity : O(1)
    public void reverseList()
    {
        Node<T> previous = null;
        while(first != null)
        {
            Node<T> next = first.next;
            first.next = previous;

            previous = first;
            first = next;
        }
    }

    private Node<T> reverseList(Node<T> middle)
    {
        Node<T> previous = null;
        while(middle != null)
        {
            Node<T> next = middle.next;
            middle.next = previous;

            previous = middle;
            middle = next;
        }

        return previous;
    }

    //Runtime: 5 ms, faster than 78.98% of Java online submissions for Palindrome Linked List.
    //Memory Usage: 115.7 MB, less than 15.78% of Java online submissions for Palindrome Linked List.
    //Next challenges:
    //Palindrome Number
    //Valid Palindrome

    // Time Complexity : O(N)
    // Space Complexity : O(1)

    // Try recursion approach for this solution
    public boolean isListPalindrome()
    {
        if(isEmpty()) return false;

        var slow = first;
        var fast = first;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        var headSecondHalf = reverseList(slow);
        var copyOfSecondHalf = headSecondHalf;

        while(first != null && headSecondHalf != null)
        {
            if(first.value != headSecondHalf.value)
            {
                break;
            }
            first = first.next;
            headSecondHalf = headSecondHalf.next;
        }

        if((first == null || first.next == null) && headSecondHalf == null)
        {
            reverseList(copyOfSecondHalf);
            return true;
        }
        reverseList(copyOfSecondHalf);

        return false;
    }

    //Runtime: 1 ms, faster than 99.87% of Java online submissions for Reorder List.
    //Memory Usage: 42 MB, less than 44.25% of Java online submissions for Reorder List.
    //Next challenges:
    //Delete the Middle Node of a Linked List

    // Time Complexity : O(N)
    // Space Complexity : O(1)
    public void reorderList() {
        if(isEmpty()) return;

        var fast = first;
        var slow = first;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        var secondHalf = reverseList(slow);
        var firstHalf = first;

        while(secondHalf != null && firstHalf != null)
        {
            var temp = firstHalf.next;
            firstHalf.next = secondHalf;
            firstHalf = temp;

            temp = secondHalf.next;
            secondHalf.next = firstHalf;
            secondHalf = temp;
        }

        if(firstHalf != null)
        {
            firstHalf.next = null;
        }
    }

    //Runtime: 4 ms, faster than 99.82% of Java online submissions for Delete the Middle Node of a Linked List.
    //Memory Usage: 64 MB, less than 72.91% of Java online submissions for Delete the Middle Node of a Linked List.
    //Next challenges:
    //Remove Nth Node From End of List
    //Remove Linked List Elements

    // Time Complexity : O(N)
    // Space Complexity : O(N)
    public void deleteMiddle() {

        if(first.next == null)
        {
            first = null;
            return;
        }

        var slow = first;
        var fast = first;
        var previous = first;

        while(fast != null && fast.next != null)
        {
            previous = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        previous.next = slow.next;
        slow.next = null;
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
