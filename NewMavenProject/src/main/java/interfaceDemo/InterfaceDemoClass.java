package interfaceDemo;

public class InterfaceDemoClass implements ParentInterface {

	public static void main(String[] args) {
		
		ParentInterface ob = new InterfaceDemoClass(); //Creating reference of Interface
		
		ob.display(); //Calling interface abstract method using reference
		
		ParentInterface.print(); //Invoking static method using InterfaceName.method();
		
		ob.show(); 
		
		System.out.println(a + b ); //Will add the two Variables declared in the interface
		
		/*InterfaceDemoClass obj = new InterfaceDemoClass(); //Creating Object of Childclass
		obj.display(); //Calling with child class object */
	}

	@Override
	public void display() {
		
		System.out.println("Interface Program");
	}

}
