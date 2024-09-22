public class ArrayBasics {
    public static int duplicateNumber(int arr[]) {
        int first = 0;
        int second = 0;
        do {
            first++;
            second += 2;
            if (first >= arr.length) {
                first = (first + 1) - arr.length;
            }
            if (second >= arr.length) {
                second = (second + 1) - arr.length;
            }
        } while (arr[first] != arr[second]);

        return arr[first];
    }

    public static void main(String[] args) {
        int nums[] = { 3,1,3,4,2 };
        System.out.println(duplicateNumber(nums));
    }
}
