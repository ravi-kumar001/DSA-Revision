public class ReverseNumber {
    public static void main(String[] args) {
        int n = 25052003;
        while (n > 0) {
            System.out.print(n % 10 + " ");
            n = n / 10;
        }

        System.out.println();
        int n2 = 123456;
        int revN = 0;
        do {
            revN = (revN * 10) + n2 % 10;
            n2 = n2 / 10;
        } while (n2 > 0);
        System.out.println(revN);
    }
}
