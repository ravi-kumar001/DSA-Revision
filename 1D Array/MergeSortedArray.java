public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Initialize two pointer
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1; // size of num1 -1

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i]; // we insert kth position of our element
                i--;
            } else {
                nums1[k] = nums1[j];
                j--;
            }
            k--;
        }

        // if some element remaining in num2
        while (j >= 0) {
            nums1[k] = nums1[j];
            j--;
            k--;
        }
    }

    public static void main(String[] args) {
        int nums1[] = { 1, 2, 3, 0, 0, 0 };
        int nums2[] = { 2, 5, 6 };

        int m = 3;
        int n = nums2.length;

        MergeSortedArray merger = new MergeSortedArray();
        merger.merge(nums1, m, nums2, n);
    }
}
