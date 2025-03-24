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

class Airport {
    public void poly(AeroPlane ref) {
        ref.takeOff();
        ref.fly();
        System.out.println("----------------------------");
    }
}

public class PolyMorPhism {
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();
        PassengerPlane pp = new PassengerPlane();
        FighterPlane fp = new FighterPlane();

        Airport a = new Airport();
        a.poly(cp);
        a.poly(pp);
        a.poly(fp);
    }
}
