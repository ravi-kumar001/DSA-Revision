class Calc {
    public void print(byte a) {
        System.out.println("byte " + a);
    }

    public void print(short a) {
        System.out.println("short " + a);
    }

    public void print(int a) {
        System.out.println("int " + a);
    }

    public void print(double a) {
        System.out.println("double " + a);
    }

    public void print(char a) {
        System.out.println("char " + a);
    }
}

public class Demo {
    public static void main(String[] args) {
        Calc obj = new Calc();
        byte b = 2;
        obj.print('c');
    }
}