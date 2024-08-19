public class PrimeInRange {
    public static void main(String[] args) {
        System.out.println(2 % 3);
        System.out.println("1");
        for (int i = 2; i <= 100; i++) {
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    System.out.println(i);
                }
            }

        }
    }

}
