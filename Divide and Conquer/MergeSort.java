public class MergeSort {
    public static void printArray(int[] arr) {
        for (int e : arr) {
            System.out.print(e + " ");
        }
    }

    public static void mergeSort(int arr[], int si, int ei) {
        // Base case
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;
        mergeSort(arr, si, mid); // for left part
        mergeSort(arr, mid + 1, ei); // for right part

        // now time to merge the element
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        // make the temp array
        int temp[] = new int[ei - si + 1]; // why +1 b/c due to 0th based index
        int i = si; // first element of left part
        int j = mid + 1; // first element of right part
        int k = 0; // iterator of temp array

        // Now time to fill the temp array
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // extra part of left part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // extra part of right part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // Now time to copy temp into original arr
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 2, 5, 9 };
        mergeSort(arr, 0, arr.length - 1);
        printArray(arr);
    }
}
