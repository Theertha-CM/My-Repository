package interfaceDemo;

public class MultipleInherClass implements MultipleInterfaceParent1, MultipleInterfaceParent2 {

	

	@Override
	public void show() {
		
		System.out.println("Parent Interface 2");
		
	}

	@Override
	public void display() {
		
		System.out.println("Parent Interface 1");
		
	}
	
	@Override
	public void print() {
		 //If we have methods having same name and parameters in both Interfaces, define the body of both here in one single method overridden.
		System.out.println("Print method in Parent Interface 1");
		System.out.println("Print method in Parent Interface 2");
	}
	
	public static void main(String[] args) {
		//Creating child class object to invoke the properties of both the interfaces. If we are creating references of Interfaces, then we should create two references for each Interface.
		MultipleInherClass ob = new MultipleInherClass(); 
		ob.display();
		ob.show();
		ob.print();
		

		}

	

}
