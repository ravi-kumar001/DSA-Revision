// final class Animal {
//     public void sleep() {
//         System.out.println("Animals sleep");
//     }
// }

class Animal {
    final double pi = 3.14;

    final public void sleep() {
        // pi = 4;
        System.out.println("Animals sleep");
    }
}

class Dog extends Animal {
    // public void sleep () {

    // }
}

public class Final {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sleep();
    }
}
