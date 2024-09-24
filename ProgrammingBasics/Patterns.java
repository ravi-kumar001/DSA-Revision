public class Patterns {
    public static void shapes(int n) {

        // Hollow Rhombus
        // for (int i = 0; i < n; i++) { // Logic for row
        // for (int j = 0; j < n; j++) { // Logic for col
        // if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
        // System.out.print("* ");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // Try to make A shape
        // for (int i = 0; i < n; i++) { // Logic for row
        // for (int j = 0; j < n; j++) { // Logic for col
        // if (i == 0 || j == 0 || i == (n - 1) / 2 || j == n - 1) {
        // System.out.print("* ");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // Try to make H shape
        // for (int i = 0; i < n; i++) { // Logic for row
        // for (int j = 0; j < n; j++) { // Logic for col
        // if (j == 0 || j == n - 1 || i == (n - 1) / 2) {
        // System.out.print("* ");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // try to make I E F Shape
        // for (int i = 0; i < n; i++) { // Logic for row
        // for (int j = 0; j < n; j++) { // Logic for col
        // if (i == 0 || i == n - 1 || j == (n - 1) / 2) {
        // System.out.print("* ");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }
        // System.out.println();

        // for (int i = 0; i < n; i++) { // Logic for row
        // for (int j = 0; j < n; j++) { // Logic for col
        // if (i == 0 || j == 0 || i == n - 1 || i == (n - 1) / 2) {
        // System.out.print("* ");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }
        // System.out.println();

        // for (int i = 0; i < n; i++) { // Logic for row
        // for (int j = 0; j < n; j++) { // Logic for col
        // if (i == 0 || j == 0 || i == (n - 1) / 2) {
        // System.out.print("* ");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // System.out.println();

        // Lets Try A shape
        // for (int i = 0; i < n; i++) { // Logic for row
        // for (int j = 0; j < n; j++) { // Logic for col
        // if (i == 0 && j > 0 && j < (n - 1) ||
        // j == 0 && i > 0 ||
        // j == n - 1 && i > 0 ||
        // i == (n - 1) / 2) {
        // System.out.print("* ");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // Lets try D Shape
        // for (int i = 0; i < n; i++) { // Logic for row
        // for (int j = 0; j < n; j++) { // Logic for col
        // if (i == 0 && j < (n - 1) || j == 0 || i == n - 1 && j < (n - 1)
        // || j == n - 1 && i > 0 && i < n - 1) {
        // System.out.print("* ");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // Lets try to T shape
        // for (int i = 0; i < n; i++) { // Logic for row
        // for (int j = 0; j < n; j++) { // Logic for col
        // if (i == 0 || j == (n - 1) / 2 && i > 0) {
        // System.out.print("* ");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // Lets Try X print we put this in 2d matrix then try to soleve it this is
        // square matrix
        // for (int i = 0; i < n; i++) { // Logic for row
        // for (int j = 0; j < n; j++) { // Logic for col
        // if (i == j || i + j == n - 1) {
        // System.out.print("* ");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // Lets try to make square with diagonal
        // for (int i = 0; i < n; i++) { // Logic for row
        // for (int j = 0; j < n; j++) { // Logic for col
        // if (i == 0 || j == 0 || i == n - 1 || j == n - 1 || i == j || i + j == (n -
        // 1)) {
        // System.out.print("* ");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // Lets try to make hollow Rhombus
        // for (int i = 0; i < n; i++) { // Logic for row
        // for (int j = 0; j < n; j++) { // Logic for col
        // if (i + j == (n - 1) / 2 || i - j == (n - 1) / 2 || j - i == (n - 1) / 2
        // || i + j == (n - 1) + (n - 1) / 2) {
        // System.out.print("* ");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // Lets try hollo Rhombus inside square
        // for (int i = 0; i < n; i++) { // Logic for row
        // for (int j = 0; j < n; j++) { // Logic for col
        // if (i == 0 || j == 0 || i == n - 1 || j == n - 1 || i + j == (n - 1) / 2 || i
        // - j == (n - 1) / 2
        // || j - i == (n - 1) / 2
        // || i + j == (n - 1) + (n - 1) / 2) {
        // System.out.print("* ");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // Lets try to solve fully Squared but inside hollow rhombus is empty
        // for (int i = 0; i < n; i++) { // Logic for row
        // for (int j = 0; j < n; j++) { // Logic for col
        // if (i == 0 && j < (n - 1) / 2 || i + j <= (n - 1) / 2 || j == 0 && i < (n -
        // 1) / 2
        // || i == 0 && j >= (n - 1) / 2 || j == n - 1 && i <= (n - 1) / 2 || j - i >=
        // (n - 1) / 2
        // || j == 0 && i >= (n - 1) / 2 || i == n - 1 && j <= (n - 1) / 2 || i - j >=
        // (n - 1) / 2
        // || i == n - 1 && j >= (n - 1) / 2
        // || j == n - 1 && i >= (n - 1) / 2 || i + j >= (n - 1) + (n - 1) / 2) {
        // System.out.print("* ");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // Lets try to make hollow Rhombus
        // for (int i = 0; i < n; i++) { // Logic for row
        // for (int j = 0; j < n; j++) { // Logic for col
        // if (i + j == (n - 1) / 2 || i - j == (n - 1) / 2 || j - i == (n - 1) / 2
        // || i + j == (n - 1) + (n - 1) / 2) {
        // System.out.print("* ");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // Diamond Print
        // for (int i = 0; i < n; i++) { // Logic for row
        // for (int j = 0; j < n; j++) { // Logic for col
        // if (i == 0 && j < (n - 1) / 2 || i + j <= (n - 1) / 2 || j == 0 && i < (n -
        // 1) / 2
        // || i == 0 && j >= (n - 1) / 2 || j == n - 1 && i <= (n - 1) / 2 || j - i >=
        // (n - 1) / 2
        // || j == 0 && i >= (n - 1) / 2 || i == n - 1 && j <= (n - 1) / 2 || i - j >=
        // (n - 1) / 2
        // || i == n - 1 && j >= (n - 1) / 2
        // || j == n - 1 && i >= (n - 1) / 2 || i + j >= (n - 1) + (n - 1) / 2) {
        // System.out.print(" ");
        // } else {
        // System.out.print("* ");
        // }
        // }
        // System.out.println();
        // }

        // Lets try to make Z Shape
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n; j++) {
        // if (i == 1 || i == n || i + j == n + 1) {
        // System.out.print("* ");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // Hollow inverted Half Pyramid
        // for (int i = 1; i <= n; i++) {
        // int element = i;
        // for (int j = 1; j <= n; j++) {
        // if (i == 1 || j == 1 || i + j == n + 1 && (i != 0 || j != 0)) {
        // System.out.print(element + " ");
        // } else {
        // System.out.print(" ");
        // }
        // element++;
        // }
        // System.out.println();
        // }

        // Lets try Hollow Full Pyramid
        for (int i = 0; i < n; i++) {

            // for spaces
            for (int j = n - i; j > 0; j--) {
                System.err.print(" ");
            }

            // for stars
            for (int k = 0; k <= i; k++) {
                if (k == 0 || k <= i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

    }

    public static void main(String[] args) {
        shapes(5);
    }
}
