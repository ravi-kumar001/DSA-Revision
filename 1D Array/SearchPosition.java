public class SearchPosition {

    public static int searchInsert(int[] nums, int target) {
        int start = 0; // we start our start with 0 based logic
        int end = nums.length - 1;
        int ans = nums.length; // When our target is bigger than all elements then our only else condition is executed and reached bounds so we simply returns num.length
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] >= target) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 3, 5, 6 };
        System.out.println(searchInsert(nums, 0));
    }

}
