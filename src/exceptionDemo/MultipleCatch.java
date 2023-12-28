package exceptionDemo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
	    	// write the risky code
			Scanner scan = new Scanner (System.in);
			
			System.out.println("Enter a number");
			
			int num1 = scan.nextInt();
			
            System.out.println("Enter another number");
			
			int num2 = scan.nextInt();
			
	    	int result = num1/num2;
	    	
	    }
			catch(ArithmeticException e) {
			 System.out.println("Please donnot enter a zero denominator");
				
			}
		   catch(InputMismatchException e) {
			
				 System.out.println("Please enter only integer value");
			
		    }
		   catch(Exception e) {
			
				 System.out.println("Please enter valid input number");
			
		}

	}

}
