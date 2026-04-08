package conditionalStatement;

import java.util.Scanner;

public class ElseIF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.print("Enter First Number : ");
        a = sc.nextInt();
        System.out.print("Enter Second Number : ");
        b = sc.nextInt();

        if (a == b) {
            System.out.print(a + " & " + b + " both are equal");
        } else if (a > b) {
            System.out.println(a + " is greater");
        } else {
            System.out.println(b + " is greater");
        }
        sc.close();
    }
}
