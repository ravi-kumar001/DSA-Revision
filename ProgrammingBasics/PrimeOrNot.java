import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int flag = 1;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                flag++;
            }
        }
        if (flag == 1) {
            System.out.println("This number is Prime no.");
        } else {
            System.out.println("This is not prime no.");
        }

    }

}
