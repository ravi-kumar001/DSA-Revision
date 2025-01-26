import java.util.ArrayList;

class Stack { // Using ArryList
    ArrayList<Integer> list = new ArrayList<>();

    void push(int data) {
        list.add(data);
    }

    boolean isEmpty() {
        return list.size() == 0;
    }

    int pop() {
        if (isEmpty()) {
            return -1;
        }

        return list.remove(list.size() - 1);
    }

    int peek() {
        if (isEmpty()) {
            return -1;
        }

        return list.get(list.size() - 1);
    }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class StackLinkedList {
    // first make our LinkedList class
    Node head = null;

    boolean isEmpty() {
        return head == null;
    }

    void push(int data) {
        // first make new Node
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    int pop() {
        if (isEmpty()) {
            return -1;
        }
        int val = head.data;
        head = head.next;
        return val;
    }

    int peek() {
        if (isEmpty()) {
            return -1;
        }
        int val = head.data;

        return val;
    }
}

public class StackBasics {

    public static void main(String[] args) {
        StackLinkedList s = new StackLinkedList();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}