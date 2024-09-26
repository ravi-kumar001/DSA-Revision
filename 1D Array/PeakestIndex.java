public class PeakestIndex {

    // BruteForce Approach o(n)
    public static int peakIndexInMountainArray1(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i + 1]) {
                return i;
            }
        }
        return -1;
    }

    // Binary Search Approach o(logn)
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1; // b/c mid is also smaller than mid + 1
            } else {
                end = mid; // mid may be greater
            }
        }

        return start; // end b/c in the last both lies on peakest index
    }

    public static void main(String[] args) {
        int arr[] = { 0, 10, 5, 2 };
        System.out.println(peakIndexInMountainArray1(arr));
    }
}
