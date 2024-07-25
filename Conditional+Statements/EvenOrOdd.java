import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {

        System.out.println("Please Enter a number : -> ");
        try (Scanner sc = new Scanner(System.in)) {
            int number = sc.nextInt();

            if(number % 2 == 0){
                System.out.println("Number is even");
            }else{
                System.out.println("Number is odd");
            }
        }


    }
}
