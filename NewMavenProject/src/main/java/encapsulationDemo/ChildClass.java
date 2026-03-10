package encapsulationDemo;

public class ChildClass  {

	public static void main(String[] args) {
		
//No need for creating child class object. We can create parent class object and access all the getter and setter methods
		ParentClass obj = new ParentClass();
		obj.setName("Theertha");
		System.out.println(obj.getName());
		obj.setAge(28);
		System.out.println(obj.getAge());
				

	}

}
