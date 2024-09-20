public class PlusOne {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] plusOne(int arr[]) {
        int ld = arr.length - 1;

        for (int i = ld; i >= 0; i--) {
            if (arr[i] != 9) {
                arr[i]++;
                return arr;
            }
            arr[i] = 0;
        }

        int newArr[] = new int[arr.length + 1];
        newArr[0] = 1;
        return newArr;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 2 };
        printArray(plusOne(arr));
    }
}