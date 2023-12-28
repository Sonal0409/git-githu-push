package exceptionDemo;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Exception: It is an unexpected and unwanted event which occurs during execution of your code
		// and it stops the further execution of the program
		
		String s1 = null;
		
		s1.length(); // java will give us an errorr,
		//because the method length() can not compute the value as String s1 is null
		// execution will stop here itself. no furthur code will be executed -> EXCEPTION

		System.out.println(s1);
		System.out.println("learning Selenium");
		System.out.println("learning selenium with Java");
		
		// > Correct the code => exception will be gone
		// > Handle the exception: Give an alternate way to continue the execution of the program
		
		// Whenever an exception occurs: following details you will see on the console
		   // > Exception Name 2. Description 3. stacktrace (line number)
	}

}
