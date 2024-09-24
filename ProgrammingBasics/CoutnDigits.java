public class CoutnDigits {
    public static int countDigits(int n) {
        int count = 0;
        int temp = n;
        while (temp > 0) {
            int ld = temp % 10;
            if (ld != 0 && n % ld == 0) {
                count++;
            }
            temp /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countDigits(2446));
    }
}
