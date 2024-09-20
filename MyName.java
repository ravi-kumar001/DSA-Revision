public class MyName {
    public static void main(String[] args) {
        int n = 7;

        // Lets Try to make R Pattern
        for (int i = 0; i < n; i++) { // Logic for row
            for (int j = 0; j < n; j++) { // Logic for col
                if (i == 0 && j < n - 3 || j == 0 || i - j == (n - 1) / 2 -1
                        || i == (n - 1) / 2 && j < (n - 3) || j == n - 3 && i > 0 && i < (n - 1) / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        // Try to make A shape
        for (int i = 0; i < n; i++) { // Logic for row
            for (int j = 0; j < n; j++) { // Logic for col
                if (i == 0 && j > 0 && j < (n - 1) ||
                        j == 0 && i > 0 ||
                        j == n - 1 && i > 0 ||
                        i == (n - 1) / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        // Try V Letter
        for (int i = 0; i < n; i++) { // Logic for row
            for (int j = 0; j < n; j++) { // Logic for col
                if (i - j == (n - 1) / 2 || i + j == (n - 1) + (n - 1) / 2) {
                    System.out.print("*  ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        // Try I Letter
        for (int i = 0; i < n; i++) { // Logic for row
            for (int j = 0; j < n; j++) { // Logic for col
                if (i == 0 || i == n - 1 || j == (n - 1) / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
