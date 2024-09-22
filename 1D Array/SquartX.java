public class SquartX {
    public static int mySqrt(int x) {
        if (x == 0)
            return 0;

        int start = 1;
        int end = x;
        int ans = 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            long midSquared = (long) mid * mid;
            if (midSquared == x) {
                return mid;
            } else if (midSquared < x) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(2147483647));
    }
}
