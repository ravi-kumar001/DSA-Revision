class Human {
    int age;

    void sleep() {
        age = 18;
        System.out.println("Human are sleep");
        System.out.println(age);
    }
}

class Student extends Human {

}

public class Interitence {
    public static void main(String[] args) {
        Student s = new Student();

        s.sleep();
    }
}