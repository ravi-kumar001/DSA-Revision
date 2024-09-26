public class MinRotated {
    public static int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) { // <= not used here b/c in last iteration start == end and this is the min.
                              // element condition
            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[end]) {
                start = mid + 1; // Minimum is in the right half
            } else if (nums[mid] < nums[end]) {
                end = mid; // Minimum is in the left half (including mid)
            }
        }

        return nums[start]; // nums[end]
    }

    public static void main(String[] args) {
        int nums[] = { 3, 4, 5, 1, 2 };
        System.out.println(findMin(nums));
    }
}
