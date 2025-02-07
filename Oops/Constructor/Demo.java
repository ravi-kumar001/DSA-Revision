class Student {
    private int age;
    private String name;

    Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    void display() {
        System.out.println(age);
        System.out.println(name);
    }
}

public class Demo {
    public static void main(String[] args) {
        Student st = new Student(18, "Ravi");
        st.display();
    }
}
