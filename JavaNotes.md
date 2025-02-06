In Java, we make a method `static` for several reasons:  

### 1. **To Call It Without Creating an Object**  
   - A static method belongs to the class rather than an instance (object) of the class.  
   - It can be called using the class name directly.  
   - **Example:**  
     ```java
     class MathUtils {
         static int square(int x) {
             return x * x;
         }
     }
     
     public class Main {
         public static void main(String[] args) {
             System.out.println(MathUtils.square(5)); // No object needed
         }
     }
     ```

### 2. **To Share a Common Utility or Helper Method**  
   - Static methods are commonly used for utility or helper functions that don’t depend on object state.  
   - **Example:**  
     ```java
     class MathUtils {
         static int add(int a, int b) {
             return a + b;
         }
     }
     ```
     - This method doesn’t rely on instance variables, so it can be `static`.

### 3. **To Work With Static Variables**  
   - A static method can access only **static variables** and **static methods** of a class.  
   - It cannot access instance variables directly.  
   - **Example:**  
     ```java
     class Counter {
         static int count = 0;

         static void increment() {
             count++;
         }
     }
     
     public class Main {
         public static void main(String[] args) {
             Counter.increment();
             System.out.println(Counter.count); // Output: 1
         }
     }
     ```

### 4. **To Improve Performance**  
   - Static methods are resolved at **compile time**, making them faster than instance methods (which require dynamic dispatch at runtime).

### 5. **To Define `main()` Method in Java**  
   - The `main()` method is always `static` because it serves as the entry point for execution and should be called without creating an object.  
   - **Example:**  
     ```java
     public class Main {
         public static void main(String[] args) {
             System.out.println("Hello, Java!");
         }
     }
     ```

### When **NOT** to Use `static`?  
- When a method **modifies or depends on instance variables**, it should **not** be static.
- If a method is expected to be **overridden** in subclasses, it should **not** be static.

Would you like an example where using `static` is incorrect? 🚀

### Example Where Using `static` is Incorrect  

#### **1. When a Method Depends on Instance Variables**  
If a method needs to access instance variables (which are specific to each object), it **should not** be `static`.  

**Incorrect Usage:**  
```java
class Person {
    String name;  // Instance variable

    static void setName(String newName) {
        name = newName;  // ❌ Compilation error: Cannot access non-static field 'name'
    }
}
```
**Why is this wrong?**  
- A `static` method belongs to the **class**, not an instance, so it **cannot access instance variables directly**.  
- `name` is an instance variable, and `setName()` is `static`, so Java doesn’t know which object’s `name` to update.

**Correct Version:**  
```java
class Person {
    String name;  // Instance variable

    void setName(String newName) {  // Not static
        this.name = newName;
    }
}
```

---

#### **2. When a Method Needs to Be Overridden**  
A `static` method **cannot** be overridden because it is bound to the class, not an instance.

**Incorrect Usage:**  
```java
class Parent {
    static void display() {
        System.out.println("Parent class");
    }
}

class Child extends Parent {
    static void display() {  // ❌ This is not overriding, it's method hiding
        System.out.println("Child class");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.display(); // Output: Parent class ❌ (Expected: Child class)
    }
}
```
**Why is this wrong?**  
- Since `display()` is `static`, method **hiding** occurs instead of overriding.  
- The method called depends on the **reference type** (`Parent`), not the actual object (`Child`).  

**Correct Version (Using Non-Static Method for Overriding):**  
```java
class Parent {
    void display() {
        System.out.println("Parent class");
    }
}

class Child extends Parent {
    @Override
    void display() {  // ✅ Correctly overriding
        System.out.println("Child class");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.display(); // Output: Child class ✅
    }
}
```

---

Would you like a real-world example of when **not** to use `static`? 🚀