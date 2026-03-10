package superKeywordDemo;

public class SuperConsChild extends SuperConsParent{
	
	SuperConsChild()
	{  
		/*If we use super(parameters) keyword, it will execute the parameterized parent class constructor. 
		  So if we want to use the non-parameterized constructor, create another constructor in child class.
		  Use super() keyword as the first statement.
		  And with the help of another object, we can call the non-parameterized constructor.*/
		
		super("Parameterized Parent Class constructor"); 
		System.out.println("Child class constructor");
		
	}
	
	SuperConsChild(int a)
	{
		super();
		System.out.println("Second Child class constructor " + a);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SuperConsChild obj = new SuperConsChild(); //If you don’t write super(), Java automatically calls it by default (if the parent has a no-argument constructor).
		SuperConsChild obj1 = new SuperConsChild(2); //This statement is used to call the non-parameterized constructor of parent class.
		
	
	}

}
