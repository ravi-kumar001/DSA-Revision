public class LinkedList {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("LinkedList is empty");
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int index, int data) {
        if (index == 0) {
            add(index, data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < index) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("LL is empty");
            return -1;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        size--;
        head = head.next;
        return val;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is empty");
            return -1;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int i = 0;
        Node prev = head;
        while (i < size - 2) {
            prev = prev.next;
            i++;
        }
        int val = prev.next.data;
        size--;
        prev.next = null;
        tail = prev;

        return val;
    }

    public int search(int key) {
        Node temp = head;
        int i = 0;

        while (i < size) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }

        if (head.data == key) {
            return 0;
        }

        int index = helper(head.next, key);

        if (index == -1) {
            return -1;
        }
        return index + 1;
    }

    public int recursiveSearch(int key) {
        return helper(head, key);
    }

    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void deletenthFromEnd(int n) {
        // calculate size
        int size = 0;

        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }

        if (size == n) {
            head = head.next;
            return;
        }

        int i = 1;
        int indexFromEnd = size - n;
        Node prev = head;

        while (i < indexFromEnd) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;

    }

    // Function to detect a cycle in the linked list
    public static boolean cycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) { // Corrected condition
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true; // Cycle detected
            }
        }
        return false; // No cycle
    }

    // Function to remove a cycle from the linked list
    public void removeCycle() {
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        // Detect cycle
        while (fast != null && fast.next != null) { // Corrected condition
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                cycle = true;
                break;
            }
        }

        if (!cycle) { // If no cycle, return
            return;
        }

        // Find the start of the cycle
        slow = head;
        Node prev = null;

        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // Break the cycle
        prev.next = null;
    }

    private Node findMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    private Node merge(Node head1, Node head2) {
        // we make a new node for merging
        Node mergeLL = new Node(-1);
        Node temp = mergeLL; // we store here

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                // we increase both index i.e Node
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        // for remaining part
        while (head1 != null) {
            temp.next = head1;
            // we increase both index i.e Node
            head1 = head1.next;
            temp = temp.next;
        }

        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergeLL.next;
    }

    public Node mergeSort(Node head) {
        // base case
        if (head == null || head.next == null) {
            return head;
        }

        // find mid
        Node midNode = findMid(head);

        // break into two parts
        Node rightHead = midNode.next;
        midNode.next = null;

        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        // then merge
        return merge(newLeft, newRight);
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);

        ll.print();
        ll.head = ll.mergeSort(ll.head);
        ll.print();
    }
}