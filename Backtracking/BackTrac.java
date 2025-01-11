public class BackTrac {
    public static void backTrac(int arr[], int i, int val) {
        if (i == arr.length) {
            printArr(arr);
            return;
        }
        arr[i] = val;
        backTrac(arr, i + 1, val + 1);
        arr[i] = arr[i] - 2;
    }

    public static void printArr(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[6];
        backTrac(arr, 0, 1);
        System.out.println();
        printArr(arr);
    }
}