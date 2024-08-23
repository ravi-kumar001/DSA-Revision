public class BinaryToDecimal {
    public static int lastDigit(int n) {
        int lastDigit = n % 10;
        return lastDigit;
    }

    public static int binaryToDecimal(int n) {
        int digit = 0;
        int iterator = 0;
        while (n > 0) {
            int ld = lastDigit(n);
            digit = digit + ld * (int) (Math.pow(2, iterator));
            iterator++;
            n = n / 10;
        }
        return digit;
    }

    public static int decimalToBinary(int n) {
        int digit = 0;
        int iterator = 0;
        while (n > 0) {
            int rem = n % 2;
            digit = digit + rem * (int) (Math.pow(10, iterator));
            iterator++;
            n = n / 2;
        }
        return digit;
    }

    public static void main(String[] args) {
        System.out.println("Decimal Number => " + binaryToDecimal(1000));
        System.out.println("Binary Number => " + decimalToBinary(5));
    }
}
