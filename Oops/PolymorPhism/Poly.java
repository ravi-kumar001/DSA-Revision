class AeroPlane {
    public void takeOff() {
        System.out.println("AeroPlane can takeOff");
    }

    public void fly() {
        System.out.println("AeroPlane can fly");
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

class FighterPlane extends AeroPlane {
    // overide parent's method
    public void takeOff() {
        System.out.println("FighterPlane can takeOff");
    }

    public void fly() {
        System.out.println("FighterPlane can fly");
    }
}

public class Poly {
    public static void main(String[] args) {
        // First rule, object ref of child class can be stored as ref of parent class
        // CargoPlane cp = new CargoPlane();
        // AeroPlane ap = new AeroPlane();
        // ap = cp;
        
        // AeroPlane cp = new CargoPlane();
    }
}
