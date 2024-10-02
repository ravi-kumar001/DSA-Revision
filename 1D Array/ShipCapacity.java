public class ShipCapacity {
    public static int totalDays(int[] weights, int midCapacity) {
        int days = 1; // Atleast 1 days required
        int currentWeight = 0;

        for (int weight : weights) {
            if (currentWeight + weight > midCapacity) {
                days++;
                currentWeight = weight;
            } else {
                currentWeight += weight;
            }
        }

        return days;
    }

    public static int shipWithinDays(int[] weights, int days) {
        int start = 0;
        int end = 0;

        for (int weight : weights) {
            start = Math.max(start, weight); // min. capacity is Max element of array
            end += weight; // max. capacity is sum of all elements of array
        }

        int ans = end; // initialise max. capacity

        while (start <= end) {
            int midCapacity = start + (end - start) / 2;
            if (totalDays(weights, midCapacity) <= days) {
                ans = midCapacity;
                end = midCapacity - 1;
            } else {
                start = midCapacity + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] weights = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int days = 5;
        System.out.println(shipWithinDays(weights, days));

    }
}
