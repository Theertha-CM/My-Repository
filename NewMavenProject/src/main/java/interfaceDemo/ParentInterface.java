package interfaceDemo;

public interface ParentInterface {
	
	public static final int a = 10; //The value of a cannot be re-assigned because its final.
	
	int b=15; //Even if we didn't explicitly declare the variable as final, by default it is final. Cannot be re-assigned
	
	
	public abstract void display();
	
	public static void print()
	{
		System.out.println("Static method in the Interface");
		
	}
	
	default void show() 
	{
	
		System.out.println("Default method in the Interface");
		
	}
	

}
