package exceptionHandling;
import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the value: ");
            int x = sc.nextInt();

            if (x > 50) {
                System.out.println("Value is big");
            } else {
                System.out.println("Value is small");
            }
        }catch (java.util.InputMismatchException e) {
            System.out.println("Please enter a valid integer!");
        }

        sc.close();
    }
}
