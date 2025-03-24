abstract class AeroPlane {
    abstract public void takeOff(); // Not use in child class so we can make as abstract

    abstract public void fly(); // Not use in child class so we can make as abstract

    public void landing() {
        System.out.println("Plane is landing");
    }
}

class CargoPlane extends AeroPlane {
    // overide parent's method
    public void takeOff() {
        System.out.println("CargoPlane can takeOff");
    }

    public void fly() {
        System.out.println("CargoPlane can fly");
    }

    public void alert() {
        System.out.println("Alert something went wrong");
    }
}

class PassengerPlane extends AeroPlane {
    // overide parent's method
    public void takeOff() {
        System.out.println("PassengerPlane can takeOff");
    }

    public void fly() {
        System.out.println("PassengerPlane can fly");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        AeroPlane a = new CargoPlane();
        a.landing();
        ((CargoPlane) a).alert();
    }
}
