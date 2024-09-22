import java.util.HashSet;

public class HappyNumber {

    public static boolean happyNumber(int n) {

        // This is my Logic its applicable for only Happy Number
        // int ans = 0;

        // if (ans == 1) {
        // return true;
        // }

        // while (n != 0) {
        // int ld = n % 10;
        // ans += ld * ld;

        // n /= 10;
        // System.out.println(ans);
        // }
        // if (ans != 1) {
        // happyNumber(ans);
        // }

        // Use of HashSet for storing unique element
        HashSet<Integer> number = new HashSet<>();
        while (n != 1 && !number.contains(n)) {
            number.add(n);
            n = nextElement(n);
        }

        return n == 1;

    }

    public static int nextElement(int n) {
        int ans = 0;
        while (n > 0) {
            int ld = n % 10;
            ans += ld * ld;
            n /= 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(happyNumber(19));
    }
}
