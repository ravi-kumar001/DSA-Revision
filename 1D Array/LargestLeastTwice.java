public class LargestLeastTwice {

    public static int dominantIndex(int[] nums) {
        // First find largest and second largest element
        int firstLargest = 0;
        int secondLargest = Integer.MIN_VALUE; // not need to initialise index b/c if firstLargest found then we simply
                                               // update the value of secondLargest

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[firstLargest]) {
                secondLargest = nums[firstLargest]; // first update the secondLargest then firstLargest
                firstLargest = i;
            } else if (nums[i] > secondLargest) { // if num[i] not greater than firstLargest then check with
                                                  // secondLargest if this is greater then update this
                secondLargest = nums[i];
            }
        }

        if (nums[firstLargest] >= 2 * secondLargest) {
            return firstLargest;
        }

        return -1;
    }

    public static void main(String[] args) {
        int nums[] = { 3, 6, 1, 0 };
        System.out.println(dominantIndex(nums));
    }
}
