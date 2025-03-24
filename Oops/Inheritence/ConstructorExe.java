class Demo {
    int a, b;

    public Demo() { // zero-parameterised contructor
        System.out.println("zero-parameterised contructor of parent class");
    }

    public Demo(int x, int y) { // parameterised contructor
        this();
        System.out.println("parameterised contructor of parent class");
        a = x;
        b = y;
    }
}

class Demo1 extends Demo {
    int a, b;

    public Demo1() { // zero-parameterised contructor
        // in this line by default super(); method called
        System.out.println("zero-parameterised contructor of child class");
    }

    public Demo1(int x, int y) { // parameterised contructor
        this();
        System.out.println("parameterised contructor of child class");
        a = x;
        b = y;
    }
}

public class ConstructorExe {
    public static void main(String[] args) {
        Demo1 d = new Demo1(10, 20);
        // System.out.println();
    }
}
