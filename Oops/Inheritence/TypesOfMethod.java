class AeroPlane {
    public void fly() {
        System.out.println("Plane fly");
    }

    public void carry() {
        System.out.println("Plane also carry");
    }
}

class CargoPlane extends AeroPlane {
    // Lets make some specialised method
    void carryGoods() {
        System.out.println("Cargo Plane carry Goods");
    }
}

class PassengerPlane extends AeroPlane {
    // Lets overide method of parent class
    public void fly() {
        System.out.println("Passenger Plane fly under 3500m.");
    }
}

public class TypesOfMethod {
    public static void main(String[] args) {
        CargoPlane cg = new CargoPlane();
        cg.fly();
    }
}
