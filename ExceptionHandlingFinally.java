package test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingFinally {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		try {
			System.out.println("Enter a");
			int a = scan.nextInt();
			System.out.println("Enter b");
			int b = scan.nextInt();
			
			int result = a + b;
			System.out.println("Result :"+result);
		}
		catch(InputMismatchException e) {
			System.out.println("error: "+e);
		}
		finally {
			System.out.println("program ended");
		}
		

	}

}
