import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class DiagonallyTraverse {
    public static int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int ans[] = new int[m * n];
        int row = 0;
        int col = 0;
        boolean up = true; // if this is false then down
        int idx = 0;

        while (row < m && col < n) {

            if (up) { // go up
                while (row > 0 && col < n - 1) {
                    ans[idx++] = mat[row][col];
                    row--;
                    col++;
                }

                // edge case
                ans[idx++] = mat[row][col];
                if (col == n - 1) {
                    row++;
                } else {
                    col++;
                }

            } else { // go down
                while (row < m - 1 && col > 0) {
                    ans[idx++] = mat[row][col];
                    row++;
                    col--;
                }

                // edge case
                ans[idx++] = mat[row][col];
                if (row == m - 1) {
                    col++;
                } else {
                    row++;
                }
            }

            up = !up; // toggle the direction
        }
        return ans;
    }

    // Solve it by using hashmap
    public static int[] findDiagonalOrderByHashMap(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int ans[] = new int[m * n];
        int idx = 0;

        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>(); // Key is i + j;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int key = i + j;

                map.putIfAbsent(key, new ArrayList<>());

                map.get(key).add(mat[i][j]);
            }
        }

        System.out.println(map.values());

        // Traverse the diagonals in the required order
        for (int k = 0; k <= m + n - 2; k++) {
            List<Integer> diagonal = map.get(k);
            if (k % 2 == 0) {
                // Reverse the order for even diagonals (up direction)
                for (int l = diagonal.size() - 1; l >= 0; l--) {
                    ans[idx++] = diagonal.get(l);
                }
            } else {
                // Keep the order for odd diagonals (down direction)
                for (int l = 0; l < diagonal.size(); l++) {
                    ans[idx++] = diagonal.get(l);
                }
            }
        }

        return ans;

    }

    public static void main(String[] args) {
        int mat[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println(Arrays.toString(findDiagonalOrderByHashMap(mat)));
    }
}