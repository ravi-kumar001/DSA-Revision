import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;

public class LargeFactorial {
    // public static BigInteger findFactorial(int n) {
    // // Base case
    // if (n == 0 || n == 1) {
    // return BigInteger.ONE;
    // }

    // return BigInteger.valueOf(n).multiply(findFactorial(n - 1));
    // }

    // public static ArrayList<Integer> factorial(int N) {
    // BigInteger factorial = findFactorial(N);

    // ArrayList<Integer> ans = new ArrayList<>();

    // while (factorial.compareTo(BigInteger.ZERO) > 0) {
    // int ld = factorial.mod(BigInteger.TEN).intValue(); // Get last digit
    // ans.add(ld);
    // factorial = factorial.divide(BigInteger.TEN); // Remove last digit
    // }

    // // Reverse the result
    // Collections.reverse(ans);

    // return ans;
    // }

    public static ArrayList<Integer> factorial(int N) {
        ArrayList<Integer> ans = new ArrayList<>();

        ans.add(1);

        for (int x = 2; x <= N; x++) {
            multiply(ans, x);
        }

        Collections.reverse(ans);

        return ans;
    }

    public static void multiply(ArrayList<Integer> ans, int x) {

        int carry = 0;

        for (int i = 0; i < ans.size(); i++) {
            int product = ans.get(i) * x + carry;
            ans.set(i, product % 10); // We add only first index of product
            carry = product / 10; // Remaining digit will be carry
        }

        // if Our Carry Remaining
        while (carry > 0) {
            ans.add(carry % 10);
            carry /= 10;
        }
    }

    public static void main(String[] args) {
        System.out.println(factorial(10));
    }
}
