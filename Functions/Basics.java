import java.util.ArrayList;
import java.util.List;

public class Basics {
    public static int factorial(int n) {
        int fact = 1;
        if (n == 0) {
            return 1;
        }
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static int binomialCofficient(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeInRange(int range) {
        for (int i = 1; i <= range; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static int binaryToDecimal(int n) {
        int decimalNumber = 0;
        // int iterator = 0;
        // while (n != 0) {
        // int ld = n % 10;
        // decimalNumber += ld * (int) Math.pow(2, iterator);
        // iterator++;
        // n /= 10;
        // }

        int base = 1;
        while (n != 0) {
            int ld = n % 10;
            decimalNumber += ld * base;
            base <<= 1; // This is equal to base *= 2
            n /= 10;
        }
        return decimalNumber;
    }

    public static int decimalToBinary(int n) {
        int binary = 0;
        int iterator = 0;
        if (n == 0) {
            return 0;
        }
        while (n > 0) {
            int rem = n % 2;
            binary = binary + (rem * (int) Math.pow(10, iterator));
            iterator++;
            n /= 2;
        }
        return binary;
    }

    public static String decimalTobinary(int n) {
        if (n == 0) {
            return "0";
        }
        String binary = "";
        while (n > 0) {
            int bit = n & 1;
            binary = bit + binary;
            n >>= 1;
        }
        return binary;
    }

    public static boolean evenOrOdd(int n) {
        return (n & 1) == 0 ? true : false;
    }

    public static int lengthofLastworld(String s) {
        int count = 0;
        int end = s.length() - 1;

        // Remove Space
        while (end >= 0 && s.charAt(end) == ' ') {
            end--;
        }

        // special Case
        if (end < 0) {
            return 0;
        }

        // Our Logic
        while (end >= 0 && s.charAt(end) != ' ') {
            count++;
            end--;
        }
        return count;
    }

    public static List<Integer> rowOfPascal(int i) {
        List<Integer> row = new ArrayList<>();
        int ans = 1;
        row.add(ans);
        for (int j = 1; j < i; j++) {
            ans = ans * (i - j);
            ans = ans / j;
            row.add(ans);
        }
        return row;
    }

    public static List<List<Integer>> pascalTri(int n) {
        List<List<Integer>> triangle = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            triangle.add(rowOfPascal(i));
        }
        return triangle;
    }

    public static long nThElement(int row, int col) {
        row = row - 1;
        col = col - 1;
        long ans = 1;
        for (int i = 0; i < col; i++) {
            ans = ans * (row - i);
            ans = ans / (i + 1);
        }
        return ans;
    }

    // public static String addBinary(String str1, String str2) {
    // int ldOfStr1 = str1.length() - 1;
    // int ldOfStr2 = str1.length() - 1;
    // int carry = 0;
    // String result = "";

    // while (ldOfStr1 != 0 || ldOfStr2 != 0) {
    // if(str1.lastIndexOf(ldOfStr1) == 1)
    // }
    // return result;
    // }

    public static void main(String[] args) {
        List<List<Integer>> result = pascalTri(5);
        System.out.println(result);
    }
}