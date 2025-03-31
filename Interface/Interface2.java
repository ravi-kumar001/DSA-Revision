interface Computer {
   void compileCode();
}

class Laptop implements Computer {
    public void compileCode() {
        System.out.println("You got 5 errors");
    }
}

class Desktop implements Computer {
    public void compileCode() {
        System.out.println("You got 5 errors, faster");
    }
}

class Developer {
    // Laptop l = new Laptop();

    public void buildApps(Computer com) {
        System.out.println("Building Apps");
        com.compileCode();
    }
}

public class Interface2 {
    public static void main(String[] args) {
        // Laptop lap = new Laptop();
        // Desktop desk = new Desktop();
        // Developer dev = new Developer();
        // dev.buildApps(desk);

        Computer com = new Desktop();
        Developer dev = new Developer();
        dev.buildApps(com);
    }
}
