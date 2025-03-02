public class RecursionBasics {

    public static void printDec(int n) {
        // Our base case
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }

        System.out.print(n + " ");
        printDec(n - 1);
    }

    public static void printInc(int n) {
        // Our base case
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printInc(n - 1);
        System.out.print(n + " ");
    }

    public static int printFact(int n) {
        if (n == 0) {
            return 1;
        }
        return n * printFact(n - 1);
    }

    public static int printSum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + printSum(n - 1);
    }

    public static int nthFibonaci(int n) {
        // base case of fibonacci number
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return nthFibonaci(n - 1) + nthFibonaci(n - 2);
    }

    public static boolean isSorted(int arr[], int index) {
        if (index == arr.length - 1) {
            return true;
        }
        if (arr[index] > arr[index + 1]) {
            return false;
        }

        return isSorted(arr, index + 1);
    }

    public static int firstOccurence(int arr[], int el, int index) {
        if (index == arr.length) {
            return -1;
        }

        if (arr[index] == el) {
            return index;
        }

        return firstOccurence(arr, el, index + 1);
    }

    public static int lastOccurence(int arr[], int el, int index) {
        if (index < 0) {
            return -1;
        }

        if (arr[index] == el) {
            return index;
        }

        return lastOccurence(arr, el, index - 1);
    }

    public static double xpowerN(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * xpowerN(x, n - 1);
    }

    public static void removeDuplicate(String str, int index, StringBuilder ans, boolean freq[]) {
        // Base case
        if (index == str.length()) {
            System.out.print(ans);
            return;
        }

        // Kaam
        Character ch = str.charAt(index);
        if (freq[ch - 'a']) {
            removeDuplicate(str, index + 1, ans, freq);
        } else {
            freq[ch - 'a'] = true;
            removeDuplicate(str, index + 1, ans.append(ch), freq);
        }
    }

    public static int tilingProblem(int n) { // our tiles size is 2 * n

        if (n == 0 || n == 1) {
            return 1;
        }

        return tilingProblem(n - 1) + tilingProblem(n - 2); // (n - 1) for vertical and (n - 2) for horizontal
    }

    public static void binaryString(int n, String str, int lastPlace) {
        if (n == 0) {
            System.out.println(str);
            return;
        }

        binaryString(n - 1, str + "0", 0);
        if (lastPlace == 0) {
            binaryString(n - 1, str + "1", 1);
        }
    }

    public static int friendsPairingWay(int n) {
        if (n == 1 || n == 2) {
            return n;
        }

        int nM1 = friendsPairingWay(n - 1);

        return nM1 + nM1 * friendsPairingWay(n - 2);
    }

    public static void findAllOccurence(int arr[], int i, int key) {

        if (i == arr.length) {
            return;
        }

        if (arr[i] == key) {
            System.out.print(i + " ");
        }
        findAllOccurence(arr, i + 1, key);
    }

    static String counting[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    public static void numberToStringRepresentation(int n) {
        if (n == 0) {
            return;
        }

        int ld = n % 10;
        numberToStringRepresentation(n / 10);
        System.out.print(counting[ld] + " ");
    }

    public static int lengthofString(String str) {
        if (str.length() == 0) {
            return 0;
        }
        return lengthofString(str.substring(1)) + 1;
    }

    public static void stringRev(String str, int index) {
        if (index == str.length()) {
            return;
        }
        stringRev(str, index + 1);
        System.out.print(str.charAt(index));
    }

    public static int mazePath(int sr, int sc, int er, int ec) {
        if (sr > er || sc > ec)
            return 0;
        if (sr == er && sc == ec)
            return 1;

        return mazePath(sr, sc + 1, er, ec) + mazePath(sr + 1, sc, er, ec); // first right and then down
    }

    public static void pip(int n) {
        if (n == 0)
            return;

        System.out.println("Pre " + n);
        pip(n - 1);
        System.out.println("In " + n);
        pip(n - 1);
        System.out.println("Post " + n);
    }

    public static void printZigZag(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        printZigZag(n - 1);
        System.out.print(n + " ");
        printZigZag(n - 1);
        System.out.print(n + " ");
    }

    public static void towerOfHonoi(int n, char a, char b, char c) { // here a, b, c are representing the rod as
                                                                     // (source, helper, destination)
        if (n == 0) {
            return;
        }

        towerOfHonoi(n - 1, a, c, b);
        System.out.println("Source " + a + " to " + c); // a for source and c for the destination
        towerOfHonoi(n - 1, b, a, c);

    }

    public static void arrayPrint(int arr[], int size, int index) {
        if (index == size) {
            return;
        }
        System.out.print(arr[index] + " ");
        arrayPrint(arr, size, index + 1);
    }

    public static int maxInArray(int arr[], int index) {
        if (index == arr.length) {
            return Integer.MIN_VALUE;
        }

        return Math.max(arr[index], maxInArray(arr, index + 1));
    }

    public static void removeChar(StringBuilder ans, String str, int index) {
        if (index == str.length()) {
            System.out.println(ans);
            return;
        }

        char ch = str.charAt(index);

        if (ch != 'a') {
            removeChar(ans.append(ch), str, index + 1);
        } else {
            removeChar(ans, str, index + 1);
        }
    }

    public static void subsetOfString(String ans, String str) { // if we choose (StringBuilde ans) then our ans
                                                                // incorrect. so, we choose here String ans who make new
                                                                // ans each time
        if (str.equals("")) {
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        subsetOfString(ans, str.substring(1)); // current ch is not taken
        subsetOfString(ans + ch, str.substring(1)); // current ch is not taken
    }

    public static void main(String[] args) {
        subsetOfString("", "abc");
    }
}