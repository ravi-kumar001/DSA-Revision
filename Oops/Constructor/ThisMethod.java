class Student {
    private int age;
    private String name;
    private String collegeName;

    Student() {
        System.out.println("Zero parameterised constructor by programmer");
        this.age = 22;
        this.name = "An";
        this.collegeName = "Giet";
    }

    Student(int age, String name) {
        this(age, name, "Giet"); // Explicitly calling constructor with 3 parameters
    }

    Student(int age) {
        this(age, "Ravi", "Giet"); // Explicitly calling constructor with 3 parameters
    }

    Student(int age, String name, String collegeName) {
        this.age = age;
        this.name = name;
        this.collegeName = collegeName;
    }

    void display() {
        System.out.println(age);
        System.out.println(name);
        System.out.println(collegeName);
    }
}

public class ThisMethod {
    public static void main(String[] args) {
        Student st1 = new Student(18);
        st1.display();
    }
}
