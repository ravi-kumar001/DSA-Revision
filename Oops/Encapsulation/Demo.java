class Student {
    private int age;
    private String name;

    public void setData() {
        age = 18;
        name = "Ravi";
    }

    public void show() {
        System.out.println(name + " " + age);
    }
}

public class Demo {
    public static void main(String[] args) {
        Student obj = new Student();

        // obj.name = "Ravi";
        // obj.age = 18;

        obj.setData();
        obj.show();
    }
}
