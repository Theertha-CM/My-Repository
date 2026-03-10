package abstraction;

public abstract class AbstractClassParent {
	
	/*public AbstractClassParent() // Non parameterized constructor
	{
		System.out.println("This is Abstact Class Constructor");
	}*/
	
	public AbstractClassParent(int a, int b) 
	{
		System.out.println(a+b);
	}
	public abstract void display(); //Abstract method
	
	public abstract String details(String name);
	
	public void print()
	{
		System.out.println("This is a non-abstract method");
	}
	
	
	
	

}
