import java.util.Arrays;

public class NextPermutation {

    public static void reverseArray(int nums[], int start) {
        int end = nums.length - 1;
        // Swap the elements from start to end
        while (start < end) {
            int temp1 = nums[start];
            nums[start] = nums[end];
            nums[end] = temp1;
            start++;
            end--;
        }
    }

    public static void nextPermutation(int[] nums) {
        int end = nums.length - 1;
        int cp = -1;
        // Find Critical Point
        for (int i = end; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                cp = i - 1;
                break;
            }
        }

        if (cp == -1) {
            reverseArray(nums, 0);
            return;
        }

        // Find Swapped Index
        int swappedIndex = cp;
        for (int i = end; i > cp; i--) {
            if (nums[i] > nums[cp]) {
                swappedIndex = i;
                break;
            }
        }

        // swap value
        int temp = nums[cp];
        nums[cp] = nums[swappedIndex];
        nums[swappedIndex] = temp;

        reverseArray(nums, cp + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 5 };
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }
}
