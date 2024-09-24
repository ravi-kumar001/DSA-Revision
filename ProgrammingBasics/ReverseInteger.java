public class ReverseInteger {
    public static int reverseInteger(int n) {
        int reverseN = 0;
        while (n != 0) {
            int ld = n % 10;
            if (reverseN > (Integer.MAX_VALUE - ld) / 10) {
                return 0;
            }
            reverseN = (reverseN * 10) + ld;
            n = n / 10;
        }
        return reverseN;

    }

    public static void main(String[] args) {
        System.out.println(reverseInteger(12));
    }
}
