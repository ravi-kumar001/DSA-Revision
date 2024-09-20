public class SolidShape {
    public static void solidShape(int n) {
        // we use 1st method
        // we ignor white space who occuring in last so we ignore it
        // for (int i = n; i > 0; i--) {
        // for (int j = 0; j < i; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // in increasing order solid shape we use first method and we ignore white
        // spaces who comes in last
        // for (int i = 1; i < n; i++) {
        // for (int j = 0; j < i; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        //// in increasing order solid shape we use first method and we ignore white
        // spaces who comes in last
        // In first method we build logic for stars and spaces if spaces exists in
        //// biggining otherwise we ignored
        // Print Number
        // for (int i = 1; i < n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }

        // Increasing order Alphabet
        // char ch = 'A';
        // for (int i = 1; i < n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(ch + " ");
        // }
        // ch++;
        // System.out.println();
        // }

        // Make a solid Triangle Pyramid
        // For rows
        for (int i = 0; i < n; i++) {

            // for spaces
            for (int j = n - i; j > 0; j--) {
                System.err.print(" ");
            }

            // for stars
            for (int k = 0; k <= i; k++) {
                System.out.print(i + 1 + " ");
            }

            System.out.println();
        }

        // inverted pyramid where space is comming in starting we
        // use first method
        // for (int i = n; i >= 1; i--) {

        // // for spaces
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }

        // // for stars
        // for (int k = 1; k <= i; k++) {
        // System.out.print("* ");
        // }

        // System.out.println();
        // }

        // make inverted and rotated pyramid
        // for (int i = 1; i <= n; i++) {

        // // for spaces
        // for (int j = 1; j <= n - i; j++) {
        // System.err.print(" ");
        // }

        // // for stars
        // for (int k = 1; k <= i; k++) {
        // System.out.print("*");
        // }

        // System.out.println();
        // }

    }

    public static void main(String[] args) {
        solidShape(6);
    }
}
