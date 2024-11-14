public class BitBasics {
    public static void evenOdd(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println("No. is Even");
        } else { // This case is if (n & bitMask) == 1
            System.out.println("No. is Odd");
        }
    }

    public static int getIthBit(int n, int position) {
        int bitMask = (1 << position);

        return (n & bitMask) == 0 ? 0 : 1;
    }

    public static int setIthBit(int n, int position) {
        int bitMask = 1 << position;
        return n | bitMask;
    }

    public static int clearIthBit(int n, int position) {
        int bitMask = ~(1 << position);
        return n & bitMask;
    }

    public static int clearLastIthBit(int n, int i) {
        int bitMask = (-1) << i; // (~0) << i;
        return n & bitMask;
    }

    public static int clearBitInRange(int bit, int i, int j) {
        int a = ((~0) << j + 1);
        int b = (1 << i) - 1;
        int bitMask = a | b;

        return bit & bitMask;

    }

    public static boolean checkPowerOf2(int n) {
        return (n & (n - 1)) == 0;
    }

    public static int countSetBits(int bit) {
        int count = 0;

        while (bit != 0) {
            if ((bit & 1) == 1) {
                count++;
            }
            bit >>= 1; // bit = bit >> 1;
        }

        return count;
    }

    public static int fastExponential(int a, int n) {
        int ans = 1;

        while (n != 0) {
            if ((n & 1) == 1) {
                ans *= a;
            }
            a *= a;
            n >>= 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(fastExponential(25, 2));
    }
}
