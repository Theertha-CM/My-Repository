package exceptionDemo;

public class ExceptionExample {

	public static void main(String[] args) {
		
		//---------------------------ArithmeticException----------------------------
		
		try {
			 int x = 10;
			 int y = x/0; 		//ArithmeticException:/ by zero  exception
			 System.out.println(y); 
		}
		
		catch(ArithmeticException ae)
		{
			System.out.println("Arithmetic Exception is Handled");
			
		}
		
		finally
		{
			System.out.println("Important part of the code to be executed");
			// This code will execute always as it is inside finally block
		}
		
		System.out.println("After Finally Block"); // This will not execute if there is no catch block.
		
		//---------------------------ArrayIndexOutOfBoundsException----------------------------
		
		try {
				String list[] = {"A", "B", "C" }; 
				System.out.println(list[3]);    //ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
		}
		
		catch(ArrayIndexOutOfBoundsException ai)
		{
			System.out.println("ArrayIndexOutOfBounds Exception is Handled");
		}
		
		System.out.println("After try-catch Block"); // This will not execute if there is no catch block.
		
		
		//---------------------------NullPointerException----------------------------
		try {
		String name = null; 
		System.out.println(name.length());  //NullPointerException
		}
		
		catch(NullPointerException ne)
		{
			System.out.println("NullPointer Exception is Handled");
		}
		
		
		

	}

}
