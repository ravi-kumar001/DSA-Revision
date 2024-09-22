import java.util.Arrays;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[0];

        // Opimized Way
        // HashMap<Integer, Integer> map = new HashMap<>(); // Key: number, Value: index

        // for (int i = 0; i < nums.length; i++) {
        //     int complement = target - nums[i]; // Calculate complement
        //     if (map.containsKey(complement)) {
        //         return new int[]{map.get(complement), i}; // Return indices
        //     }
        //     map.put(nums[i], i); // Store the number and its index
        // }
        // return new int[0]; // Return an empty array if no solution is found
    }

    public static void main(String[] args) {
        int nums[] = { 2, 7, 11, 15 };
        System.out.println(Arrays.toString(twoSum(nums, 9)));
    }
}