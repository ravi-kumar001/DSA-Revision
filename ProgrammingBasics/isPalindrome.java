public class isPalindrome {

    public static boolean isPalindromeorNot(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedHalf = 0;
        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + x % 10;
            x /= 10;
        }

        System.out.println(x);
        return x == reversedHalf || x == reversedHalf / 10;
    }

    public static void main(String[] args) {
        System.out.println(isPalindromeorNot(1331));
    }
}
