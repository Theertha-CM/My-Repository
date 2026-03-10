package exceptionDemo;

public class ExceptionThrow {

	public static void main(String[] args) throws Exception {
		
		int age = 15;
		if(age>18)
		{
			System.out.println("Eligible for voting");
		}
		else 
		{
			 throw new Exception("Not Eligible for voting");
		}
		

	}

}
