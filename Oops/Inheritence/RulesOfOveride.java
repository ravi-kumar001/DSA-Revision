class Animal {
    void eat() {
        System.out.println("Animal Eat");
    }

    public void age() {
        System.out.println("Animal age");
    }
}

class Tiger extends Animal {
    public void eat() {
        System.out.println("Tiger hunts and Eat");
    }
    // public int age() {
    // System.out.println("Animal age");
    // }

    public void age(int x) {
        System.out.println("this age method is method overloading concept");
    }
}

public class RulesOfOveride {
    public static void main(String[] args) {

    }

}
