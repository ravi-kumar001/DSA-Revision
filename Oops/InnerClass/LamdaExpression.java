interface Car {
    void drive(int avg);
}

public class LamdaExpression {
    public static void main(String[] args) {
        Car c = avg -> System.out.println("Drive... " + avg);
        c.drive(17);
    }
}
