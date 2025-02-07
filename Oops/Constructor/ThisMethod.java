class Student {
    private int age;
    private String name;

    Student() {
        System.out.println("Zero parameterised contructor by programmer ");
    }

    Student(int age, String name) {
        // this();
        this.age = age;
        this.name = name;
    }

    Student(int age) {
        this(22, "Ravi");
        this.age = age;
    }

    void display() {
        System.out.println(age);
        System.out.println(name);
    }
}

public class ThisMethod {
    public static void main(String[] args) {
        // Student st = new Student();
        // st.display();

        // Student st1 = new Student(18, "Ravi");
        Student st1 = new Student(18);

        st1.display();
    }
}
