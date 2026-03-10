package superKeywordDemo;

public class SuperChild extends SuperParent{

	String colour = "Black";
	
	public void getData() // Super keyword should be used in an instance method or constructor.
	{
		System.out.println(super.colour); // this will print the value of parent class instance variable.
		super.getData(colour, colour);   // this will call the parent class instance method
		
		this.show();   //Just calling current class method using this keyword instead of calling from main method
		
	}
	
	public void show()
	{
		System.out.println("Demonstaring this keyword");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperChild obj = new SuperChild();
		System.out.println(obj.colour); // this will print child class instance variable. We can also simply call colour in print method.
		
		obj.getData();
	}

}
