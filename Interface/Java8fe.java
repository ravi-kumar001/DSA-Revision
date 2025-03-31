interface A {
    void show();

    default void config() {
        System.out.println("In config");
    }

    static void abc() {
        System.out.println("abc");
    }
}

class B implements A {
    public void show() {
        System.out.println("show");
    }
}

public class Java8fe {
    public static void main(String[] args) {
        A obj = new B();
        obj.config();
        obj.show();
        A.abc();
    }
}
