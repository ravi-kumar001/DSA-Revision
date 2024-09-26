import java.util.Arrays;

public class EatingBananas {
    public static long timeCalculator(int[] piles, long mid) {
        long time = 0; // I Use long to avoid overflow
        // for (int i = 0; i < piles.length; i++) {
        // if (piles[i] < mid) {
        // time += 1;
        // } else if (piles[i] % mid == 0) {
        // time += piles[i] / mid;
        // } else {
        // time += (piles[i] / mid) + 1; // Add 1 for the remaining part
        // }
        // }
        for (int pile : piles) {
            // This ensures ceil(pile / mid) using integer division
            time += (pile + mid - 1) / mid;
        }
        return time;
    }

    public static int minEatingSpeed(int[] piles, int h) {
        long start = 1; // we assume that he eats 1b/h
        long end = Arrays.stream(piles).max().getAsInt(); // in wrost case she eats maxPiles/h

        int ans = 0;

        while (start <= end) {
            long mid = start + (end - start) / 2;

            if (timeCalculator(piles, mid) <= h) {
                ans = (int) mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] piles = { 805306368, 805306368, 805306368 };
        System.out.println(minEatingSpeed(piles, 1000000000));
    }
}
