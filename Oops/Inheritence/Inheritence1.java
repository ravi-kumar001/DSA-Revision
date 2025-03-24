class Human1 {
    int age;
    private String name;

    public Human1() {
        System.out.println("Human1 constructor called");
    }

    void sleep() {
        age = 18;
        System.out.println("Human are sleep");
        System.out.println(age);
        System.out.println("Name is " + name);
    }
}

class Student1 extends Human1 {

}

public class Inheritence1 {
    public static void main(String[] args) {
        Student1 s = new Student1();
        s.sleep();
    }
}
