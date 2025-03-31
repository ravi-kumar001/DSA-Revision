class A {
    void print() {
        System.out.println("Printing...");
    }

    class B { // Member class
        void show() {
            System.out.println("show method of member class");
        }
    }
    static class C { // static class
        void show() {
            System.out.println("show method of static class");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        A obj = new A();
        A.B obj1 = obj.new B();
        A.C obj2 = new A.C();
        obj2.show();
    }
}
