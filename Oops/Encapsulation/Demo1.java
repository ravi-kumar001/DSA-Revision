class Student {
    private int age;
    private String name;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

public class Demo1 {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.setAge(15);
        System.out.println(obj.getAge());
        obj.setName("Ravi");
        System.out.println(obj.getName());
    }
}
