import java.util.HashMap;

public class MaxPointsLine {
    public static int maxPoints(int[][] points) {
        int max = 0;
        for (int x = 0; x < points.length; x++) {
            HashMap<Double, Integer> map = new HashMap<>();
            for (int y = 0; y < points.length; y++) {
                if (x == y) { // condition of same point
                    continue;
                }
                double slope;
                if (points[x][0] == points[y][0]) {
                    slope = Double.POSITIVE_INFINITY;
                } else {
                    slope = (points[y][1] - points[x][1]) / (double) (points[y][0] - points[x][0]);
                }
                map.put(slope, map.getOrDefault(slope, 0) + 1);
                max = Math.max(max, map.get(slope));
            }
        }

        return max + 1; // We add origin point

    }

    public static void main(String[] args) {
        int points[][] = { { 2, 3 }, { 3, 3 }, { -5, 3 } };
        System.out.println(maxPoints(points));
    }
}
