import java.util.Arrays;
import java.util.Comparator;

public class Fractional_KnapSack {
    public static void main(String[] args) {
        int val[] = { 60, 100, 120 };
        int weight[] = { 10, 20, 30 };
        int capacity = 50;

        double ratio[][] = new double[val.length][2];

        for (int i = 0; i < val.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = val[i] / (double) weight[i];
        }

        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
        int ans = 0;

        for (int i = ratio.length - 1; i >= 0; i--) {
            int index = (int) ratio[i][0];
            if (capacity >= weight[index]) {
                ans += val[index];
                capacity -= weight[index];
            } else {
                ans += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }

        System.out.println(ans);
    }
}
