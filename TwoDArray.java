import java.util.Scanner;

public class TwoDArray {

    public static void printMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void keySearch(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("(" + i + "," + j + ")");
                }
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return true;
        }
        boolean flag = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                flag = false;
            }
        }
        return flag;
    }

    public static void primeIndexs(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (isPrime(matrix[i][j])) {
                    System.out.println("(" + i + "," + j + ")");
                }
            }
            System.out.println();
        }
    }

    public static void spiralMatrix(int arr[][]) {
        int sr = 0;
        int er = arr.length - 1;
        int sc = 0;
        int ec = arr[0].length - 1;

        while (sr <= er && sc <= ec) {

            // top Row
            for (int j = sc; j <= ec; j++) {
                System.out.print(arr[sr][j] + " ");
            }
            sr++; // Move start row down

            // Last Col
            for (int i = sr; i <= er; i++) {
                System.out.print(arr[i][ec] + " ");
            }
            ec--; // Move end column left

            // Bottom Row (only if there is still a row to process)
            if (sr <= er) {
                for (int j = ec; j >= sc; j--) {
                    System.out.print(arr[er][j] + " ");
                }
                er--; // Move end row up
            }

            // First Column (only if there is still a column to process)
            if (sc <= ec) {
                for (int i = er; i >= sr; i--) {
                    System.out.print(arr[i][sc] + " ");
                }
                sc++; // Move start column right
            }
        }
    }

    public static void diagonalSum(int matrix[][]) {
        if (matrix.length != matrix[0].length) {
            System.out.println("Not Square Matrix");
            return;
        }
        int sum = 0;
        // BruteForce Approach we miss the corner case
        // for (int i = 0; i < matrix.length; i++) {
        // for (int j = 0; j < matrix[0].length; j++) {
        // if (i == j) {
        // sum += matrix[i][j];
        // } else if (i + j == matrix.length - 1) {
        // sum += matrix[i][j];
        // }
        // }
        // }

        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i]; // for primary diagonal
            if (i != matrix.length - 1 - i) {
                sum += matrix[i][matrix.length - 1 - i];
            }

        }
        System.out.println("Sum is => " + sum);
    }

    public static boolean searchSortedArray(int matrix[][], int key) {
        int row = 0;
        int column = matrix[0].length - 1;
        while (row < matrix.length && column >= 0) {
            if (matrix[row][column] == key) {
                System.out.println("(" + row + "," + column + ")");
                return true;
            } else if (key < matrix[row][column]) {
                column--;
            } else {
                row++;
            }
        }
        System.out.println("Key Not found");
        return false;
    }

    public static void main(String[] args) {
        // int matrix[][] = new int[3][3];

        // Scanner sc = new Scanner(System.in);

        // for (int i = 0; i < matrix.length; i++) {
        // for (int j = 0; j < matrix[0].length; j++) {
        // matrix[i][j] = sc.nextInt();
        // }
        // }

        // printMatrix(matrix);
        // primeIndexs(matrix);
        // keySearch(matrix, 4);

        int sMatrix[][] = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };
        searchSortedArray(sMatrix, 8);
    }
}
