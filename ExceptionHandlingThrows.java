package test;

import java.util.Scanner;

class Calc {
	void div() throws Exception{
		int a= 10/0;
	}
}
class Add{
	void addi() throws Exception{
		Scanner scan = new Scanner(System.in);
		int a1 = scan.nextInt();
		int b1 = scan.nextInt();
		int result = a1 + b1;
	}
}
public class ExceptionHandlingThrows {
	

	public static void main(String[] args) {
		
		Calc c = new Calc() ;
		
		try {
		c.div();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		Add ad = new Add();
		try {
			ad.addi();
		}
		catch(Exception s) {
			System.out.println(s);
		}
		finally {
			System.out.println("program ended");
		}
		

	}

}
