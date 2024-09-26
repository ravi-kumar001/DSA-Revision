import java.util.Arrays;

public class FirstLastIndex {
    // public static int leftMostIndex(int nums[], int target) {
    // int start = 0;
    // int end = nums.length - 1;
    // int indexs = -1;
    // while (start <= end) {
    // int mid = start + (end - start) / 2;

    // if (nums[mid] == target) {
    // indexs = mid;
    // end = mid - 1;
    // } else if (nums[mid] < target) {
    // start = mid + 1;
    // } else {
    // end = mid - 1;
    // }
    // }
    // return indexs;
    // }

    // public static int rightMostIndex(int nums[], int target) {
    // int start = 0;
    // int end = nums.length - 1;
    // int indexs = -1;
    // while (start <= end) {
    // int mid = start + (end - start) / 2;

    // if (nums[mid] == target) {
    // indexs = mid;
    // start = mid + 1;
    // } else if (nums[mid] < target) {
    // start = mid + 1;
    // } else {
    // end = mid - 1;
    // }
    // }
    // return indexs;
    // }

    // public static int[] searchRange(int[] nums, int target) {

    // int leftIndex = leftMostIndex(nums, target);
    // int rightIndex = rightMostIndex(nums, target);

    // return new int[] { leftIndex, rightIndex };

    // }

    // Lets combine both function We prefer DRY Approach
    public static int findIndex(int nums[], int target, boolean leftSide) {
        int start = 0;
        int end = nums.length - 1;
        int indexs = -1;
        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                indexs = mid;
                if (leftSide) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return indexs;
    }

    public static int[] searchRange(int[] nums, int target) {

        int leftIndex = findIndex(nums, target, true); // Find leftmost index
        int rightIndex = findIndex(nums, target, false); // Find rightmost index

        return new int[] { leftIndex, rightIndex };

    }

    public static void main(String[] args) {

        int nums[] = { 5, 7, 7, 8, 8, 10 };
        int target = 6;

        System.out.println(Arrays.toString(searchRange(nums, target)));
    }
}
