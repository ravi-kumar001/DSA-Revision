import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class SortDiagonally {
    public static int[][] diagonalSort(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int ans[][] = new int[m][n];

        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>(); // Key is j - i;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int key = j - i;

                map.putIfAbsent(key, new ArrayList<>());

                map.get(key).add(mat[i][j]);
            }
        }

        System.out.println(map.values());

        // Traverse the diagonal and sort the diagonal
        for (int k = -m + 1; k < n; k++) {
            List<Integer> diagonal = map.get(k);

            if (diagonal != null) {
                Collections.sort(diagonal);

                int idx = 0;

                // push back the ans array
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        if (j - i == k) {  // Here k is denoting the key of map
                            ans[i][j] = diagonal.get(idx++);
                        }
                    }
                }
            }
        }

        return ans;

    }

    public static void main(String[] args) {
        int mat[][] = { { 3, 3, 1, 1 }, { 2, 2, 1, 2 }, { 1, 1, 1, 2 } };
    }

} 
