public class Shapes {

    public static void invertedHalfPyramid(int n) {
        // i use space & rows method
        for (int i = n; i > 0; i--) {
            // for stars
            for (int j = 0; j < i; j++) {
                System.out.print(j + 1 + " ");
            }
            System.out.println();
        }
    }

    public static void floydsTriangle(int n) {
        // i use space & rows method

        // How many rows
        int n2 = 1;
        for (int i = 0; i < n; i++) {
            // for stars
            for (int j = 0; j <= i; j++) {
                System.out.print(n2 + " ");
                n2++;
            }
            // space is neglegible b/c this comes in end (No code required for this code)
            System.out.println();
        }
    }

    public static void zeroOneTriangle(int n) {
        // i use space & rows method
        for (int i = 0; i < n; i++) {
            // for stars
            for (int j = 0; j <= i; j++) {
                if ((i + j) % 2 == 0)
                    System.out.print("1 ");
                else
                    System.out.print("0 ");
            }
            // Spaces is neglegible
            System.out.println();
        }
    }

    public static void butterfly(int n) {
        // 1st Half
        for (int i = 1; i <= n; i++) {
            // for stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // for spaces
            for (int k = 1; k <= 2 * (n - i); k++) {
                System.out.print(" ");
            }

            // for Stars
            for (int l = 1; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2nd Half
        for (int i = n; i >= 1; i--) {
            // for stars
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            // for spaces
            for (int k = 2 * (n - i); k >= 1; k--) {
                System.out.print(" ");
            }

            // for Stars
            for (int l = i; l >= 1; l--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void solidRhombus(int n) {
        for (int i = 1; i <= n; i++) {

            // for spaces
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            // for stars
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollowRhobus(int n) {
        for (int i = 0; i < n; i++) {
            // For Spaces
            for (int k = 0; k <= (n - i); k++) {
                System.out.print(" ");
            }
            // For Stars
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void diamond(int n) {
        // 1st Half
        for (int i = 1; i <= n; i++) {
            // for spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }

            // for stars
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2nd Half
        for (int i = n - 1; i >= 1; i--) {
            // for spaces
            for (int j = (n - i); j >= 1; j--) {
                System.out.print(" ");
            }

            // for stars
            for (int k = (2 * i) - 1; k >= 1; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void numberPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            // for spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }

            // for elements
            for (int k = 1; k <= i; k++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void palindromicNumbers(int n) {
        // for how many rows
        for (int i = 1; i <= n; i++) {
            // for spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }

            // for decending order
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            // for accending order
            for (int k = 2; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }

    public static void fullPyramid(int n) {
        // for how many rows
        for (int i = 1; i <= n; i++) {
            // for spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }

            int element = i;
            // for decending order
            for (int j = i; j >= 1; j--) {
                System.out.print(element);
                element++;
            }

            int element2 = (2 * i) - 2;
            // for accending order
            for (int k = 2; k <= i; k++) {
                System.out.print(element2);
                element2--;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        fullPyramid(5);
    }
}