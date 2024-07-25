import java.util.Scanner;

public class JavaScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // System.out.println(a * b);

        // double pi = 3.14;
        // double radius = sc.nextDouble();
        
        // System.out.println(pi * radius * radius);

        // Type Conversion

        // float number = sc.nextInt();
        // System.out.println(number);


        float marks = 25.9999f;
        int mark = (int)marks;
        System.out.println(mark);

       char ch = 'a';
       int number2 = ch;
       System.out.println(number2);
    }
}
