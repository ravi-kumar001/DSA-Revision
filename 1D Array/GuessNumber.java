public class GuessNumber {

    public static int guess(int num) {
        int pick = 2;
        if (num > pick) {
            return -1;
        } else if (num < pick) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int guessNumber(int n) {
        int start = 1;
        int end = n;
        int ans = 1;

        while (start <= end) { // <= b/c we also store condtion of when start == end
            int mid = start + (end - start) / 2;
            if (guess(mid) == 0) {
                ans = mid;
                break;
            } else if (guess(mid) == 1) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(guessNumber(2));
    }
}
