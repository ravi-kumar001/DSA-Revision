public class MyNameC {
    public static void main(String[] args) {
        int n = 7;

        for (int i = 0; i < n; i++) { // Logic for row

            // Print R pattern
            for (int j = 0; j < n; j++) { // Logic for col
                if (i == 0 && j < n - 3 || j == 0 || i - j == (n - 1) / 2 - 1
                        || i == (n - 1) / 2 && j < (n - 3) || j == n - 3 && i > 0 && i < (n - 1) / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("  "); // Space between letters

            // Print A pattern
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
            System.out.print("  "); // Space between letters

            // Print full-sized V pattern
            for (int j = 0; j < n; j++) { // Logic for col
                if (i == j && j <= n / 2 || i + j == n - 1 && j >= n / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("  "); // Space between letters

            // Print I pattern
            for (int j = 0; j < n; j++) { // Logic for col
                if (i == 0 || i == n - 1 || j == (n - 1) / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}