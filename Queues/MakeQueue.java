import java.util.Stack;

class LinkedListQ {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;

    boolean isEmpty() {
        return head == null && tail == null;
    }

    void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    int remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        int front = head.data;

        if (tail == head) {
            head = tail = null;
        } else {
            head = head.next;
        }

        return front;
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return head.data;
    }
}

class CircularQueue {
    int arr[];
    int size;
    int front;
    int rear;

    CircularQueue(int n) {
        arr = new int[n];
        size = n; // arr.length;
        front = -1;
        rear = -1;
    }

    boolean isEmpty() {
        return front == -1 && rear == -1;
    }

    boolean isFull() {
        return (rear + 1) % size == front;
    }

    void add(int data) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }

        if (front == -1) {
            front = 0;
        }

        rear = (rear + 1) % size;
        arr[rear] = data;
    }

    int remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        int result = arr[0];
        if (rear == front) {
            rear = front = -1;
        } else {
            front = (front + 1) % size;
        }

        return result;
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        return arr[front];
    }
}

class QueueUsing2Stack {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    boolean isEmpty() {
        return s1.isEmpty();
    }

    void add(int data) {
        // 1 step push s1 all elements in s2
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }

        // 2 step push data in s1
        s1.push(data);

        // 3 step again push s2 all element in s1
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }

    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return s1.peek();
    }

    int remove() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return s1.pop();
    }
}

// Using Array ==> drawbacks only store n elements
class Queues {
    int arr[];
    int rear;
    int size;

    public Queues(int n) {
        arr = new int[n];
        rear = -1;
        size = arr.length;
    }

    boolean isEmpty() {
        return rear == -1;
    }

    void add(int data) {
        if (rear == size - 1) {
            System.out.print("Queue is full");
            return;
        }
        rear = rear + 1;
        arr[rear] = data;
    }

    int remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        int front = arr[0];
        // remove the first element
        for (int i = 0; i < rear; i++) {
            arr[i] = arr[i + 1];
        }
        rear--;
        return front;
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        return arr[0];
    }
}

public class MakeQueue {

    public static void main(String[] args) {
        QueueUsing2Stack q = new QueueUsing2Stack();
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
