class Student {
    private int age;
    private String name;

    Student() {
        System.out.println("Zero parameterised contructor by programmer ");
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

public class Demo1 {
    public static void main(String[] args) {
        Student st = new Student();
        st.display();

        Student st1 = new Student(18, "Ravi");

        st1.display();
    }
}