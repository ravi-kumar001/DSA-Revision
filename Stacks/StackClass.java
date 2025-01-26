import java.util.Stack;

public class StackClass {

    public static void pushAtBottom(Stack<Integer> stack, int data) {
        if (stack.isEmpty()) {
            stack.push(data);
            return;
        }

        int val = stack.pop();
        pushAtBottom(stack, data);
        stack.push(val);
    }

    public static String reverseString(String str) {
        // first pusht into Stack
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            s.push(str.charAt(i));
        }

        StringBuilder sb = new StringBuilder();

        while (!s.isEmpty()) {
            sb.append(s.pop());
        }

        return sb.toString();
    }

    public static void stockSpan(int stock[], int[] span) {
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);

        for (int i = 1; i < stock.length; i++) {
            int todayPrice = stock[i];

            while (!s.isEmpty() && todayPrice > stock[s.peek()]) {
                s.pop();
            }

            if (s.isEmpty()) {
                span[i] = i + 1;
            } else {
                int preHighest = s.peek();
                span[i] = i - preHighest;
            }
            s.push(i);
        }
    }

    public static int[] nextGreater(int arr[]) {
        int ans[] = new int[arr.length];
        Stack<Integer> s = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            int curr = arr[i];

            while (!s.empty() && arr[s.peek()] <= curr) {
                s.pop();
            }

            if (s.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = arr[s.peek()];
            }

            s.push(i);
        }

        return ans;
    }

    public static int[] nsL(int arr[]) {
        int ans[] = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {

            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = stack.peek();
            }
            stack.push(i);
        }

        return ans;
    }

    public static int[] nsR(int arr[]) {
        int ans[] = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {

            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                ans[i] = arr.length;
            } else {
                ans[i] = stack.peek();
            }

            stack.push(i);
        }

        return ans;
    }

    public static int maxAreaHistogram(int arr[]) {
        // arr[i] show bars height
        // first find nsL ===> next smaller left
        int nsL[] = nsL(arr);
        // second find nsR ==> next smaller right
        int nsR[] = nsR(arr);

        // Lets calculate max area
        int maxArea = 0;
        for (int i = 0; i < arr.length; i++) {
            int height = arr[i];
            int width = nsR[i] - nsL[i] - 1;
            maxArea = Math.max(maxArea, height * width);
        }

        return maxArea;

    }

    public static boolean duplicateParentheses(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ')') {

                int count = 0;
                while (s.pop() != '(') {
                    count++;
                }

                if (count < 1) {
                    return true;
                }
            } else {
                s.push(ch);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String str1 = "((a + b))";

        System.out.println(duplicateParentheses(str1));
    }
}