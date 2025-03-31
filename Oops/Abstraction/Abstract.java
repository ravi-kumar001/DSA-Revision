abstract class B {
    abstract void show(); // Abstract method
}

class Test extends B {
     // Overriding the abstract method 
     @Override
     void show() {
         System.out.println("Implementation of show() in Test class");
     }
}

public class Abstract {
    public static void main(String[] args) {
        // B obj = new B(); // ❌ Compilation error: Cannot instantiate an abstract class
        B obj = new Test(); // ✅ Allowed: Referencing subclass object
        obj.show();
    }
}
