public class DoubleLL {
    public static class Node {

        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
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
        head.prev = newNode;
        head = newNode;
    }

    public void print() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void removeFirst() {
        head = head.next;
        head.prev = null;
        size--;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;

    }

    public void removeLast() {
        // first trac prev of tail node
        if (size == 0)
            System.out.println("DLL is Empty");
        else if (size == 1) {
            head = tail = null;
            size = 0;
            return;
        }

        int i = 0;
        Node prev1 = head;

        while (i < size - 2) {
            prev1 = prev1.next;
            i++;
        }

        prev1.next = null;
        size--;
        tail = prev1;
    }

    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();
        dll.addFirst(1);
        dll.addFirst(2);
        dll.addFirst(3);
        dll.print();

        dll.removeLast();
        dll.print();
    }
}
