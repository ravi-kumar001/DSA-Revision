public class ArmStrong {
    public static boolean armStrong(int n) {
        int sum = 0;
        int temp = n;
        if (n < 100) {
            return false;
        }
        while (temp != 0) {
            int ld = temp % 10;
            sum += ld * ld * ld;
            temp /= 10;
        }

        return sum == n ? true : false;
    }

    public static void main(String[] args) {
        System.out.println(armStrong(153));
    }

}
