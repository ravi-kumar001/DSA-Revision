class Student {
    private int age;
    private String name;

    Student() {
        System.out.println("Default constructor is called");
        age = 18;
        name = "Ravi";
    }

    Student(String name) {
        this.name = name;
        age = 10;
    }

    Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    void display() {
        System.out.println(age);
        System.out.println(name);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Student st = new Student();
        st.display();

        Student st1 = new Student("Ravi");
        st1.display();

        Student st2 = new Student(20, "Rahul");
        st2.display();
    }
}
