public class RotateImage {

    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        // Make Transpose
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // make each Row Reverse
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                // Swap elements in rows
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j]; // we change col element in single row so here we use [i] constant
                matrix[i][n - 1 - j] = temp;
            }
        }

        // Print Array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        rotate(matrix);
    }
}
