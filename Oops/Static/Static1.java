public class Static1 {
    static int age;

    static {
        age = 18;
        System.out.println(age);
        System.out.println("Static method pahle");
    }

    public static void main(String[] args) {
        System.out.println("Main method");
    }
}