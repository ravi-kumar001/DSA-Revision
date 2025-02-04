class Demo {
    static int a;
    static int b;

    int m;
    int n;

    static {
        a = 10;
        b = 20;
        System.out.println("control in static block");
    }

    {

        m = 100;
        n = 200;
        System.out.println("control in non static block");
    }

    static void dis1() {
        System.out.println("Value of static var " + a);
        System.out.println("Value of static var " + b);
    }

    void dis2() {
        System.out.println("Value of instace var " + m);
        System.out.println("Value of instace var " + n);
    }
}

public class Launch {
    public static void main(String[] args) {
        Demo d = new Demo();

        Demo.dis1();
        d.dis2();
        d.dis1();
    }
}
