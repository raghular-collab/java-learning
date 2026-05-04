package test;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ExceptionHandling {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int a = scan.nextInt();

            System.out.print("Enter second number: ");
            int b = scan.nextInt();

            int result = a + b;
            System.out.println("Result: " + result);

        } catch (InputMismatchException e) {
            System.out.println(e);
        } 

    }
}