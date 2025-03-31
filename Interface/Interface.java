interface A {
    int a = 6;

    void show();
}

interface Animal {
    void eat();
}

interface Mammal {
    void baby();
}

class Human implements Animal, Mammal { // ✅ Multiple inheritance via interfaces
    public void eat() {
        System.out.println("Humans eat food");
    }

    public void baby() {
        System.out.println("Humans give birth");
    }
}

public class Interface {
    public static void main(String[] args) {
        // System.out.println(A.a);
        // Human h = new Human();
        // h.eat();
        // h.baby();

        Animal a = new Human(); // ✅ Polymorphism
        a.eat();
        // a.baby(); ❌ Not allowed because Animal has no baby() method

        Mammal m = new Human();
        m.baby();
    }
}