public class SingleElementSA {

    // Brute Force Approach o(n)
    // public static int singleNonDuplicate(int[] nums) {
    // int ans = 0;
    // for (int n : nums) {
    // ans ^= n;
    // }
    // return ans;
    // }

    public static int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (mid % 2 != 0) {
                mid--; // b/c duplicate element start with even index except non duplicate element
            }

            if (nums[mid] == nums[mid + 1]) {
                start = mid + 2; // Move in right half
            } else {
                end = mid; // Move in left Half and we include mid b/c maybe mid is last index of their
                           // pairs
            }
        }

        return nums[start]; // nums[end]

    }

    public static void main(String[] args) {
        int nums[] = { 1, 1, 2, 3, 3, 4, 4, 8, 8 };
        System.out.println(singleNonDuplicate(nums));
    }
}
