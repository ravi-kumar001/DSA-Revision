abstract class Demo {
    abstract void show();

    public void print() {
        System.out.println("Hello world");
    }
}

class Child extends Demo {

    // public void show() {
    //     System.out.println("show");
    // }
}

public class Abstract {
    public static void main(String[] args) {
        Child c = new Child();
        c.print();
    }
}
