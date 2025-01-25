class Test {
    int a = 2;
    String name = "Ravi";

    public static void main(String[] args) {
        Test obj1 = new Test(); // refrence variable
        Test obj2 = new Test(); // refrence variable

        System.out.println(obj1.a);
        System.out.println(obj1.name);

        obj1.name = "Rahul";
        System.out.println(obj1.name);

        System.out.println(obj2.a);
        System.out.println(obj2.name);

    }
}