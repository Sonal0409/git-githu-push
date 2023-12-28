package exceptionDemo;

public class FinallyBlockDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
	    	
			System.out.println("code to connect to DB");
			System.out.println("Connected to DB successfully");
		    
			String dbname = "java";
			dbname.contains("java");
	    	
	    }
			catch(Exception e) {
			
			 e.printStackTrace(); //prints exception, description and line number
			System.out.println("Connectivity to table in DB is incorrect"); ////prints exception, description 
				
			}
		
		finally{
			// write the code that will definatly run
			System.out.println("Close connect with DB");
			
		}
		

	}

}
