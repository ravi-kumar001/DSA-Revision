interface Car {
    void drive();
}

// class B implements A {
// public void drive() {
// System.out.println("driving...");
// }
// }

public class AnonyMousClass {
    public static void main(String[] args) {
        Car obj = new Car() {
            public void drive() {
                System.out.println("driving...");
            }
        };
        obj.drive();
    }
}
