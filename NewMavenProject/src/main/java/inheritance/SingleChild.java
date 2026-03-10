package inheritance;

public class SingleChild extends SingleParent {

	public void printing()
	{
		System.out.println("This is Child class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingleChild ob = new SingleChild();
		ob.printing();
		ob.display();
		ob.type();
		
		//This is just for info. Creating parent class object is not necessary.
		/*SingleParent obj = new SingleParent(); //We can create the parent class object also here in child class as it is inherited.But only methods from parent class can be called.
		obj.type();
		obj.display();*/
		
	}

}
