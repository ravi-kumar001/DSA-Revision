import java.util.Arrays;

public class SquaresArray {
    // public static int[] sortedSquares(int[] nums) {
    //     for (int i = 0; i < nums.length; i++) {
    //         nums[i] = nums[i] * nums[i];
    //     }
    //     Arrays.sort(nums);
    //     return nums;
    // }

    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];

        int first = 0;
        int end = n - 1;
        int position = n - 1; // we put digit through last index

        while (first <= end) {
            int firstSquared = nums[first] * nums[first];
            int endSquared = nums[end] * nums[end];

            if (firstSquared > endSquared) {
                ans[position] = firstSquared;
                first++;
            } else {
                ans[position] = endSquared;
                end--;
            }

            position--;
        }

        return ans;

    }

    public static void main(String[] args) {
        int nums[] = { -7, -3, 2, 3, 11 };
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }
}
