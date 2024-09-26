public class MinimumSpeedArrive {

    // Bruteforce Approach is check 1 to 10^7 speed which one is eqaul to given hour
    // (Big time complexity)

    // Function for calculate total Time
    public static double calculateTotaltime(int dist[], int speed) {
        double totalTime = 0.0;
        int n = dist.length;
        for (int i = 0; i < n - 1; i++) {
            double t = (double) dist[i] / (double) speed;
            totalTime += Math.ceil(t);
        }
        totalTime += (double) dist[n - 1] / (double) speed;
        return totalTime;
    }

    // Lets apply Binary search for exact spped not need to check whole speed (1 to
    // 10^7)
    public static int minSpeedOnTime(int[] dist, double hour) {
        int start = 1;
        int end = (int) 1e7; // 10^7
        int minSpeed = -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (calculateTotaltime(dist, mid) <= hour) {
                minSpeed = mid;
                end = mid - 1; // Look for a smaller speed and why -1 b/c we already store mid
            } else {
                start = mid + 1; // we increae our speed and why we +1 b/c we already check <= condition
            }
        }
        return minSpeed;
    }

    public static void main(String[] args) {
        int dist[] = { 1, 1, 100000 };
        System.out.println(minSpeedOnTime(dist, 2.01));
    }
}
