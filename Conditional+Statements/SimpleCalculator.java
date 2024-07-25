import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number => ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number => ");
        int b = sc.nextInt();
        System.out.println("What do you want operation => ");
        int ch = sc.next().charAt(0);

        switch (ch) {
            case '+':
                System.out.println("Sum is : => " + (a + b));
                break;

            case '-':
                System.out.println("Difference is : => " + (a - b));
                break;

            case '*':
                System.out.println("Difference is : => " + (a * b));
                break;

            case '/':
                System.out.println("Difference is : => " + (a / b));
                break;

            case '%':
                System.out.println("Difference is : => " + (a % b));
                break;

            default:
                break;
        }
    }
}
