import java.util.Arrays;
import java.util.Collections;

public class Sorting {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        printArray(arr);
    }

    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;
        }
        printArray(arr);
    }

    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prevPos = i - 1;

            // Exact Previous Position
            while (prevPos >= 0 && arr[prevPos] > curr) {
                arr[prevPos + 1] = arr[prevPos];
                prevPos--;
            }

            arr[prevPos + 1] = curr;
        }
        printArray(arr);
    }

    public static void inbuiltSort(Integer arr[]) {
        // Arrays.sort(arr);
        // Arrays.sort(arr, 2, 5);
        Arrays.sort(arr, Collections.reverseOrder());
        Arrays.sort(arr, 2, 5, Collections.reverseOrder());
    }

    public static int maxValue(int arr[]) {
        int n = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > n) {
                n = arr[i];
            }
        }
        return n;
    }

    public static void countingSort(int arr[]) {
        int range = maxValue(arr);

        int countArr[] = new int[range + 1];

        for (int i = 0; i < arr.length; i++) {
            countArr[arr[i]]++;
        }

        int j = 0;
        for (int i = 0; i < countArr.length; i++) {
            while (countArr[i] > 0) {
                arr[j] = i;
                j++;
                countArr[i]--;
            }
        }
        printArray(arr);
    }

    public static void main(String[] args) {
        int arr[] = { 5, 6, 4, 1, 3, 2 };
        countingSort(arr);
    }
}
