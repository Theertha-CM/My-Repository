package polymorphism;

public class PolyChild extends PolyParent {
	
	public void display()
	{
		super.display();
		System.out.println("Child Class");
		
	}
	
	public int Add(int a, int b)
	{
		System.out.println(super.Add(5, 6)); // Since in Parent class we don't have syso statement. 
		return a+b+10;
	}


	@Override
	public void get(int a) {
		
		super.get(a); 
		//super.get(12); Like this, if we want we can change the value of 'a' to any other numbers. 	
		System.out.println(a); // to print the value of 'a' from child class.
	}

	public static void main(String[] args) {
		
		PolyChild obj = new PolyChild();
		obj.display();
		System.out.println(obj.Add(5, 6)); //syso given because we have only return statement in the method body.
		obj.get(10);

	}

}
