import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class QueueQuestion {

    public static String firstNonRepeating(String stream) {
        StringBuilder ans = new StringBuilder();
        int freq[] = new int[26];
        Queue<Character> q = new LinkedList<>();

        for (int i = 0; i < stream.length(); i++) {
            char ch = stream.charAt(i);
            // increase its freq.
            freq[ch - 'a']++;
            q.add(ch);

            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                q.remove();
            }

            if (q.isEmpty()) {
                ans.append(" " + -1);
            } else {
                ans.append(" " + q.peek());
            }
        }

        return ans.toString();
    }

    public static void reverseFirstKth(int k, Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < k; i++) {
            s.push(q.remove());
        }

        while (s.size() > 0) {
            q.add(s.pop());
        }

        for (int i = 0; i < q.size() - k; i++) {
            q.add(q.remove());
        }
    }

    // Function to find the first negative integer in every window of size k
    public static List<Integer> FirstNegativeInteger(int arr[], int k) {
        int n = arr.length;
        Queue<Integer> q = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();

        // First step: add all indices of negative numbers in the queue
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                q.add(i);
            }
        }

        // Second step: process each window of size k
        for (int i = 0; i < n - k + 1; i++) {
            // Remove indices that are out of the current window
            while (!q.isEmpty() && q.peek() < i) {
                q.remove();
            }

            // If the queue is not empty and the first element is within the current window
            if (!q.isEmpty() && q.peek() <= i + k - 1) {
                ans.add(arr[q.peek()]);
            } else {
                // If no negative number is found in the current window, add 0
                ans.add(0);
            }
        }

        return ans;
    }

    public static void reverse(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();

        while (q.size() > 0) {
            s.push(q.remove());
        }

        while (s.size() > 0) {
            q.add(s.pop());
        }
    }

    public static void main(String[] args) {
        System.out.println(firstNonRepeating("aabccxb"));

    }
}
