package abstraction;

public class AbstractChild extends AbstractClassParent{
	
	AbstractChild()
	{
		super(10,15); //Invoking parent abstract class paramterized constructor
		
	}
	
	public int getData(int age)
	{
		return age;
	}
	
	@Override
	public void display() {
		System.out.println("Abstract Method");
		
	}

	@Override
	public String details(String name) {
		// TODO Auto-generated method stub
		return name;
	}

	public static void main(String[] args) {
		
		//Creating a reference of abstract parent class using Child class. Because we can't instantaite Abstract class.
		AbstractClassParent obj = new AbstractChild();
		
		//We can use child class object to invoke all the methods of Abstract parent class
		AbstractChild ob = new AbstractChild(); 
		
		//Invoking abstract methods using Abstract parent class reference
		obj.display(); 
		
		System.out.println(obj.details("Theertha"));  
		
		obj.print();
		
		// Invoking child class method with child class object. We can't invoke child class methods using abstract class reference.
		System.out.println(ob.getData(10)); 

	}

	

}
