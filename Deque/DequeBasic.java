import java.util.Deque;
import java.util.LinkedList;

class Stack {
    Deque<Integer> deque = new LinkedList<>();

    void push(int val) {
        deque.addLast(val);
    }

    int pop() {
        return deque.removeLast();
    }

    int peek() {
        return deque.getLast();
    }

}

class Queue {
    Deque<Integer> deque = new LinkedList<>();

    void add(int val) {
        deque.addLast(val);
    }

    int remove() {
        return deque.removeFirst();
    }

    int peek() {
        return deque.getFirst();
    }

}

public class DequeBasic {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);

        System.out.println(s.peek());
        System.out.flush();
    }
}
