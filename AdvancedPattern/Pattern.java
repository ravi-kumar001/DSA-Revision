public class Pattern {
    public static void printPatten(int rows, int cols) {

        // I use second method
        for (int i = 1; i <= rows; i++) {
            char ch = 'A';
            for (int j = 1; j <= cols; j++) {
                if (i == 1 || j == 1 || j == cols || i + j <= rows + 1 || (j - i) >= (cols - rows)) {
                    System.out.print(ch + " ");
                } else {
                    System.out.print("  ");
                }
                ch++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPatten(4, 7);
    }
}
