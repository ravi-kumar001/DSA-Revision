public class TypePromootion {
    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';
        int number = b - a;
        System.out.println(number);

        char c = 'c';
        char d = 'd';
        byte e = 3;
        byte n = (byte) (c + d + e);
        System.out.println(n);

        int n1 = 5;
        float n2 = 6;
        long n3 = 7;
        double n4 = 8;
        double bigNumber = n1 + n2 + n3 + n4;
        System.out.println(bigNumber);

        byte n6 = 7;
        // byte bb = n6 * 2; Gives an error
        byte bb = (byte) (n6 * 2);
        System.out.println(bb);

    }

}
