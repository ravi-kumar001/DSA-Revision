import java.util.Arrays;

public class MinAbsPairs {
    public static void main(String[] args) {
        int A[] = { 4, 1, 8, 7 };
        int B[] = { 2, 3, 6, 5 };

        // our greedy approcah, we sort both array
        Arrays.sort(A);
        Arrays.sort(B);

        int ans = 0;

        for (int i = 0; i < A.length; i++) {
            ans += Math.abs(A[i] - B[i]);
        }

        System.out.println(ans);
    }
}
