package test;

import java.util.Scanner;


	
class InvalidAgeException extends Exception{
	public InvalidAgeException(String message) {
	super(message);
	}
}


class AgeValidator{
	void checkAge(int age) {
		try {
		if(age < 18) {
			throw new InvalidAgeException("Age below 18");
			}else {
				System.out.println("Age above 18");
			}
		}
		catch(InvalidAgeException e) {
			System.out.println(e);
		}
	}
}
	
public class ExceptionHandlingThrow {
	
		public static void main(String[] args) {
		System.out.println("Enter Age :"); 
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		
		AgeValidator a1 = new AgeValidator();
		a1.checkAge(a);		
		
		
		
	}

}
