public class SquarePrint {
    public static void main(String[] args) {
        // Logic First
        for (int i = 1; i <= 4; i++) { // This line track no. of lines
            for (int j = 1; j <= 4; j++) { // this line track how many stars are printed
                System.out.print("* ");
            }
            System.out.println("");
        }

        // Second Logic
        System.out.println("Second Logic");
        for (int i = 1; i <= 4; i++) {
            System.out.println("* * * *");
        }

    }
}
